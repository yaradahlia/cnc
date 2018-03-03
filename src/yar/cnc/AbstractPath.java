package yar.cnc;

public abstract class AbstractPath
{

  public static AbstractPath get(Program program) throws WorkAreaTooSmallException
  {
    AbstractPath path = null;
    switch(program.getPathType())
    {
      case ZIG_ZAG:
      {
        path = new PathZigZag(program);
        break;
      }
    }
    return path;
  }

  private final Program program;
  private Point currentPoint = null;

  protected AbstractPath(Program program) throws WorkAreaTooSmallException
  {
    this.program = program;
    boolean widthTooSmall = program.getWorkArea().getWidth() < program.getTool().getToolDiameter();
    boolean heightTooSmall = program.getWorkArea().getHeight() < program.getTool().getToolDiameter();
    if(widthTooSmall || heightTooSmall)
    {
      throw new WorkAreaTooSmallException();
    }
  }

  public Point getFirstPoint()
  {
    double startPosition = program.getTool().getHalfOfDiameter();
    return new Point(startPosition, startPosition, program.getSource().getDepthAt(startPosition, startPosition));
  }

  public double getNextPosition(double currentPosition)
  {
    return currentPosition + program.getSpeed().getFeed();
  }

  public boolean hasNext()
  {
    boolean next = true;
    if(currentPoint != null)
    {
      boolean roomOnX = getNextPosition(currentPoint.getX()) < program.getWorkArea().getWidth();
      boolean roomOnY = getNextPosition(currentPoint.getY()) < program.getWorkArea().getHeight();
      next = roomOnX || roomOnY;
    }
    return next;
  }

  public Point next()
  {
    if(currentPoint == null)
    {
      currentPoint = getFirstPoint();
    }
    else
    {
      currentPoint = getNextPoint(currentPoint);
    }
    return currentPoint;
  }

  protected abstract Point getNextPoint(Point currentPoint);

  public static class WorkAreaTooSmallException extends Exception
  {

    public WorkAreaTooSmallException()
    {
    }

  }
}
