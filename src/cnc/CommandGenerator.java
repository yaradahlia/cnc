package cnc;

import cnc.commands.Comment;
import cnc.commands.macros.SafeMoveToOrigin;
import cnc.commands.macros.StartCommands;
import java.util.LinkedList;
import java.util.List;

public class CommandGenerator
{
  private final Program program;

  public CommandGenerator(Program program)
  {
    this.program = program;
  }

  public List<AbstractCommand> generateCommands()
  {
    List<AbstractCommand> commands = new LinkedList<>();
    commands.add(new Comment(program.getName()));
    commands.addAll(new StartCommands(program.getSpeed()).getCommands());
    commands.addAll(new SafeMoveToOrigin(null, null, program.getSafeZ(), program.getSpeed()).getCommands());
    // FIXME Iacob add comment about work are, tool and speeds
    //commands.add(new )     // FIXME Iacob work
    return commands;
  }
}
