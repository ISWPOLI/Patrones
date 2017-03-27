package formats;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class ExtFileFilter extends FileFilter {

  private String ext;

  // --------------------------------------------------------------------------------

  public ExtFileFilter(String ext) {
    this.ext = ext;
  }

  // --------------------------------------------------------------------------------

  @Override
  public boolean accept(File f) {
    if (f.isDirectory()) {
      return true;
    }

    int lastPeriod = f.getName().lastIndexOf('.');

    if (lastPeriod < 0) {
      return false;
    }

    String extension = f.getName().substring(lastPeriod + 1);

    if (ext.equals(extension)) {
      return true;
    }

    return false;
  }

  // --------------------------------------------------------------------------------

  @Override
  public String getDescription() {
    return "*." + ext;
  }

  // --------------------------------------------------------------------------------

  public String getExt() {
    return ext;
  }
}
