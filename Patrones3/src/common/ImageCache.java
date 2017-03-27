package common;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

// Singleton
public class ImageCache {

  // --------------------------------------------------------------------------------
  // Variable de clase (la única instancia de la clase que va a existir)
  // --------------------------------------------------------------------------------

  private static ImageCache instance;

  // --------------------------------------------------------------------------------
  // Variable de instancia (el cache en este caso particular)
  // --------------------------------------------------------------------------------

  private Map<String, BufferedImage> imageMap = new HashMap<String, BufferedImage>();

  // --------------------------------------------------------------------------------

  private ImageCache() {
    // Empty
  }

  // --------------------------------------------------------------------------------

  public static synchronized ImageCache getInstance() {
    if (instance == null) {
      instance = new ImageCache();
    }

    return instance;
  }

  // --------------------------------------------------------------------------------

  public BufferedImage getImage(String filename) {
    BufferedImage ret = imageMap.get(filename);

    if (ret == null) {
      try {
        ret = ImageIO.read(new File(filename));
        imageMap.put(filename, ret);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    return ret;
  }

  // --------------------------------------------------------------------------------

  public BufferedImage getImage(String filename, Class<?> clazz) {
    BufferedImage ret = imageMap.get(clazz.getName() + ":" + filename);

    if (ret == null) {
      try {
        ret = ImageIO.read(clazz.getResourceAsStream(filename));
        imageMap.put(filename, ret);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    return ret;
  }

  // --------------------------------------------------------------------------------

  public BufferedImage getSystemImage(String filename) {
    BufferedImage ret = imageMap.get(ClassLoader.class.getName() + ":" + filename);

    if (ret == null) {
      try {
        ret = ImageIO.read(ClassLoader.getSystemResourceAsStream(filename));
        imageMap.put(filename, ret);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    return ret;
  }
}
