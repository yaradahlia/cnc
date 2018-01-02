package cnc;

import cnc.commands.AbstractCommand;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

@lombok.Getter

/**
 * FIXME Iacob: - tool shape: ball, end, angles, etc.
 *
 */
public class Program
{
  private final String name;
  private final MeasureUnitType measureUnitType;
  private final Area workArea;
  private final Speed speed;
  private final Tool tool;
  private final AbstractSource source;

  public Program(String name, MeasureUnitType measureUnitType, Area workArea, Speed speed, Tool tool, InputStream source) throws IOException
  {
    this.name = name;
    this.measureUnitType = measureUnitType;
    this.workArea = workArea;
    this.speed = speed;
    this.tool = tool;
    this.source = AbstractSource.get(workArea, speed, tool, source);
  }

  public List<AbstractCommand> generateProgram()
  {
    List<AbstractCommand> commands = new LinkedList<>();
    // FIXME Iacob work here
    return commands;
  }
}
