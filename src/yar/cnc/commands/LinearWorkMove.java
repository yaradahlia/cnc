package yar.cnc.commands;

import yar.cnc.AbstractCommand;
import lombok.Getter;

@Getter
public class LinearWorkMove extends LinearMove
{
  private static final String GCODE = "G1";

  public LinearWorkMove(Double x, Double y, Double z)
  {
    super(x, y, z);
  }

  @Override
  public String getGInstruction()
  {
    return GCODE;
  }

}
