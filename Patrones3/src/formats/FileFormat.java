package formats;

import java.io.File;
import java.util.List;

import plugins.Paintable;

public interface FileFormat {

  public void load(File file, List<Paintable> paintableList) //
      throws Exception;

  public void save(File file, List<Paintable> paintableList) //
      throws Exception;
}
