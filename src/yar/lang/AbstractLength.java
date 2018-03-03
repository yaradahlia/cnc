package yar.lang;

import lombok.Getter;

public abstract class AbstractLength<T extends AbstractLength>
{

  @Getter
  protected final long length;

  public AbstractLength(long length)
  {
    this.length = length;
  }

  protected abstract T createInstance(long length);

  public T add(T length) throws OverflowException
  {
    return add(length.getLength());
  }

  public T add(long length) throws OverflowException
  {
    try
    {
      return createInstance(Math.max(0L, Math.addExact(this.length, length)));
    }
    catch(ArithmeticException e)
    {
      throw new OverflowException();
    }
  }

  public T multiply(T length) throws OverflowException
  {
    return multiply(length.getLength());
  }

  public T multiply(long length) throws OverflowException
  {
    try
    {
      return createInstance(Math.max(0L, Math.multiplyExact(this.length, length)));
    }
    catch(ArithmeticException e)
    {
      throw new OverflowException();
    }
  }

}
