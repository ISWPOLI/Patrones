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
// R//) DESDE QUE EL NUMERO CORRESPONDA A UNO DESIGNADO EN LA CLASE MUESTRA.
//      PARA QUE SE MUESTRE DE MANERA CORRECTA DEBERIA REMPLAZAR 
//      POR 1 PARA QUE MUESTRE LA CARA TRISTE QUE ES LA CORRESPONDIENTE SINO
//      NO VA AMOSTRAR UN UNA CARA.
// EL SmileConstants es una representacion de los estados de animo que se encuentra dentro
// en otra clase el numero 1 es triste.
//¿Porqué no genera error?
        }
  }
}
