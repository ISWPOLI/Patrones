package formats;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileFormatReader {

  private FileFormatReader() {
    // Empty
  }

  // --------------------------------------------------------------------------------

  public static List<FileFormatFactory> fsRead(InputStream is) {
    try {
      return exRead(is);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  // --------------------------------------------------------------------------------

  public static List<FileFormatFactory> exRead(InputStream is) throws Exception {
    List<FileFormatFactory> ret = new ArrayList<FileFormatFactory>();

    BufferedReader rd = new BufferedReader(new InputStreamReader(is));

    String line;

    while ((line = rd.readLine()) != null) {
      line = line.trim();

      if (line.equals("") || line.startsWith("#")) {
        continue;
      }

      FileFormatFactory fileFormatFactory = //
      (FileFormatFactory) Class.forName(line).newInstance();

      ret.add(fileFormatFactory);
    }

    return ret;
  }
}
