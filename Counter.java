import javax.swing.*;
import java.awt.event.*;  

class count
{
	static int counter;  //making static class variable
}


class Counter
{  
public static void main(String args[])  
	{  
		JFrame f= new JFrame("AWT Counter");
		
		JLabel l1,l2;                   //creating label
		l1=new JLabel("Counter");
		l2=new JLabel();
		l2.setText(String.valueOf(count.counter));
		l1.setBounds(50,50, 400,20);    //setting dimension of label
		l2.setBounds(150,50,400,20);
		
		JButton up, down , reset;
        up = new JButton("Count Up");
        down = new JButton("Count Down");
        reset = new JButton("Reset"); 
		
        up.setBounds(200,50,100,20);
        down.setBounds(305,50,110,20);
        reset.setBounds(425,50,100,20);
        
        f.add(l1);
		f.add(l2);
		f.add(up);
		f.add(down);
		f.add(reset);
		f.setSize(700,200);                 //JFrame dimension
        f.setLayout(null);  
        f.setVisible(true);

        up.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				 l2.setText(String.valueOf(++(count.counter)));        
			}
			
		  });
        down.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				 l2.setText(String.valueOf(--(count.counter)));        
			}
			
		  });

        reset.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				 l2.setText(String.valueOf(0));        
			}
			
		  });
		

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //closing Jframe
	}  
} 