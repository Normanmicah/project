package minesweeper;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class Diff {
   Minesweeper ex;
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;

   public Diff(){
      prepareGUI();
   }

private void prepareGUI(){
    mainFrame = new JFrame("Java Swing Examples");
    mainFrame.setSize(400,400);
    mainFrame.setLayout(new GridLayout(3, 1));
    
    mainFrame.addWindowListener(new WindowAdapter() {
       public void windowClosing(WindowEvent windowEvent){
          System.exit(0);
       }        
    });    
    headerLabel = new JLabel("", JLabel.CENTER);        
    statusLabel = new JLabel("",JLabel.CENTER);    
    statusLabel.setSize(350,100);

    controlPanel = new JPanel();
    controlPanel.setLayout(new FlowLayout());

    mainFrame.add(headerLabel);
    mainFrame.add(controlPanel);
    mainFrame.add(statusLabel);
    mainFrame.setVisible(true);  
 }
    public void showButtonDemo(){
      
    headerLabel.setText("Control in action: Button"); 


    JButton okButton = new JButton("Easy");        
    JButton javaButton = new JButton("Medium");
    JButton cancelButton = new JButton("Hard");
    cancelButton.setHorizontalTextPosition(SwingConstants.LEFT);   

    okButton.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
          Board.N_MINES = 9;
          Board.N_ROWS = 10;
          Board.N_COLS = 10;
          mainFrame.setVisible(false); 
          ex = new Minesweeper();
          ex.setVisible(true);

       }          
    });
    javaButton.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
         Board.N_MINES = 40;
          Board.N_ROWS = 16;
          Board.N_COLS = 16;
          mainFrame.setVisible(false); 
          ex = new Minesweeper();
          ex.setVisible(true);
       }
    });
    cancelButton.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
         Board.N_MINES = 99;
         Board.N_ROWS = 16;
         Board.N_COLS = 30;
         mainFrame.setVisible(false);
         ex = new Minesweeper();
         ex.setVisible(true);
       }
    });
    controlPanel.add(okButton);
    controlPanel.add(javaButton);
    controlPanel.add(cancelButton);       

    mainFrame.setVisible(true);  
 }
}