package cnc.commands;

import cnc.AbstractCommand;

public class PositioningRelative extends AbstractCommand
{

  @Override
  public String getGCodeValue()
  {
    return "G91";
  }

}
