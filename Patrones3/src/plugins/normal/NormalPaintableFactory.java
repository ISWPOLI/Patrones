package plugins.normal;

import javax.swing.ImageIcon;

import common.ImageCache;
import plugins.Paintable;
import plugins.PaintableFactory;

// Factory
public class NormalPaintableFactory implements PaintableFactory {

  //  private boolean useImage = true;

  public Paintable create(int x1, int y1, int x2, int y2) {
    //    if (useImage) {
    return new NormalPaintable(x1, y1, x2, y2);
    //    } else {
    //      return new DrawnFace(x1, y1, x2, y2);
    //    }
  }

  @Override
  public ImageIcon getToolIcon() {
    return new ImageIcon(ImageCache.getInstance().getImage("smile1_icon.png", getClass()));
  }

  @Override
  public String getToolName() {
    return "Normal Face Tool";
  }
}
