package yar.cnc;

import yar.cnc.commands.Comment;
import yar.cnc.commands.macros.SafeMoveToOrigin;
import yar.cnc.commands.macros.StartCommands;
import java.util.LinkedList;
import java.util.List;
import yar.types.PathType;

public class CommandGenerator
{
  private final Program program;

  public CommandGenerator(Program program)
  {
    this.program = program;
  }

  public List<AbstractCommand> generateCommands() throws AbstractPath.WorkAreaTooSmallException
  {
    List<AbstractCommand> commands = new LinkedList<>();
    commands.add(new Comment(program.getName()));
    commands.addAll(new StartCommands(program.getSpeed()).getCommands());
    commands.addAll(new SafeMoveToOrigin(null, null, program.getSafeZ(), program.getSpeed()).getCommands());
    // FIXME Iacob add comment about work area, tool and speeds

    AbstractPath path = AbstractPath.get(program);
    //commands.add(new )     // FIXME Iacob work
    return commands;
  }
}
