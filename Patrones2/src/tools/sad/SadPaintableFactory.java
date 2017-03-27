package tools.sad;

import common.Paintable;
import common.PaintableFactory;
import paintables.DrawnFace;


// Factory
public class SadPaintableFactory implements PaintableFactory {

   private boolean useImage = false;

  public Paintable create(int x1, int y1, int x2, int y2) {
      if (useImage) {
    return new SadImageFace(x1, y1, x2, y2);
       } else {
         return new DrawnFace(x1, y1, x2, y2, 2);
        }
  }
}
