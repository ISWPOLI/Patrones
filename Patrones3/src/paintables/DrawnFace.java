package paintables;

import common.SmileConstants;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

//import common.Paintable;
import plugins.Paintable;
import plugins.PaintableBase;
//import common.PaintableBase;
import paintables.Circle;
import plugins.PaintableFactory;

// Composite
public class DrawnFace extends PaintableBase {

    List<Paintable> paintableList = new ArrayList<Paintable>();

    // --------------------------------------------------------------------------------
    public DrawnFace(int x1, int y1, int x2, int y2, int state) {
        super(x1, y1, x2, y2);

        int x;
        int y;
        int w;
        int h;

        // ----------------------------------------
        y = (int) (y1 + (y2 - y1) * 0.25);

        w = (int) ((x2 - x1) * 0.25);
        h = (int) ((y2 - y1) * 0.25);

        // ----------------------------------------
        // Ojo Izq
        // ----------------------------------------
        x = (int) (x1 + (x2 - x1) * 0.20);
        paintableList.add(new Circle(x, y, x + w, y + h));

        // ----------------------------------------
        // Ojo Der
        // ----------------------------------------
        x = (int) (x1 + (x2 - x1) * 0.55);
        paintableList.add(new Circle(x, y, x + w, y + h));

        // ----------------------------------------
        // Sonrisa
        // ----------------------------------------
        x = (int) (x1 + (x2 - x1) * 0.25);
        y = (int) (y1 + (y2 - y1) * 0.625);
        w = (int) ((x2 - x1) * 0.5);
        h = (int) ((y2 - y1) * 0.5);
        paintableList.add(new Smile(x, y, x + w, y + h, state));

        // ----------------------------------------
        // Marco
        // ----------------------------------------
        switch (state) {
            case SmileConstants.SMILE_UP:
                paintableList.add(new Decorator(x1, y1, (x2 - x1), (y2 - y1), Color.BLUE));
                break;
                
            case SmileConstants.SMILE_DW:
                paintableList.add(new Decorator(x1, y1, (x2 - x1), (y2 - y1), Color.RED));
                break;
            case SmileConstants.SMILE_OK:
                paintableList.add(new Decorator(x1, y1, (x2 - x1), (y2 - y1), Color.YELLOW));
                break;
        }

    }

    // --------------------------------------------------------------------------------
    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.BLACK);
        g2d.drawOval(x1, y1, x2 - x1, y2 - y1);

        // ----------------------------------------
        // Draw children
        // ----------------------------------------
        for (Paintable paintable : paintableList) {
            paintable.draw(g2d);
        }
    }

    // --------------------------------------------------------------------------------
    @Override
    public void move(int dx, int dy) {
        super.move(dx, dy);

        // ----------------------------------------
        // Move children
        // ----------------------------------------
        for (Paintable paintable : paintableList) {
            paintable.move(dx, dy);
        }
    }

//    @Override
//    public PaintableFactory getPaintableFactory() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    @Override
    public PaintableFactory getPaintableFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
