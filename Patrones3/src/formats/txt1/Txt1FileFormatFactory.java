package formats.txt1;

import formats.FileFormat;
import formats.FileFormatFactory;

public class Txt1FileFormatFactory implements FileFormatFactory {

  @Override
  public FileFormat create() {
    return new Txt1FileFormat();
  }

  @Override
  public String getExtensionName() {
    return "tx1";
  }
}
