package yar.cnc;

import lombok.Getter;

@Getter
public class Area
{
  private final double width;
  private final double height;
  private final double thickness;

  public Area(double width, double height, double thickness)
  {
    this.width = width;
    this.height = height;
    this.thickness = thickness;
  }

}
