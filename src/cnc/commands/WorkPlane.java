package cnc.commands;

import cnc.AbstractCommand;
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

  @Override
  public String getGCodeValue()
  {
    String plane = null;
    switch(workPlaneType)
    {
      case XY:
      {
        plane = "G17";
        break;
      }
      case XZ:
      {
        plane = "G18";
        break;
      }
      case YZ:
      {
        plane = "G19";
        break;
      }
    }
    return plane;
  }

}
