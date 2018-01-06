package cnc.commands;

import cnc.AbstractCommand;

public class SpindleStartCW extends AbstractCommand
{

  @Override
  public String getGCodeValue()
  {
    return "M3";
  }

}
