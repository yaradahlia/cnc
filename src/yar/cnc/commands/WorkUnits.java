package yar.cnc.commands;

import yar.cnc.AbstractCommand;
import lombok.Getter;
import yar.types.WorkUnitsType;

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
