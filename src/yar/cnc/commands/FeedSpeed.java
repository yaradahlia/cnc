package yar.cnc.commands;

import yar.cnc.AbstractCommand;
import lombok.Getter;

@Getter
public class FeedSpeed extends AbstractCommand
{

  private static final String GCODE = "F %.2f";

  private final double speed;

  public FeedSpeed(double speed)
  {
    this.speed = speed;
  }

  @Override
  public String getGCodeValue()
  {
    return String.format(GCODE, speed);
  }

}
