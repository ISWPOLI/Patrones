package formats.txt2;

import formats.FileFormat;
import formats.FileFormatFactory;

public class Txt2FileFormatFactory implements FileFormatFactory {

  @Override
  public FileFormat create() {
    return new Txt2FileFormat();
  }

  @Override
  public String getExtensionName() {
    return "tx2";
  }
}
