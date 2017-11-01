package tools.sad;

import plugins.Paintable;
import plugins.PaintableFactory;
import common.SmileConstants;
import javax.swing.ImageIcon;
import paintables.DrawnFace;


// Factory
public class SadPaintableFactory implements PaintableFactory {

   private boolean useImage = false;

  public Paintable create(int x1, int y1, int x2, int y2) {
    
         return new DrawnFace(x1, y1, x2, y2,1);
//¿Qué pasa si le asigno un numero en lugar de SmileConstants.SMILE_UP?
/*El metodo DrawnFace donde se creo, tiene 5 variables, y la ultima es un estado que debe ser un entero.
El SmileConstants es una representacion de los estados de animo que se encuentra en otra clase y es un numero 1 triste, 0 feliz y 3 maso o menos. Debe ser uno de esos 3 valores.
  */      
//¿Porqué no genera error?
//Porque no esta ingresando un dato diferente al que esta pidiendo el metodo el cual es un numero.
        
  }

    @Override
    public ImageIcon getToolIcon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getToolName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
