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
	
	private ButtonListener buttonListener;
	
	public OptionPanel()
	{
		setSize(400,100);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		newGameBtn = new JButton("New       ");
		quitBtn = new JButton("Quit        ");
		solveBtn = new JButton("Solve     ");
		
		OptionListener optionListener = new OptionListener();
		newGameBtn.addActionListener(optionListener);	
		quitBtn.addActionListener(optionListener);
		solveBtn.addActionListener(optionListener);
		
		
		add(newGameBtn);
		add(quitBtn);
		add(solveBtn);
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
