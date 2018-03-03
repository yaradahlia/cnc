package yar.cnc.commands;

import yar.cnc.AbstractCommand;

public class PositioningAbsolute extends AbstractCommand
{

  @Override
  public String getGCodeValue()
  {
    return "G90";
  }

}
