package yar.cnc.commands;

public class LinearFastMove extends LinearMove
{
  private static final String GCODE = "G0";

  public LinearFastMove(Double x, Double y, Double z)
  {
    super(x, y, z);
  }

  @Override
  public String getGInstruction()
  {
    return GCODE;
  }
}
