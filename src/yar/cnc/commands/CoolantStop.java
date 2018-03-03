package yar.cnc.commands;

import yar.cnc.AbstractCommand;

public class CoolantStop extends AbstractCommand
{

  @Override
  public String getGCodeValue()
  {
    return "M9";
  }

}
