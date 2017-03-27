package plugins;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PluginsReader {

  private PluginsReader() {
    // Empty
  }

  // --------------------------------------------------------------------------------

  public static List<PaintableFactory> fsRead(InputStream is) {
    try {
      return exRead(is);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  // --------------------------------------------------------------------------------

  public static List<PaintableFactory> exRead(InputStream is) throws Exception {
    List<PaintableFactory> ret = new ArrayList<PaintableFactory>();

    BufferedReader rd = new BufferedReader(new InputStreamReader(is));

    String line;

    while ((line = rd.readLine()) != null) {
      line = line.trim();

      if (line.equals("") || line.startsWith("#")) {
        continue;
      }

      PaintableFactory paintableFactory = //
      (PaintableFactory) Class.forName(line).newInstance();

      ret.add(paintableFactory);
    }

    return ret;
  }
}
