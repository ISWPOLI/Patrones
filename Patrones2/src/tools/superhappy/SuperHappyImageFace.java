/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.superhappy;

import common.ImageCache;
import common.PaintableBase;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author User
 */
public class SuperHappyImageFace extends PaintableBase {

    private BufferedImage bufferedImage;

    // --------------------------------------------------------------------------------
    public SuperHappyImageFace(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);

        bufferedImage = ImageCache.getInstance().getImage("smile2.png");
    }

    // --------------------------------------------------------------------------------
    @Override
    public void draw(Graphics2D g2d) {
        g2d.drawImage(bufferedImage, x1, y1, x2 - x1, y2 - y1, null);
    }
}
