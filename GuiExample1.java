import javax.swing.*;
import java.awt.event.*;  
class GuiExample1 
{  
public static void main(String args[])  
	{  
		JFrame f= new JFrame("Perform Operations");

		JLabel l1,l2,l3,l4;                   //creating label
		l1=new JLabel("First Number");
		l2=new JLabel("Second Number");
		l3=new JLabel("Result");
		l4=new JLabel("Result Here shown");
		l1.setBounds(50,50, 400,20);     //setting dimension of label
		l2.setBounds(50,100, 400,20);
		l3.setBounds(50,150,400,20);
		l4.setBounds(150,150,150,20);



		JTextField t1,t2;               // creating textboxes
		t1=new JTextField();  
		t2=new JTextField();  
		t1.setBounds(150,50, 150,20);    // setting dimensions of textboxex
		t2.setBounds(150,100,150,20);  

		JButton sum, diff , mul ,divide, mod, clr; 
		sum=new JButton("+");
		diff = new JButton("-");            // creating button
		mul = new JButton("*");
		divide = new JButton("/");
		mod = new JButton("%");
		clr = new JButton("CLEAR");

		sum.setBounds(50,200,100,20);
		diff.setBounds(160,200,100,20);

		mul.setBounds(50,222,100,20);
		divide.setBounds(160,222,100,20);


		mod.setBounds(50,244,100,20);
		clr.setBounds(160,244,100,20);
	  
		f.add(t1);                          //adding to Jframe
		f.add(t2);
		f.add(sum);f.add(diff);
		f.add(mul);f.add(divide);
		f.add(mod);f.add(clr);
		f.add(l1); f.add(l2); f.add(l3);f.add(l4);
		f.setSize(800,800);                 //JFrame dimension
		f.setLayout(null);  
		f.setVisible(true);  

		sum.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				int a = Integer.parseInt(t1.getText());
				int b =  Integer.parseInt(t2.getText());  
				l4.setText(String.valueOf(a+b));         
			}
			
		  });

		 diff.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				int a = Integer.parseInt(t1.getText());
				int b =  Integer.parseInt(t2.getText());  
				l4.setText(String.valueOf(a-b));         
			}
			
		  });   
		 mul.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				int a = Integer.parseInt(t1.getText());
				int b =  Integer.parseInt(t2.getText());  
				l4.setText(String.valueOf(a*b));         
			}
		  });
		   divide.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				int a = Integer.parseInt(t1.getText());
				int b =  Integer.parseInt(t2.getText()); 
				float res = (float) a/b; 
				l4.setText(String.valueOf(res));         
			}
		   }); 
			mod.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				int a = Integer.parseInt(t1.getText());
				int b =  Integer.parseInt(t2.getText()); 
				l4.setText(String.valueOf(a % b));         
			}
		  });        

		 clr.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e)
			{
				
				t1.setText(null);
				t2.setText(null);        
			}
		   }); 

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //closing Jframe
	}  
} 