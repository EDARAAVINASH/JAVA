import java.awt.*;
import java.awt.event.*;
class Calculator extends WindowAdapter implements ActionListener
{
	String str="";
	String operation="";
	int n1=0,n2=0;
	Frame f1=new Frame("Simple Calculator");
	Panel tPanel,cPanel;//,bPanel;
	Button b1[]=new Button[10];
	Button add,sub,mul,div,clear,equals;
	TextField tf=new TextField(50);
	Com()
	{
		tPanel=new Panel();
		//tf.setBounds(0,0,50,150);
		tPanel.setLayout(new FlowLayout());
		tPanel.add(tf);
		//tPanel.setSize(500,100);
		cPanel=new Panel();
		for(int i=0;i<10;i++)
		{
			b1[i]=new Button(""+i);
			cPanel.add(b1[i]);
			b1[i].addActionListener(this);
		}
		add=new Button("+");
		sub=new Button("-");
		mul=new Button("*");
		div=new Button("/");
		clear=new Button("C");
		equals=new Button("=");
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		clear.addActionListener(this);
		equals.addActionListener(this);
		cPanel.add(add);
		cPanel.add(sub);
		cPanel.add(mul);
		cPanel.add(div);
		cPanel.add(clear);
		cPanel.add(equals);
		cPanel.setLayout(new GridLayout(4,4,3,3));
		cPanel.setFont(new Font("Serif",Font.BOLD,30));
		//bPanel=new Panel();
		//tPanel.setBackground(Color.red);
		cPanel.setBackground(Color.black);
		//bPanel.setBackground(Color.green);
		f1.setLayout(new BorderLayout());
		f1.add(tPanel,BorderLayout.NORTH);
		f1.add(cPanel,BorderLayout.CENTER);
		//f1.add(bPanel,BorderLayout.SOUTH);
		f1.addWindowListener(this);
		f1.setSize(500,500);
		f1.setVisible(true);
	}
	public void windowClosing(WindowEvent we)
	{
		f1.dispose();
	}
	public void actionPerformed(ActionEvent ae)
	{
		str=ae.getActionCommand();
		if(Character.isDigit(str.charAt(0)))
		{
			tf.setText(tf.getText()+str);
		}
		else
		{
			if(str.equals("+"))
			{
				n1=n1+Integer.parseInt(tf.getText());
				operation=str;
				tf.setText("");
			}
			else if(str.equals("-"))
			{
				n1=Integer.parseInt(tf.getText());
				operation=str;
				tf.setText("");
			}
			else if(str.equals("*"))
			{
				n1=Integer.parseInt(tf.getText());
				operation=str;
				tf.setText("");
			}
			else if(str.equals("/"))
			{
				n1=Integer.parseInt(tf.getText());
				operation=str;
				tf.setText("");
			}
			else if(str.equals("="))
			{
				n2=Integer.parseInt(tf.getText());
				if(operation.equals("+"))
				tf.setText(""+(n1+n2));
				else if(operation.equals("-"))
				tf.setText(""+(n1-n2));
			else if(operation.equals("*"))
				tf.setText(""+(n1*n2));
			else if(operation.equals("/"))
			{
				try{
				tf.setText(""+(n1/n2));
				}
				catch(ArithmeticException a)
				{
					tf.setText("Math Error");
				}
			}
			}
			else if(str.equals("C"))
				tf.setText("");
			
		}
	}
	public static void main(String args[])
	{
		Calculator c1=new Calculator();
	}
}