package paintables;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import common.Paintable;
import common.PaintableBase;
import common.SmileConstants;

// Composite
public class DrawnFace extends PaintableBase {

    List<Paintable> paintableList;

    // --------------------------------------------------------------------------------
    public DrawnFace(int x1, int y1, int x2, int y2, int state) {
        super(x1, y1, x2, y2);

        this.paintableList = new ArrayList<>();

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
        // Pupila Ojo Izq
        // ----------------------------------------
        if (state == SmileConstants.SMILE_HY) {
            x = (int) (x1 + (x2 - x1) * 0.22);
            w = (int) ((x1 + 15) - x1);
        } else {
            x = (int) (x1 + (x2 - x1) * 0.28);
            w = (int) ((x1 + 15) - x1);
        }
        y = (int) (y1 + (y2 - y1) * 0.33);
        h = (int) ((y1 + 15) - y1);
        paintableList.add(new Circle(x, y, x + w, y + h));
        paintableList.add(new Eye(x, y, x + w, y + h));
        
        // ----------------------------------------
        // Pupila Ojo Der
        // ----------------------------------------
        if (state == SmileConstants.SMILE_HY) {
            x = (int) (x1 + (x2 - x1) * 0.57);
            w = (int) ((x1 + 15) - x1);
        } else {
            x = (int) (x1 + (x2 - x1) * 0.63);
            w = (int) ((x1 + 15) - x1);
        }
        paintableList.add(new Circle(x, y, x + w, y + w));
        paintableList.add(new Eye(x, y, x + w, y + w));

        // ----------------------------------------
        // Sonrisa
        // ----------------------------------------
        x = (int) (x1 + (x2 - x1) * 0.25);
        y = (int) (y1 + (y2 - y1) * 0.625);
        w = (int) ((x2 - x1) * 0.5);
        h = (int) ((y2 - y1) * 0.5);
        paintableList.add(new Smile(x, y, x + w, y + h, state));
        
        // ----------------------------------------
        // Decorador
        // ----------------------------------------
        switch (state) {
            case SmileConstants.SMILE_UP:
                for (int i = 0; i < 3; i++) {
                    x = (int) (x1 - (8 * i));
                    y = (int) (y1 - (8 * i));
                    w = (int) ((x2 - x1) + (16 * i));
                    h = (int) ((y2 - y1) + (16 * i));
                    
                    Color color = Color.BLACK;
                    
                    switch (i) {
                        case 0:
                            color = Color.BLUE;
                            break;
                        case 1:
                            color = Color.CYAN;
                            break;
                        case 2:
                            color = Color.GRAY;
                            break;
                    }
                    
                    paintableList.add(new Decorador(x, y, w, h, color));
                }
                break;
            case SmileConstants.SMILE_HY:
                for (int i = 0; i < 4; i++) {
                    x = (int) (x1 - (8 * i));
                    y = (int) (y1 - (8 * i));
                    w = (int) ((x2 - x1) + (16 * i));
                    h = (int) ((y2 - y1) + (16 * i));
                    
                    Color color = Color.BLACK;
                    
                    switch (i) {
                        case 0:
                            color = new Color(27,255,0);
                            break;
                        case 1:
                            color = Color.YELLOW;
                            break;
                        case 2:
                            color = Color.BLUE;
                            break;
                        case 3:
                            color = new Color(184,189,1);
                            break;
                    }
                    
                    paintableList.add(new Decorador(x, y, w, h, color));
                }
                break;
            case SmileConstants.SMILE_OK:
                paintableList.add(new Decorador(x1, y1, (x2 - x1), (y2 - y1), Color.RED));
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
        paintableList.forEach((paintable) -> {
            paintable.draw(g2d);
        });
    }

    // --------------------------------------------------------------------------------
    @Override
    public void move(int dx, int dy) {
        super.move(dx, dy);

        // ----------------------------------------
        // Move children
        // ----------------------------------------
        paintableList.forEach((paintable) -> {
            paintable.move(dx, dy);
        });
    }
}
