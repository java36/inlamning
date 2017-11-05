package game;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class OptionPanel extends JPanel
{
	private JButton newGameBtn;
	private JButton quitBtn;
	private JButton solveBtn;
	private JButton shuffleBtn;
	
	private ButtonListener buttonListener;
	OptionListener optionListener = new OptionListener();
	
	public OptionPanel()
	{
		setSize(400,100);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		newGameBtn = new JButton("New       ");
		quitBtn = new JButton("Quit        ");
		shuffleBtn = new JButton("Shuffle  ");
		solveBtn = new JButton("Solve     ");
		
		newGameBtn.addActionListener(optionListener);	
		quitBtn.addActionListener(optionListener);
		shuffleBtn.addActionListener(optionListener);
		solveBtn.addActionListener(optionListener);
		
		
		add(newGameBtn);
		add(quitBtn);
		add(shuffleBtn);
		add(solveBtn);
	}
	
	public void stop()
	{
		quitBtn.removeActionListener(optionListener);
		shuffleBtn.removeActionListener(optionListener);
		solveBtn.removeActionListener(optionListener);
	}
	
	private class OptionListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource() == newGameBtn)
			{
				buttonListener.newGame();
				
			}
			
			if(e.getSource() == quitBtn)
			{
				buttonListener.quit();
			}
			if(e.getSource() == shuffleBtn)
			{
				buttonListener.shuffle();
			}
			
			if(e.getSource() == solveBtn)
			{
				buttonListener.solve();
			}
			
			
			
		}
		
	}
	
	public void setButtonListener(ButtonListener buttonListener)
	{
		this.buttonListener = buttonListener;
	}

}
