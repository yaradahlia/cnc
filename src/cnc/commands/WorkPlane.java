package cnc.commands;

import lombok.Getter;
import types.WorkPlaneType;

@Getter
public class WorkPlane extends AbstractCommand
{
  private final WorkPlaneType workPlaneType;

  public WorkPlane(WorkPlaneType workPlaneType)
  {
    this.workPlaneType = workPlaneType;
  }

}
