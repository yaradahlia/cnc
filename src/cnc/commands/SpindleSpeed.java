package cnc.commands;

import lombok.Getter;

@Getter
public class SpindleSpeed extends AbstractCommand
{
  private final int rpm;

  public SpindleSpeed(int rpm)
  {
    this.rpm = rpm;
  }

}
