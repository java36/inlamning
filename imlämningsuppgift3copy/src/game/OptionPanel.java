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
	
	public OptionPanel()
	{
		setSize(400,100);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		newGameBtn = new JButton("New       ");
		quitBtn = new JButton("Quit        ");
		
		newGameBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
			
		});
		
		
		
		add(newGameBtn);
		add(quitBtn);
	}

}
