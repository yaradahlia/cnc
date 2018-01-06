package cnc.commands;

import cnc.AbstractCommand;

public class CoolantMistStart extends AbstractCommand
{

  @Override
  public String getGCodeValue()
  {
    return "M7";
  }

}
