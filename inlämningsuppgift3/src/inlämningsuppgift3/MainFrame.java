package inlämningsuppgift3;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame
{
	
	public MainFrame()
	{
		super("15 Spel");
		setLayout(new GridBagLayout());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450,200,360,300);
		setVisible(true);
		
		
	}

}
