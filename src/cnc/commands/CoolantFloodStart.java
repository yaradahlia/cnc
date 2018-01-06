package cnc.commands;

import cnc.AbstractCommand;

public class CoolantFloodStart extends AbstractCommand
{

  @Override
  public String getGCodeValue()
  {
    return "M8";
  }

}
