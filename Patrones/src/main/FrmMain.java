package main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public final class FrmMain extends JFrame {

  private final Canvas client;

  // --------------------------------------------------------------------------------

  public FrmMain() {
    setLayout(new BorderLayout());

    client = new Canvas();
    add(client, BorderLayout.CENTER);

    add(initTopPanel(), BorderLayout.NORTH);

    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(640, 480);
    setVisible(true);
  }

  // --------------------------------------------------------------------------------

  public JPanel initTopPanel() {
    JPanel ret = new JPanel();

    JButton btnUndo = new JButton("undo");
    btnUndo.addActionListener((ActionEvent e) -> {
        btnUndoClicked();
    });
    ret.add(btnUndo);

    JButton btnRedo = new JButton("redo");
    btnRedo.addActionListener((ActionEvent e) -> {
        btnRedoClicked();
    });
    ret.add(btnRedo);

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
