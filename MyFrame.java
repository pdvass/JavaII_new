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
    initEvent();
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

  private void initEvent(){

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e){
       System.exit(1);
      }
    });

    btnExit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnExitClick(e);
      }
    });

    btnSpellcheck.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnSpellcheckClick(e);
      }
    });
  }

  private void btnExitClick(ActionEvent evt){
    System.exit(0);
  }

  private void btnSpellcheckClick(ActionEvent evt){
    String x = "";
    try{
      x = txtInput.getText();

      txtResult.append(x);

    }catch(Exception e){
      System.out.println(e);
      JOptionPane.showMessageDialog(null,
          e.toString(),
          "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }
}