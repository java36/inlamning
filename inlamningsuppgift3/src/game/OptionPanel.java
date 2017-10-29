package game;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class OptionPanel extends JPanel
{
	private JButton newGameBtn;
	private JButton quitBtn;
	
	public OptionPanel()
	{
		setSize(400,100);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		newGameBtn = new JButton("New Game");
		quitBtn = new JButton("    Quit   ");
		
		add(newGameBtn);
		add(quitBtn);
	}

}
