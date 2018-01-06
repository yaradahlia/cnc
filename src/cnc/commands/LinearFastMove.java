package cnc.commands;

import cnc.AbstractCommand;
import lombok.Getter;

@Getter
public class LinearFastMove extends AbstractCommand
{

  private static final String GCODE = "G0 X %.2f Y %.2f Z %.2f";

  private final double x;
  private final double y;
  private final double z;

  public LinearFastMove(double x, double y, double z)
  {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  @Override
  public String getGCodeValue()
  {
    return String.format(GCODE, getX(), getY(), getZ());
  }

}
