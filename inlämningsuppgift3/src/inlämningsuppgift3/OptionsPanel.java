package inlämningsuppgift3;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class OptionsPanel extends JPanel
{
	private JButton newGameBtn;
	private JButton quitBtn;
	
	public OptionsPanel()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setSize(400,50);
		
		newGameBtn = new JButton("New Game");
		add(newGameBtn);
		
		quitBtn = new JButton("Quit");
		add(quitBtn);
	}

}
