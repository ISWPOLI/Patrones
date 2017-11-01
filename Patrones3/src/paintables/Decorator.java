package paintables;

import plugins.PaintableBase;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import plugins.PaintableFactory;

public class Decorator extends PaintableBase {

    private final Color color;
    
    public Decorator(int x1, int y1, int x2, int y2, Color color) {
        super(x1, y1, x2, y2);
        this.color = color;
    }
    
    @Override
    public void draw(Graphics2D g2d) { 
        float thickness = 5;
        Stroke stroke = g2d.getStroke();
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setColor(this.color);
        g2d.drawRect((x1 - 5), (y1 - 5), (x2 + 10), (y2 + 10));
        g2d.setStroke(stroke);
    }

    @Override
    public PaintableFactory getPaintableFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
