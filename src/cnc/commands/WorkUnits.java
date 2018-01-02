package cnc.commands;

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

}
