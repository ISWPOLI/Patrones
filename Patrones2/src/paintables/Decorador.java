/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintables;

import common.PaintableBase;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;

/**
 *
 * @author User
 */
public class Decorador extends PaintableBase {

    private final Color color;
    
    public Decorador(int x1, int y1, int x2, int y2, Color color) {
        super(x1, y1, x2, y2);
        
        this.color = color;
    }
    
    @Override
    public void draw(Graphics2D g2d) { 
        float thickness = 8;
        Stroke oldStroke = g2d.getStroke();
        g2d.setStroke(new BasicStroke(thickness));
        g2d.setColor(this.color);
        
        g2d.drawRect((x1 - 4), (y1 - 4), (x2 + 9), (y2 + 9));
        g2d.setStroke(oldStroke);
    }
    
}
