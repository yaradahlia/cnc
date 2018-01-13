package cnc.commands.macros;

import cnc.AbstractCommand;
import cnc.AbstractMacro;
import cnc.Speed;
import cnc.commands.FeedSpeed;
import cnc.commands.LinearWorkMove;
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
