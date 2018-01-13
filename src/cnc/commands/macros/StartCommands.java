package cnc.commands.macros;

import cnc.AbstractCommand;
import cnc.AbstractMacro;
import cnc.Speed;
import cnc.commands.FeedSpeed;
import cnc.commands.PositioningAbsolute;
import cnc.commands.SpindleSpeed;
import cnc.commands.WorkPlane;
import cnc.commands.WorkUnits;
import java.util.LinkedList;
import java.util.List;
import lombok.Getter;
import types.WorkPlaneType;
import types.WorkUnitsType;

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
