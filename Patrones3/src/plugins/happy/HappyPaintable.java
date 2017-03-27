package plugins.happy;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import common.ImageCache;
import plugins.PaintableBase;
import plugins.PaintableFactory;

public class HappyPaintable extends PaintableBase {

  private BufferedImage bufferedImage;

  // --------------------------------------------------------------------------------

  public HappyPaintable(int x1, int y1, int x2, int y2) {
    super(x1, y1, x2, y2);

    bufferedImage = ImageCache.getInstance().getImage("smile2.png", getClass());
  }

  // --------------------------------------------------------------------------------

  @Override
  public void draw(Graphics2D g2d) {
    g2d.drawImage(bufferedImage, x1, y1, x2 - x1, y2 - y1, null);
  }

  // --------------------------------------------------------------------------------

  @Override
  public PaintableFactory getPaintableFactory() {
    return new HappyPaintableFactory();
  }
}
