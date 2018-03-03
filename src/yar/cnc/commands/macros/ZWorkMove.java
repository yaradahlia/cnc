package yar.cnc.commands.macros;

import yar.cnc.AbstractCommand;
import yar.cnc.AbstractMacro;
import yar.cnc.Speed;
import yar.cnc.commands.FeedSpeed;
import yar.cnc.commands.LinearWorkMove;
import java.util.LinkedList;
import java.util.List;

public class ZWorkMove extends AbstractMacro
{
  private final Double x;
  private final Double y;
  private final Double z;
  private final Speed speed;

  public ZWorkMove(Double x, Double y, Double z, Speed speed)
  {
    this.x = x;
    this.y = y;
    this.z = z;
    this.speed = speed;
  }

  @Override
  public List<AbstractCommand> getCommands()
  {
    List<AbstractCommand> commands = new LinkedList<>();
    commands.add(new FeedSpeed(speed.getZSpeed()));
    commands.add(new LinearWorkMove(x, y, z));
    commands.add(new FeedSpeed(speed.getWorkSpeed()));
    return commands;
  }

}
