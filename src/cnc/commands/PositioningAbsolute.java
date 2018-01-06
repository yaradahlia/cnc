package cnc.commands;

import cnc.AbstractCommand;

public class PositioningAbsolute extends AbstractCommand
{

  @Override
  public String getGCodeValue()
  {
    return "G90";
  }

}
