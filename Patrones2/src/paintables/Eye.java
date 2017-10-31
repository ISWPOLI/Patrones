/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintables;

import common.PaintableBase;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author jocastaneda5
 */
public class Eye extends PaintableBase {
    
    public Eye(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }
    
    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.GRAY);
        g2d.fillOval(x1, y1, x2 - x1, y2 - y1);
    }
    
}
