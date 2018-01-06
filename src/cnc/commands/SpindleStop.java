package cnc.commands;

import cnc.AbstractCommand;

public class SpindleStop extends AbstractCommand
{

  @Override
  public String getGCodeValue()
  {
    return "M5";
  }

}
