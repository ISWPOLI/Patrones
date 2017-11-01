package common;

import paintables.DrawnFace;
import paintables.ImageFace;

// Factory
public class PaintableFactory {

  private boolean useImage = true;

  public Paintable create(int x1, int y1, int x2, int y2, int state) {
    if (useImage=false) {
      return new ImageFace(x1, y1, x2, y2, state);
    } else {
      return new DrawnFace(x1, y1, x2, y2, state);
    }
    
    /* Se compara la variable useImagen = falso en el if, y el programa compila 
    mostrando las caras vectoriales.*/
  }
}
