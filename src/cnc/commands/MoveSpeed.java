package cnc.commands;

import lombok.Getter;

@Getter
public class MoveSpeed extends AbstractCommand
{
  private final double speed;

  public MoveSpeed(double speed)
  {
    this.speed = speed;
  }

}
