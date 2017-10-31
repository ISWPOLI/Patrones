package plugins.happy;

import javax.swing.ImageIcon;

import common.ImageCache;
import common.SmileConstants;
import main.FrmMain;

import plugins.Paintable;
import plugins.PaintableFactory;
import paintables.DrawnFace;


// Factory
public class HappyPaintableFactory implements PaintableFactory {
   
        public boolean boton;
       

        private boolean useImage;  
  
   public void setbtn(boolean boton){
        this.boton = boton;
        useImage=boton;
          System.out.print(useImage);
    }           
   public boolean getbtn(){
       return this.boton;
   }
      
   

   
   
 public Paintable create(int x1, int y1, int x2, int y2) {
         System.out.print(useImage);
      
        if (useImage==true) {
    return new HappyPaintable(x1, y1, x2, y2);
        } else {
         return new DrawnFace(x1, y1, x2, y2,SmileConstants.SMILE_UP);
      }
  }

  @Override
  public ImageIcon getToolIcon() {
    return new ImageIcon(ImageCache.getInstance().getImage("smile2_icon.png", getClass()));
  }

  @Override
  public String getToolName() {
    return "Happy Face Tool";
  }
 
    
    
  
}
