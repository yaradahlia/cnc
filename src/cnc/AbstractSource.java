package cnc;

import java.io.IOException;
import java.io.InputStream;
import lombok.Getter;

@Getter
public abstract class AbstractSource
{

  public static final double MIN_FEED_SPEED = 0.01D;

  public static AbstractSource get(Area workArea, Speed speed, Tool tool, InputStream source) throws IOException
  {
    return new DepthMapSource(workArea, speed, tool, source);
  }

  private final Area workArea;
  private final Speed speed;
  private final Tool tool;
  private final double precision;

  protected AbstractSource(Area workArea, Speed speed, Tool tool)
  {
    this.validate(workArea, speed, tool);
    this.workArea = workArea;
    this.speed = speed;
    this.tool = tool;
    this.precision = this.calculatePrecision(speed);
  }

  private void validate(Area workArea, Speed speed, Tool tool)
  {
    if(Double.compare(workArea.getHeight(), 0.0D) == 0 || Double.compare(workArea.getHeight(), 0.0D) == -1)
    {
      throw new RuntimeException("Work area's height must be greater than zero.");
    }
    if(Double.compare(workArea.getWidth(), 0.0D) == 0 || Double.compare(workArea.getWidth(), 0.0D) == -1)
    {
      throw new RuntimeException("Work area's width must be greater than zero.");
    }
    if(Double.compare(workArea.getThickness(), 0.0D) == 0 || Double.compare(workArea.getThickness(), 0.0D) == -1)
    {
      throw new RuntimeException("Work area's thickness must be greater than zero.");
    }
    if(speed.getFeed() < MIN_FEED_SPEED)
    {
      throw new RuntimeException("Feed speed must be greater than " + MIN_FEED_SPEED);
    }
    if(Double.compare(tool.getToolDiameter(), 0.0D) == 0 || Double.compare(tool.getToolDiameter(), 0.0D) == -1)
    {
      throw new RuntimeException("Tool's diameter must be greater than zero.");
    }
    if(Double.compare(tool.getToolWorkHeight(), 0.0D) == 0 || Double.compare(tool.getToolWorkHeight(), 0.0D) == -1)
    {
      throw new RuntimeException("Tool's work height must be greater than zero.");
    }
  }

  private double calculatePrecision(Speed speed)
  {
    double prec = 0.1D;
    if(speed.getFeed() < prec)
    {
      prec = MIN_FEED_SPEED;
    }
    return prec;
  }

  public abstract double getPointDepth(double value);

  public abstract Point getPoint(double x, double y);
}
