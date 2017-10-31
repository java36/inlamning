package inlämningsuppgift3;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame
{
	GamePanelList gamePanelList = new GamePanelList();
	ButtonList buttonList = new ButtonList();
	
	public MainFrame()
	{
		super("15 Spel");
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450,200,360,300);
		setVisible(true);
		
		
	}

}
