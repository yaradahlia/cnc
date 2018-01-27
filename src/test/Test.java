package test;

import cnc.AbstractCommand;
import cnc.AbstractPath;
import cnc.Area;
import cnc.DepthMapSource;
import cnc.MeasureUnitType;
import cnc.Program;
import cnc.Speed;
import cnc.Tool;
import java.io.IOException;
import java.util.List;
import types.PathType;
import util.ResourceUtil;

public class Test
{
  private static final String TEST_IMAGE = "/resources/braid.png";

  public static void main(String[] args) throws IOException, AbstractPath.WorkAreaTooSmallException
  {
    Area workArea = new Area(300, 300, 20);
    Speed speed = new Speed(0.3, 15000, 7500, 20000);
    Tool tool = new Tool(2.5, 3.5);
    Program program = new Program("Test", MeasureUnitType.MM, workArea, speed, tool, ResourceUtil.getResource(TEST_IMAGE), 10, PathType.ZIG_ZAG);

    List<AbstractCommand> generateProgram = program.generateProgram();
    //((DepthMapSource) program.getSource()).test();
  }

}
