package cnc.commands;

import cnc.AbstractCommand;
import lombok.Getter;

@Getter
public class Pause extends AbstractCommand
{
  private static final String GCODE = "M4 P %.2f";

  private final double seconds;

  public Pause(double seconds)
  {
    this.seconds = seconds;
  }

  @Override
  public String getGCodeValue()
  {
    return String.format(GCODE, seconds);
  }

}
