package yar.cnc.commands;

import yar.cnc.AbstractCommand;

public class SpindleStartCW extends AbstractCommand
{

  @Override
  public String getGCodeValue()
  {
    return "M3";
  }

}
