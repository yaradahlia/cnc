package yar.lang;

public class MilliMetre extends AbstractLength<MilliMetre>
{

  public MilliMetre(long length)
  {
    super(length);
  }

  @Override
  protected MilliMetre createInstance(long length)
  {
    return new MilliMetre(length);
  }

}
