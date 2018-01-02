package cnc.commands;

import lombok.Getter;

@Getter
public class LinearFastMove extends AbstractCommand
{
  private final double x;
  private final double y;
  private final double z;

  public LinearFastMove(double x, double y, double z)
  {
    this.x = x;
    this.y = y;
    this.z = z;
  }

}
