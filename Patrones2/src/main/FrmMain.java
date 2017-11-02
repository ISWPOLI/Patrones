package main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import common.PaintableFactory;
import common.PluginsReader;

public class FrmMain extends JFrame {

  private Canvas client;

  // --------------------------------------------------------------------------------

  public FrmMain() {
    setLayout(new BorderLayout());

    client = new Canvas();
    add(client, BorderLayout.CENTER);

    add(initTopPanel(), BorderLayout.NORTH);
    add(initToolBarPanel(), BorderLayout.EAST);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(640, 480);
    setVisible(true);
  }

  // --------------------------------------------------------------------------------

  public JPanel initTopPanel() {
    JPanel ret = new JPanel();

    JButton btnUndo = new JButton("undo");
    btnUndo.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnUndoClicked();
      }
    });
    ret.add(btnUndo);

    JButton btnRedo = new JButton("redo");
    btnRedo.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnRedoClicked();
      }
    });
    ret.add(btnRedo);

    return ret;
  }

  // --------------------------------------------------------------------------------

  public JPanel initToolBarPanel() {
    JPanel ret = new JPanel();

    ret.setLayout(new GridLayout(0, 1));

    ButtonGroup buttonGroup = new ButtonGroup();

    // ----------------------------------------

    JToggleButton btnSelect = new JToggleButton("Select");
    btnSelect.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // Dumb so far...
        // If no factory, then select is selected
        client.setPaintableFactory(null);
      }
    });
    ret.add(btnSelect);
    buttonGroup.add(btnSelect);

    // ----------------------------------------

    List<PaintableFactory> paintableFactoryList = //
    PluginsReader.fsRead(ClassLoader.getSystemResourceAsStream("plugins2.txt"));

    for (final PaintableFactory paintableFactory : paintableFactoryList) {
      JToggleButton btnTool = //
      new JToggleButton(paintableFactory.getClass().getSimpleName());
      btnTool.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          client.setPaintableFactory(paintableFactory);
          System.out.println(btnTool);
        }
      });
      ret.add(btnTool);
      buttonGroup.add(btnTool);
    }

    btnSelect.setSelected(true);

    return ret;
  }

  // --------------------------------------------------------------------------------

  protected void btnUndoClicked() {
    client.undo();
  }

  // --------------------------------------------------------------------------------

  protected void btnRedoClicked() {
    client.redo();
  }

  // --------------------------------------------------------------------------------

  public static void main(String[] args) {
    new FrmMain();
  }
}
