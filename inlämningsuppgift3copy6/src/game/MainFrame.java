package game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class MainFrame extends JFrame implements ButtonListener, WinGame
{
	
	private GamePanel gamePanel;
	private OptionPanel optionPanel;
	private MessagePanel messagePanel;
	
	public MainFrame() throws IOException
	{
		super("15 Spel");
		setLayout(new BorderLayout());
		
		optionPanel = new OptionPanel();
		optionPanel.setButtonListener(this);
		add(optionPanel, BorderLayout.NORTH);
				
		gamePanel = new GamePanel();
		gamePanel.setWinGame(this);
		add(gamePanel, BorderLayout.CENTER);
		
		messagePanel = new MessagePanel();
		messagePanel.setLabel("15 Puzzle");
		add(messagePanel, BorderLayout.SOUTH);
		
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setBounds(450,200,360,300);
		setVisible(true);
	}
	
	public void newGame()
	{
		this.dispose();
		try {
			new MainFrame();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void quit()
	{
		gamePanel.stop();
		optionPanel.stop();
		messagePanel.setLabel("LOOOOOSER!");
	}

	@Override
	public void solve() {
		gamePanel.solve();
		
	}

	@Override
	public void gameWon() 
	{
		messagePanel.setLabel("You Win!!!");
		gamePanel.gameWon();
		gamePanel.stop();
		optionPanel.stop();
		
	}

	@Override
	public void shuffle() 
	{
		gamePanel.shuffle();		
	}
	
	
	
	
	

}
