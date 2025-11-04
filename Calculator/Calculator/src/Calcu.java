import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcu extends JFrame {
    JButton [] numButtons  = new JButton[10];
    JButton [] funButtons = new JButton[8];
    JButton Add, sub, multi, div, equal,clear;
    JPanel panel;
    JTextField t;

    int result =0,num1=0,num2=0;
    char operator;



    public Calcu(){

        numButtons[0] = new JButton("0");
        numButtons[1] = new JButton("1");
        numButtons[2] = new JButton("2");
        numButtons[3] = new JButton("3");
        numButtons[4] = new JButton("4");
        numButtons[5] = new JButton("5");
        numButtons[6] = new JButton("6");
        numButtons[7] = new JButton("7");
        numButtons[8] = new JButton("8");
        numButtons[9] = new JButton("9");


        t = new JTextField();
        t.setBounds(40,25,300,50);
        t.setEditable(false);
        add(t);

        Add = new JButton("+");
        sub = new JButton("-");
        multi = new JButton("*");
        div = new JButton("/");
        equal = new JButton("=");
        clear = new JButton("C");


        funButtons [0] = Add;
        funButtons [1] = sub;
        funButtons [2] = multi;
        funButtons [3] = div;
        funButtons [4] = equal;
        funButtons [5] = clear;

        panel = new JPanel();
        panel.setBounds(40,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        add(panel);

        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);
        panel.add(Add);
        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);
        panel.add(sub);
        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);
        panel.add(multi);
        panel.add(numButtons[0]);
        panel.add(clear);
        panel.add(equal);
        panel.add(div);

        ActionListener a1 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                for(int i=0; i<10; i++){
                    if(e.getSource()==numButtons[i]){
                        t.setText(t.getText().concat(String.valueOf(i)));
                    }

                }
                if(e.getSource()==Add){
                    num1 = Integer.parseInt(t.getText());
                    operator='+';
                    t.setText("");
                }
                if(e.getSource()==sub){
                    num1 = Integer.parseInt(t.getText());
                    operator='-';
                    t.setText("");
                }
                if(e.getSource()==multi){
                    num1 = Integer.parseInt(t.getText());
                    operator='*';
                    t.setText("");
                }
                if(e.getSource()==div){
                    num1 = Integer.parseInt(t.getText());
                    operator='/';
                    t.setText("");
                }
                if(e.getSource()==equal){
                    num2 = Integer.parseInt(t.getText());
                    switch (operator){
                        case'+':
                            result = num1+num2;
                            break;
                        case'-':
                            result = num1-num2;
                            break;
                        case'*':
                            result = num1*num2;
                            break;
                        case'/':
                            result = num1/num2;
                            break;
                    }
                    t.setText(String.valueOf(result));
                    num1 = result;


                }
                if(e.getSource()==clear){
                    t.setText("");
                }



            }
        };
        numButtons[0].addActionListener(a1);
        numButtons[1].addActionListener(a1);
        numButtons[2].addActionListener(a1);
        numButtons[3].addActionListener(a1);
        numButtons[4].addActionListener(a1);
        numButtons[5].addActionListener(a1);
        numButtons[6].addActionListener(a1);
        numButtons[7].addActionListener(a1);
        numButtons[8].addActionListener(a1);
        numButtons[9].addActionListener(a1);
        Add.addActionListener(a1);
        sub.addActionListener(a1);
        multi.addActionListener(a1);
        div.addActionListener(a1);
        equal.addActionListener(a1);
        clear.addActionListener(a1);












        setLayout(null);
        setTitle("FX991-MX");
        setVisible(true);
        setSize(400, 480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
