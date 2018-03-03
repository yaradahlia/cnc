package yar.cnc.commands.macros;

import yar.cnc.AbstractCommand;
import yar.cnc.AbstractMacro;
import yar.cnc.Speed;
import yar.cnc.commands.FeedSpeed;
import yar.cnc.commands.PositioningAbsolute;
import yar.cnc.commands.SpindleSpeed;
import yar.cnc.commands.WorkPlane;
import yar.cnc.commands.WorkUnits;
import java.util.LinkedList;
import java.util.List;
import lombok.Getter;
import yar.types.WorkPlaneType;
import yar.types.WorkUnitsType;

@Getter
public class StartCommands extends AbstractMacro
{
  private final Speed speed;

  public StartCommands(Speed speed)
  {
    this.speed = speed;
  }

  @Override
  public List<AbstractCommand> getCommands()
  {
    List<AbstractCommand> commands = new LinkedList<>();
    commands.add(new PositioningAbsolute());
    commands.add(new WorkUnits(WorkUnitsType.MM));
    commands.add(new WorkPlane(WorkPlaneType.XY));
    commands.add(new FeedSpeed(speed.getWorkSpeed()));
    commands.add(new SpindleSpeed(speed.getSpindleSpeed()));
    return commands;
  }

}
