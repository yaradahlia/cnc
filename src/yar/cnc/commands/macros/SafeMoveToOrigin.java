package yar.cnc.commands.macros;

import yar.cnc.AbstractCommand;
import yar.cnc.AbstractMacro;
import yar.cnc.Speed;
import yar.cnc.commands.MoveToWorkOrigin;
import java.util.LinkedList;
import java.util.List;
import lombok.Getter;

@Getter
public class SafeMoveToOrigin extends AbstractMacro
{
  private final Double currentX;
  private final Double currentY;
  private final Double safeZ;
  private final Speed speed;

  public SafeMoveToOrigin(Double currentX, Double currentY, Double safeZ, Speed speed)
  {
    this.currentX = currentX;
    this.currentY = currentY;
    this.safeZ = safeZ;
    this.speed = speed;
  }

  @Override
  public List<AbstractCommand> getCommands()
  {
    List<AbstractCommand> commands = new LinkedList<>();
    commands.addAll(new ZWorkMove(currentX, currentY, safeZ, speed).getCommands());
    commands.add(new MoveToWorkOrigin(safeZ));
    commands.add(new MoveToWorkOrigin());
    return commands;
  }

}
