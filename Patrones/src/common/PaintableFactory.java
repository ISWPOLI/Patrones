package common;

import paintables.DrawnFace;
import paintables.ImageFace;

// Factory
public class PaintableFactory {

  private boolean useImage = true;

  public Paintable create(int x1, int y1, int x2, int y2, int state) {
    if (useImage=false) {
      /*Se identifica que en el paquete de common en la clase PaintableFactory  
      en la línea 12 tiene una condicional if  pero solo está llamando la variable useaImage a la cual  
      no le esta realizando ninguna comparacion.Por lo cual se corrige  useImage=false*/
      
      return new ImageFace(x1, y1, x2, y2, state);
    } else {
      return new DrawnFace(x1, y1, x2, y2, state);
    }
  }
}
