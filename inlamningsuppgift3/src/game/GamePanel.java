package game;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GamePanel extends JPanel
{
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button10;
	private JButton button11;
	private JButton button12;
	private JButton button13;
	private JButton button14;
	private JButton button15;
	
	public GamePanel()
	{
		setSize(400,400);
		setBackground(Color.WHITE);
		setLayout(new GridBagLayout());
		
		button1 = new JButton();
		button1.setIcon(new ImageIcon("1.png"));
		button2 = new JButton();
		button2.setIcon(new ImageIcon("2.png"));
		button3 = new JButton();
		button3.setIcon(new ImageIcon("3.png"));
		button4 = new JButton();
		button4.setIcon(new ImageIcon("4.png"));
		button5 = new JButton();
		button5.setIcon(new ImageIcon("5.png"));
		button6 = new JButton();
		button6.setIcon(new ImageIcon("6.png"));
		button7 = new JButton();
		button7.setIcon(new ImageIcon("7.png"));
		button8 = new JButton();
		button8.setIcon(new ImageIcon("8.png"));
		button9 = new JButton();
		button9.setIcon(new ImageIcon("9.png"));
		button10 = new JButton();
		button10.setIcon(new ImageIcon("10.png"));
		button11 = new JButton();
		button11.setIcon(new ImageIcon("11.png"));
		button12 = new JButton();
		button12.setIcon(new ImageIcon("12.png"));
		button13 = new JButton();
		button13.setIcon(new ImageIcon("13.png"));
		button14 = new JButton();
		button14.setIcon(new ImageIcon("14.png"));
		button15 = new JButton();
		button15.setIcon(new ImageIcon("15.png"));
		
		GridBagConstraints gc = new GridBagConstraints();
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		add(button1, gc);
		
		
		
		gc.gridx = 1;
		gc.gridy = 0;
		add(button2, gc);
		
		gc.gridx = 2;
		gc.gridy = 0;
		add(button3, gc);
		
		gc.gridx = 3;
		gc.gridy = 0;
		add(button4, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		add(button5, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		add(button6, gc);
		
		gc.gridx = 2;
		gc.gridy = 1;
		add(button7, gc);
		
		gc.gridx = 3;
		gc.gridy = 1;
		add(button8, gc);
		
		gc.gridx = 0;
		gc.gridy = 2;
		add(button9, gc);
		
		gc.gridx = 1;
		gc.gridy = 2;
		add(button10, gc);
		
		gc.gridx = 2;
		gc.gridy = 2;
		add(button11, gc);
		
		gc.gridx = 3;
		gc.gridy = 2;
		add(button12, gc);
		
		gc.gridx = 0;
		gc.gridy = 3;
		add(button13, gc);
		
		gc.gridx = 1;
		gc.gridy = 3;
		add(button14, gc);
		
		gc.gridx = 2;
		gc.gridy = 3;
		add(button15, gc);
		
		
	}

}
