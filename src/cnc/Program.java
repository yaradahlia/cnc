package cnc;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import types.PathType;

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
  private final double safeZ;
  private final PathType pathType;

  public Program(String name, MeasureUnitType measureUnitType, Area workArea, Speed speed, Tool tool, InputStream source, double safeZ, PathType pathType) throws IOException
  {
    this.name = name;
    this.measureUnitType = measureUnitType;
    this.workArea = workArea;
    this.speed = speed;
    this.tool = tool;
    this.source = AbstractSource.get(workArea, speed, tool, source);
    this.safeZ = safeZ;
    this.pathType = pathType;
  }

  public List<AbstractCommand> generateProgram() throws AbstractPath.WorkAreaTooSmallException
  {
    return new CommandGenerator(this).generateCommands();
  }
}
