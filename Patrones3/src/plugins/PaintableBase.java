package plugins;

import java.awt.Point;

public abstract class PaintableBase implements Paintable {

  protected int x1;
  protected int y1;

  protected int x2;
  protected int y2;

  // --------------------------------------------------------------------------------

  public PaintableBase(int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  // --------------------------------------------------------------------------------

  public int getX1() {
    return x1;
  }

  public int getY1() {
    return y1;
  }

  // --------------------------------------------------------------------------------

  public int getX2() {
    return x2;
  }

  public int getY2() {
    return y2;
  }

  // --------------------------------------------------------------------------------

  public boolean inside(Point point) {
    return //
    /**/point.x >= x1 && point.x <= x2 && //
        point.y >= y1 && point.y <= y2;
  }

  // --------------------------------------------------------------------------------

  public void move(int dx, int dy) {
    x1 += dx;
    y1 += dy;
    x2 += dx;
    y2 += dy;
  }
}
