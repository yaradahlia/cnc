package yar.cnc.commands;

import yar.cnc.AbstractCommand;

public class CoolantMistStart extends AbstractCommand
{

  @Override
  public String getGCodeValue()
  {
    return "M7";
  }

}
