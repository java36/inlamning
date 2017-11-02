package game;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MessagePanel extends JPanel
{
	private JLabel label;
	
	public MessagePanel()
	{
		setLayout(new FlowLayout());
		//setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 1));
		
		label = new JLabel();
		label.setFont(new Font("Serif", Font.BOLD, 20));
		add(label);
		
		setSize(360,100);
		setVisible(true);
	}
	
	public void setLabel(String str)
	{
		label.setText(str);
	}

	
}
