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
         return new DrawnFace(x1, y1, x2, y2,SmileConstants.SMILE_DW);
         
//¿Qué pasa si le asigno un numero en lugar de SmileConstants.SMILE_UP?
    // Pasa que al seleccionar la opción SadPaintable, la cara Sad imprime pero no genera boca.
         
//¿Por qué no genera error?
/*No genera error, Debido a que en la clase  SmileConstants ya tiene definidas por defecto unas varibales de tipo entero:
int SMILE_UP = 0; 
int SMILE_DW = 1;
int SMILE_OK = 3;

Por tal motivo si le asignamos otro numero diferente a 1 en este caso para la cara sap que es variable de tipo entero 
SMILE_DW , no arroja error pero no genera la boca de la cara.
*/
        }
  }
}
