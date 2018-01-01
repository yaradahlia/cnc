package cnc;

import java.io.IOException;
import java.io.InputStream;
import lombok.Getter;

@Getter
public abstract class AbstractSource
{
  private static final double PRECISION = 10.0;

  public static AbstractSource get(Area workArea, Speed speed, Tool tool, InputStream source) throws IOException
  {
    return new DepthMapSource(workArea, speed, tool, source, PRECISION);
  }

  private final Area workArea;
  private final Speed speed;
  private final Tool tool;
  private final double precision;

  protected AbstractSource(Area workArea, Speed speed, Tool tool, double precision)
  {
    this.workArea = workArea;
    this.speed = speed;
    this.tool = tool;
    this.precision = precision;
  }

  public abstract double getPointDepth(double value);

  public abstract Point getPoint(double x, double y);
}
