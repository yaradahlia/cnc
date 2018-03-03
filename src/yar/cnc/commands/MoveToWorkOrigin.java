package yar.cnc.commands;

public class MoveToWorkOrigin extends LinearFastMove
{

  public MoveToWorkOrigin()
  {
    super(0.0D, 0.0D, 0.0D);
  }

  public MoveToWorkOrigin(double safeZ)
  {
    super(0.0D, 0.0D, safeZ);
  }

}
