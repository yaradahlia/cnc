package yar.cnc;

import lombok.Getter;

@Getter
public class Tool
{
  private final double toolDiameter;
  private final double toolWorkHeight;

  public Tool(double toolDiameter, double toolWorkHeight)
  {
    this.toolDiameter = toolDiameter;
    this.toolWorkHeight = toolWorkHeight;
  }

  public double getHalfOfDiameter()
  {
    return getToolDiameter() / 2;
  }
}
