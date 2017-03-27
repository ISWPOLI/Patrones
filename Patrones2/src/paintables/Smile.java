//package paintables;
//
//import java.awt.Color;
//import java.awt.Graphics2D;
//
//import common.PaintableBase;
//import common.SmileConstants;
//
//public class Smile extends PaintableBase {
//
//  private int state;
//
//  // --------------------------------------------------------------------------------
//
//  public Smile(int x1, int y1, int x2, int y2, int state) {
//    super(x1, y1, x2, y2);
//
//    this.state = state;
//  }
//
//  // --------------------------------------------------------------------------------
//
//  @Override
//  public void draw(Graphics2D g2d) {
//    g2d.setColor(Color.BLACK);
//
//    int w = x2 - x1;
//    int h = y2 - y1;
//
//    switch (state) {
//      case SmileConstants.SMILE_UP :
//        g2d.drawArc(x1, y1 - w / 2, w, h, 0, -180);
//        break;
//      case SmileConstants.SMILE_DW :
//        g2d.drawArc(x1, y1/*    */, w, h, 0, +180);
//        break;
//      case SmileConstants.SMILE_OK :
//        g2d.drawLine(x1, y1 + h / 3, x1 + w, y1 + h / 3);
//        break;
//    }
//  }
//}
