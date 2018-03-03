package yar.cnc.commands;

import yar.cnc.AbstractCommand;

public class CoolantFloodStart extends AbstractCommand
{

  @Override
  public String getGCodeValue()
  {
    return "M8";
  }

}
