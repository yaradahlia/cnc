package yar.cnc;

import lombok.Getter;
import yar.lang.MicroMetre;

@Getter
public class Point
{
  private final MicroMetre x;
  private final MicroMetre y;
  private final MicroMetre z;

  public Point(MicroMetre x, MicroMetre y, MicroMetre z)
  {
    this.x = x;
    this.y = y;
    this.z = z;
  }

}
