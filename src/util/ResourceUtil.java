package util;

import java.io.InputStream;

public class ResourceUtil
{
  public static InputStream getResource(String path)
  {
    return ResourceUtil.class.getResourceAsStream(path);
  }
}
