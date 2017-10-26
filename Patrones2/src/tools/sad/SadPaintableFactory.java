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
         return new DrawnFace(x1, y1, x2, y2,1);
//¿Qué pasa si le asigno un numero en lugar de SmileConstants.SMILE_UP?
/*El metodo DrawnFace donde se creo, tiene 5 variables, y la ultima es un estado que debe ser un entero.
El SmileConstants es una representacion de los estados de animo que se encuentra en otra clase y es un numero 1 triste, 0 feliz y 3 maso o menos. Debe ser uno de esos 3 valores.
  */      
//¿Porqué no genera error?
//Porque no esta ingresando un dato diferente al que esta pidiendo el metodo el cual es un numero.
        }
  }
}
