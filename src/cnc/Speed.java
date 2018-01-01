package cnc;

import lombok.Getter;

@Getter
public class Speed
{
  private final double feed;
  private final double plungeSpeed;
  private final double workSpeed;
  private final double spindleSpeed;

  public Speed(double feed, double plungeSpeed, double workSpeed, double spindleSpeed)
  {
    this.feed = feed;
    this.plungeSpeed = plungeSpeed;
    this.workSpeed = workSpeed;
    this.spindleSpeed = spindleSpeed;
  }

}
