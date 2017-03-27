package plugins;

import java.awt.Graphics2D;
import java.awt.Point;

public interface Paintable {

  public boolean inside(Point point);

  // --------------------------------------------------------------------------------

  public void draw(Graphics2D g2d);

  public void move(int dx, int dy);

  // --------------------------------------------------------------------------------

  public int getX1();

  public int getY1();

  public int getX2();

  public int getY2();

  // --------------------------------------------------------------------------------

  public PaintableFactory getPaintableFactory();
}
