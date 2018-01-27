package cnc;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import util.ImageUtil;

public class DepthMapSource extends AbstractSource
{
  private static final int WHITE = -1;
  private static final int BLACK = -16777216;

  private final BufferedImage bufferedImage;

  protected DepthMapSource(Area workArea, Speed speed, Tool tool, InputStream inputStream) throws IOException
  {
    super(workArea, speed, tool);
    int newWidth = (int) Math.round(workArea.getWidth() / getPrecision());
    int newHeight = (int) Math.round(workArea.getHeight() / getPrecision());
    bufferedImage = ImageUtil.resizeImage(ImageIO.read(inputStream), newWidth, newHeight);
  }

  @Override
  public double getPointDepth(double value)
  {
    double depth = 0.0D;
    if(value < WHITE)
    {
      depth = (Math.abs(value) * Math.abs(getWorkArea().getThickness()) / (double) Math.abs(BLACK));
    }
    return depth;
  }

  @Override
  public int getValue(int x, int y)
  {
    return bufferedImage.getRGB(x, y);
  }

  @Override
  public int getWidth()
  {
    return bufferedImage.getWidth();
  }

  @Override
  public int getHeight()
  {
    return bufferedImage.getHeight();
  }

  // FIXME Iacob clean here
  public void test()
  {
    for(int i = 0; i < bufferedImage.getWidth(); i++)
    {
      for(int j = 0; j < bufferedImage.getHeight(); j++)
      {
        System.out.println("(" + i + ", " + j + "): " + bufferedImage.getRGB(i, j) + " depth: " + getPointDepth(bufferedImage.getRGB(i, j)));
      }
    }
  }
}
