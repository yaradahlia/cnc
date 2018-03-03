package yar.cnc.commands;

import yar.cnc.AbstractCommand;
import yar.types.FeedRateType;

public class FeedRateMode extends AbstractCommand
{
  private final FeedRateType feedRateType;

  public FeedRateMode(FeedRateType feedRateType)
  {
    this.feedRateType = feedRateType;
  }

  @Override
  public String getGCodeValue()
  {
    String mode = null;
    switch(feedRateType)
    {
      case INVERSE_TIME_MODE:
      {
        mode = "G93";
        break;
      }
      case UNITS_PER_MINUTE:
      {
        mode = "G94";
        break;
      }
      case UNITS_PER_REVOLUTION:
      {
        mode = "G95";
        break;
      }
    }
    return mode;
  }

}
