import java.awt.*;
public class Awtprogram1{
	public Awtprogram1(){
	Frame f=new Frame();
	Button btn=new Button();
	btn.setBounds(80,80,100,50);
	f.setSize(300,250);
	f.setTitle("Java");
	f.setLayout(null);
	f.setVisible(true);
	}
	public static void main(String args[])
	{
		Awtprogram1 obj=new Awtprogram1();
	}
}