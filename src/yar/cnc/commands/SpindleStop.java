package yar.cnc.commands;

import yar.cnc.AbstractCommand;

public class SpindleStop extends AbstractCommand
{

  @Override
  public String getGCodeValue()
  {
    return "M5";
  }

}
