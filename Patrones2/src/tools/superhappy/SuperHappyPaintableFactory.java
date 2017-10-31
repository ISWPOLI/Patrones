/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.superhappy;

import common.Paintable;
import common.PaintableFactory;
import common.SmileConstants;
import paintables.DrawnFace;

/**
 *
 * @author User
 */
public class SuperHappyPaintableFactory implements PaintableFactory {

    private boolean useImage = false;

    @Override
    public Paintable create(int x1, int y1, int x2, int y2) {
        if (useImage) {
            return new SuperHappyImageFace(x1, y1, x2, y2);
        } else {
            return new DrawnFace(x1, y1, x2, y2, SmileConstants.SMILE_HY);
        }
    }
}