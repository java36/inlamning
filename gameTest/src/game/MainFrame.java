package game;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;

import javax.swing.JFrame;


public class MainFrame extends JFrame
{
	private GamePanel gamePanel;
	private OptionPanel optionPanel;
	
	public MainFrame()
	{
		super("15 Spel");
		setLayout(new BorderLayout());
		
		optionPanel = new OptionPanel();
		add(optionPanel, BorderLayout.NORTH);
		
		gamePanel = new GamePanel();
		add(gamePanel, BorderLayout.CENTER);
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450,200,360,300);
		setVisible(true);
	}

}
