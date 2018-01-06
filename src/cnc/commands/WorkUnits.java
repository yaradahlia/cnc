package cnc.commands;

import cnc.AbstractCommand;
import lombok.Getter;
import types.WorkUnitsType;

@Getter
public class WorkUnits extends AbstractCommand
{
  private final WorkUnitsType workUnitsType;

  public WorkUnits(WorkUnitsType workUnitsType)
  {
    this.workUnitsType = workUnitsType;
  }

  @Override
  public String getGCodeValue()
  {
    return WorkUnitsType.INCH.equals(getWorkUnitsType()) ? "G20" : "G21";
  }

}
