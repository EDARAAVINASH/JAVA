import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample extends Frame implements MouseListener
{
	Label i;
 	MouseListenerExample() 
  	{
	addMouseListener(this);
    i=new Label();
 	i.setBounds(20,50,100,20);
 	add(i);
 	setSize(300,300);
 	setLayout(null);
	setVisible(true);
	}
 	public void mouseClicked(MouseEvent e)
    	{ 
 	i.setText("Mouse Clicked");
 	}
 	public void mouseEntered(MouseEvent e)
    	{ 
 	i.setText("Mouse Entered");
 	}
 	public void mouseExited(MouseEvent e)
    	{
			 	i.setText("Mouse Exited");
		}
	public void mousePressed(MouseEvent e)
    	{ 
	i.setText("Mouse Pressed");
 	}
 	public void mouseReleased(MouseEvent e)
    	{
			 	i.setText("Mouse Released");
	}
	public static void main(String args[])
    	{
 	new MouseListenerExample();
	}
}