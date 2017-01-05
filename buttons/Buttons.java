import java.awt.*;
import java.awt.event.*;

class Buttons extends Frame implements ActionListener
{
	public Buttons()
	{
	}

	public void showwindow()
	{
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		Button b = new Button("Quit");
		b.setBounds(50, 220, 200, 30);
		add(b);

		b.addActionListener(this);
	}

	public void actionPerformed(ActionEvent event)
	{
		dispose();
		System.exit(0);
	}

	public static void main(String args[])
	{
		Buttons b = new Buttons();
		b.showwindow();
	}
}
