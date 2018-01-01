package test;

import cnc.Area;
import cnc.DepthMapSource;
import cnc.MeasureUnitType;
import cnc.Program;
import cnc.Speed;
import cnc.Tool;
import java.io.IOException;
import util.ResourceUtil;

public class Test
{
  private static final String TEST_IMAGE = "/resources/braid.png";

  public static void main(String[] args) throws IOException
  {
    Area workArea = new Area(3000, 3000, 20);
    Speed speed = new Speed(0.3, 15000, 7500, 20000);
    Tool tool = new Tool(2.5, 3.5);
    Program program = new Program("Test", MeasureUnitType.MM, workArea, speed, tool, ResourceUtil.getResource(TEST_IMAGE));
    ((DepthMapSource) program.getSource()).test();
  }

}
