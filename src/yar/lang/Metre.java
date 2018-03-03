package yar.lang;

public class Metre extends AbstractLength<Metre>
{

  public Metre(long length)
  {
    super(length);
  }

  @Override
  protected Metre createInstance(long length)
  {
    return new Metre(length);
  }

}
