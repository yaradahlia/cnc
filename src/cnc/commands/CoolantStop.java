package cnc.commands;

import cnc.AbstractCommand;

public class CoolantStop extends AbstractCommand
{

  @Override
  public String getGCodeValue()
  {
    return "M9";
  }

}
