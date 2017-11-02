package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class MainFrame extends JFrame implements ButtonListener
{
	
	private GamePanel gamePanel;
	private OptionPanel optionPanel;
	private MessagePanel messagePanel;
	
	public MainFrame()
	{
		super("15 Spel");
		setLayout(new BorderLayout());
		
		optionPanel = new OptionPanel();
		add(optionPanel, BorderLayout.NORTH);
				
		gamePanel = new GamePanel();
		add(gamePanel, BorderLayout.CENTER);
		
		messagePanel = new MessagePanel();
		messagePanel.setLabel(gamePanel.getPanelMessage());
		add(messagePanel, BorderLayout.SOUTH);
		
		optionPanel.setButtonListener(this);
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setBounds(450,200,360,300);
		setVisible(true);
	}
	
	public void newGame()
	{
		this.dispose();
		new MainFrame();
		
		
	}
	public void quit()
	{
		gamePanel.setVisible(false);
		messagePanel.setLabel("LOOOOOSER!");
	}

	@Override
	public void solve() {
		gamePanel.solve();
		
	}
	
	
	
	
	

}
