package yar.cnc;

import lombok.Getter;
import yar.lang.MicroMetre;
import yar.lang.MilliMetre;

@Getter
public class Speed
{
  private final MicroMetre feed;
  private final MilliMetre plungeSpeed;
  private final MilliMetre workSpeed;
  private final int spindleSpeed;

  public Speed(MicroMetre feed, MilliMetre plungeSpeed, MilliMetre workSpeed, int spindleSpeed)
  {
    this.feed = feed;
    this.plungeSpeed = plungeSpeed;
    this.workSpeed = workSpeed;
    this.spindleSpeed = spindleSpeed;
  }


  public long getZSpeed()
  {
    return workSpeed.getLength() / 2;
  }
}
