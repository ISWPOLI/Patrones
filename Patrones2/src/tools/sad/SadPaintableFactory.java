package tools.sad;

import common.Paintable;
import common.PaintableFactory;
import common.SmileConstants;
import paintables.DrawnFace;


// Factory
public class SadPaintableFactory implements PaintableFactory {

   private boolean useImage = false;

  public Paintable create(int x1, int y1, int x2, int y2) {
      if (useImage) {
    return new SadImageFace(x1, y1, x2, y2);
       } else {
         return new DrawnFace(x1, y1, x2, y2,SmileConstants.SMILE_UP);
//¿Qué pasa si le asigno un numero en lugar de SmileConstants.SMILE_UP?
//No genera error, Debido a que en la clase  SmileConstants ya tiene definidas por defecto  en sus variables unos números:
/*int SMILE_UP = 0; 
int SMILE_DW = 1;
int SMILE_OK = 3;
*/
        }
  }
}
