package yar.cnc.commands;

import yar.cnc.AbstractCommand;

public class PositioningRelative extends AbstractCommand
{

  @Override
  public String getGCodeValue()
  {
    return "G91";
  }

}
