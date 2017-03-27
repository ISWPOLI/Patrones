package formats.txt1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.regex.Pattern;

import formats.FileFormat;
import plugins.Paintable;
import plugins.PaintableFactory;

public class Txt1FileFormat implements FileFormat {

  public void load(File file, List<Paintable> paintableList) throws Exception {

    Pattern p = Pattern.compile(" ");

    BufferedReader rd = new BufferedReader(new FileReader(file));

    String line;

    while ((line = rd.readLine()) != null) {
      line = line.trim();

      if (line.equals("") || line.startsWith("#")) {
        continue;
      }

      String[] data = p.split(line);

      PaintableFactory pf = (PaintableFactory) Class.forName(data[0]).newInstance();

      Paintable paintable = pf.create( //
          Integer.parseInt(data[1]), //
          Integer.parseInt(data[2]), //
          Integer.parseInt(data[3]), //
          Integer.parseInt(data[4]));

      paintableList.add(paintable);
    }

    rd.close();
  }

  public void save(File file, List<Paintable> paintableList) throws Exception {
    PrintWriter pw = new PrintWriter(new FileWriter(file));

    for (Paintable paintable : paintableList) {
      pw.print(paintable.getPaintableFactory().getClass().getName());
      pw.print(" ");
      pw.print(paintable.getX1());
      pw.print(" ");
      pw.print(paintable.getY1());
      pw.print(" ");
      pw.print(paintable.getX2());
      pw.print(" ");
      pw.print(paintable.getY2());
      pw.println();
    }

    pw.close();
  }
}
