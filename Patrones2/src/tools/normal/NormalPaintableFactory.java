package tools.normal;

import common.Paintable;
import common.PaintableFactory;
import paintables.DrawnFace;

// Factory
public class NormalPaintableFactory implements PaintableFactory {

    private boolean useImage = false;

  public Paintable create(int x1, int y1, int x2, int y2) {
       if (useImage) {
    return new NormalImageFace(x1, y1, x2, y2);
       } else {
         return new DrawnFace(x1, y1, x2, y2,4);
       }
  }
}
