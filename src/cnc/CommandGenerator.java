package cnc;

import cnc.commands.Comment;
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
    // FIXME Iacob add comment about work are, tool and speeds
    commands.add(new )     // FIXME Iacob work
    return commands;
  }
}