import javax.swing.*;
import java.awt.event.*;  
class GuiExample  
{  
public static void main(String args[])  
    {  
        JFrame f= new JFrame("Question 3");  
        JTextField t1,t2;               // creating textboxes
        t1=new JTextField();  
        t2=new JTextField();  
        t1.setBounds(50,50, 150,20);    // setting dimensions of textboxex
        t2.setBounds(50,100,150,20);  

        JButton b=new JButton("Concatenate");  // creating button
        b.setBounds(50,150,150,20);
        
        JLabel l1,l2;                   //creating label
        l1=new JLabel();
        l2=new JLabel();
        l1.setBounds(50,200, 400,20);     //setting dimension of label
        l2.setBounds(50,250, 400,20);

        f.add(t1);                          //adding to Jframe
        f.add(t2);
        f.add(b);
        f.add(l1); f.add(l2);  
        f.setSize(800,800);                 //JFrame dimension
        f.setLayout(null);  
        f.setVisible(true);  

        b.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e)
            {
                String a = t1.getText();    // fetching from textboxes
                String b = t2.getText();
                String c = a.concat(b);     // concatenating
                int vowels = 0;
                l1.setText("FINAL STRING:: "+c);   // setting to label l1

                for(int i = 0; i<c.length(); i++)    // counting vowels in string c
                {
                    if(c.charAt(i)=='a' || c.charAt(i)=='A' || c.charAt(i)=='e' || c.charAt(i)=='E'
                        || c.charAt(i)=='i' || c.charAt(i)=='I' || c.charAt(i)=='o' || c.charAt(i)=='O'
                            || c.charAt(i)=='u' || c.charAt(i)=='U')
                        vowels++;
                }
                l2.setText("Total vowels in Final String:: "+String.valueOf(vowels));
            }

        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //closing Jframe
    }  
} 