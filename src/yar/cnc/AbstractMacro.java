package yar.cnc;

import yar.cnc.AbstractCommand;
import java.util.List;

public abstract class AbstractMacro
{
  public abstract List<AbstractCommand> getCommands();
}
