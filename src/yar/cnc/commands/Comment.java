package yar.cnc.commands;

import yar.cnc.AbstractCommand;

public class Comment extends AbstractCommand
{

  private static final String GCODE = "( %s )";

  private final String comment;

  public Comment(String comment)
  {
    this.comment = comment;
  }

  @Override
  public String getGCodeValue()
  {
    return String.format(GCODE, comment);
  }

}
