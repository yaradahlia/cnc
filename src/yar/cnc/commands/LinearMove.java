package yar.cnc.commands;

import yar.cnc.AbstractCommand;
import lombok.Getter;

@Getter
public abstract class LinearMove extends AbstractCommand
{
  private static final String X_CODE = "X %.2f";
  private static final String Y_CODE = "Y %.2f";
  private static final String Z_CODE = "Z %.2f";

  private final Double x;
  private final Double y;
  private final Double z;

  public LinearMove(Double x, Double y, Double z)
  {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  private void validate()
  {
    if(!(getX() != null || getY() != null || getZ() != null))
    {
      throw new IllegalArgumentException("On a linear move you must specify at least one: X, Y or Z.");
    }
  }

  @Override
  public String getGCodeValue()
  {
    StringBuilder builder = new StringBuilder();
    builder.append(getGInstruction());
    if(getX() != null)
    {
      builder.append(SPACE).append(String.format(X_CODE, getX()));
    }
    if(getY() != null)
    {
      builder.append(SPACE).append(String.format(Y_CODE, getY()));
    }
    if(getZ() != null)
    {
      builder.append(SPACE).append(String.format(Z_CODE, getZ()));
    }
    String code = builder.toString();
    return code;
  }

  public abstract String getGInstruction();

}
