package yar.lang;

public class MicroMetre extends AbstractLength<MicroMetre>
{

  public MicroMetre(long length)
  {
    super(length);
  }

  @Override
  protected MicroMetre createInstance(long length)
  {
    return new MicroMetre(length);
  }

}
