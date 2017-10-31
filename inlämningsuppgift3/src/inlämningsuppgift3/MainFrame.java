package inlämningsuppgift3;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame
{
	private GamePanelList gamePanelList; 
	private ButtonList buttonList; 
	private OptionsPanel optionPanel; 
	
	public MainFrame()
	{
		super("15 Spel");
		setLayout(new GridBagLayout());
		
		gamePanelList = new GamePanelList();
		buttonList = new ButtonList();
		optionPanel = new OptionsPanel();
		
		
		GridBagConstraints gc = new GridBagConstraints();
		gc.weightx = 4;
		gc.weighty = 1;
		gc.gridx = 0;
		gc.gridy = 0;
		add(optionPanel, gc);
		
		gc.weightx = 1;
		gc.weighty = 1;
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450,200,360,300);
		setVisible(true);
		
		
	}

}
