package tools.normal;

import plugins.Paintable;
import plugins.PaintableFactory;
import common.SmileConstants;
import javax.swing.ImageIcon;
import paintables.DrawnFace;

// Factory
public class NormalPaintableFactory implements PaintableFactory {

    private boolean useImage = false;

  public Paintable create(int x1, int y1, int x2, int y2) {
       
         return new DrawnFace(x1, y1, x2, y2,SmileConstants.SMILE_OK);
       
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
