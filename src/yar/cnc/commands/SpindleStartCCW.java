package yar.cnc.commands;

import yar.cnc.AbstractCommand;

public class SpindleStartCCW extends AbstractCommand
{

  @Override
  public String getGCodeValue()
  {
    return "M4";
  }

}
