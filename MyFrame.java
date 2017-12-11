import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame {

  private JButton btnExit  = new JButton("Exit");
  private JButton btnSpellcheck = new JButton("Check spelling");

  private JTextArea txtInput = new JTextArea();

  private JTextArea txtResult = new JTextArea();



  private JLabel lblInput = new JLabel("Type your text :");
  private JLabel lblResult = new JLabel("Result :");

  public MyFrame(){
    setTitle("SpellChecker");
    setSize(600,200);
    setLocation(new Point(300,200));
    setLayout(null);
    setResizable(false);

    initComponent();
  }

  private void initComponent(){
    btnExit.setBounds(450,130, 120,25);
    btnSpellcheck.setBounds(450,10, 120,50);

    txtInput.setBounds(110,10,340,50);
	txtResult.setEditable(false);
    txtResult.setBounds(110,65,340,50);

    lblInput.setBounds(20,10,100,20);

    lblResult.setBounds(20,65,100,20);


    add(btnExit);
    add(btnSpellcheck);

    add(lblInput);
    add(lblResult);

    add(txtInput);
    add(txtResult);
  }
}
