package cnc.commands;

import cnc.AbstractCommand;

public class SpindleStartCCW extends AbstractCommand
{

  @Override
  public String getGCodeValue()
  {
    return "M4";
  }

}
