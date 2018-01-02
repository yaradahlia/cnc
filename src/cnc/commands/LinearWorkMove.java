package cnc.commands;

public class LinearWorkMove extends AbstractCommand
{
  private final double x;
  private final double y;
  private final double z;

  public LinearWorkMove(double x, double y, double z)
  {
    this.x = x;
    this.y = y;
    this.z = z;
  }

}
