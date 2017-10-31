package paintables;

import java.awt.Color;
import java.awt.Graphics2D;

import plugins.PaintableBase;
import plugins.PaintableFactory;

public class Rect extends PaintableBase {

  public Rect(int x1, int y1, int x2, int y2) {
    super(x1, y1, x2, y2);
  }

  // --------------------------------------------------------------------------------

  @Override
  public void draw(Graphics2D g2d) {
    g2d.setColor(Color.BLACK);
    g2d.drawRect(x1, y1, x2 - x1, y2 - y1);
  }

    @Override
    public PaintableFactory getPaintableFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
