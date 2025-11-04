import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

 public class Calculator implements ActionListener {
     JTextField t = new JTextField();
     JFrame f = new JFrame("FX991-MS");
     char operator;

     String str = t.getText();
     int A = Integer.parseInt(str);
     int B = Integer.parseInt(str);
     int result = 0;



     JButton b7 = new JButton("7");
     JButton b4 = new JButton("4");
     JButton b1 = new JButton("1");
     JButton b0 = new JButton("0");
     JButton b8 = new JButton("8");
     JButton b5 = new JButton("5");
     JButton b2 = new JButton("2");
     JButton bc = new JButton("C");
     JButton b9 = new JButton("9");
     JButton b6 = new JButton("6");
     JButton b3 = new JButton("3");
     JButton b = new JButton("=");
     JButton plus = new JButton("+");
     JButton minus = new JButton("-");
     JButton multiply = new JButton("*");
     JButton division = new JButton("/");

     int value = 0;
     JLabel output = new JLabel();
     Calculator() {
         f.setBounds(500, 300, 300, 350);
         b7.setBounds(20, 100, 50, 50);
         b4.setBounds(20, 150, 50, 50);
         b1.setBounds(20, 200, 50, 50);
         b0.setBounds(20, 250, 50, 50);
         b8.setBounds(70, 100, 50, 50);
         b5.setBounds(70, 150, 50, 50);
         b2.setBounds(70, 200, 50, 50);
         bc.setBounds(70, 250, 50, 50);
         b9.setBounds(120, 100, 50, 50);
         b6.setBounds(120, 150, 50, 50);
         b3.setBounds(120, 200, 50, 50);
         b.setBounds(120, 250, 50, 50);
         plus.setBounds(220, 100, 50, 50);
         minus.setBounds(220, 150, 50, 50);
         multiply.setBounds(220, 200, 50, 50);
         division.setBounds(220, 250, 50, 50);
         t.setBounds(20, 10, 230, 50);



         f.add(b7);
         f.add(b4);
         f.add(b1);
         f.add(b0);
         f.add(b8);
         f.add(b5);
         f.add(b2);
         f.add(bc);
         f.add(b9);
         f.add(b6);
         f.add(b3);
         f.add(b);
         f.add(plus);
         f.add(minus);
         f.add(multiply);
         f.add(division);
         f.add(t);
         t.setText(value + "");
         b0.addActionListener(this);
         b1.addActionListener(this);
         b3.addActionListener(this);
         b4.addActionListener(this);
         b5.addActionListener(this);
         b6.addActionListener(this);
         b7.addActionListener(this);
         b8.addActionListener(this);
         b9.addActionListener(this);
         b.addActionListener(this);


         plus.addActionListener(this);
         minus.addActionListener(this);
         multiply.addActionListener(this);
         division.addActionListener(this);


         f.setLayout(null);
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


     }

     public void actionPerformed(ActionEvent e) {

         if(e.getSource() == plus){
             int A = Integer.parseInt(t.getText());
             int B = Integer.parseInt(t.getText());
             int result = A + B;
             t.setText(String.valueOf(result));

         }
         if(e.getSource() == minus){
             int A = Integer.parseInt(t.getText());
             int B = Integer.parseInt(t.getText());
             int result = A - B;
             t.setText(String.valueOf(result));

         }
         if(e.getSource() == multiply){
             int A= Integer.parseInt(t.getText());
             int B= Integer.parseInt(t.getText());
             int result = A * B;
             t.setText(String.valueOf(result));

         }
         try {

         if(e.getSource() == division) {
             int A = Integer.parseInt(t.getText());
             int B = Integer.parseInt(t.getText());
             int result = A / B;
             t.setText(String.valueOf(result));
          }
         }catch (Exception e1){
                 t.setText("Error");
             }
         }



     public static void main(String[] args) {
         //Calculator c = new Calculator();
new Calcu();

     }
}





