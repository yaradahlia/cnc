package yar.cnc.commands;

import yar.cnc.AbstractCommand;
import lombok.Getter;

@Getter
public class SpindleSpeed extends AbstractCommand
{

  private static final String GCODE = "S %d";

  private final int rpm;

  public SpindleSpeed(int rpm)
  {
    this.rpm = rpm;
  }

  @Override
  public String getGCodeValue()
  {
    return String.format(GCODE, rpm);
  }

}
