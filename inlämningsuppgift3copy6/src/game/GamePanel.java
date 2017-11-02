package game;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GamePanel extends JPanel 
{
	
	private String panelMessage = "15 Puzzle";
	private IconList ilObject = new IconList();
	private IconList ilObject2 = new IconList();
	
	private List<Icon> iconList;
	private List<Icon> iconList2;
	
	private GameButton button1;
	private GameButton button2;
	private GameButton button3;
	private GameButton button4;
	private GameButton button5;
	private GameButton button6;
	private GameButton button7;
	private GameButton button8;
	private GameButton button9;
	private GameButton button10;
	private GameButton button11;
	private GameButton button12;
	private GameButton button13;
	private GameButton button14;
	private GameButton button15;
	private GameButton button16;
	
	private GameButton invisibleButton;
	
	Listener listener = new Listener();
	
	
	
	public GamePanel()
	{
		setBackground(Color.WHITE);
		setLayout(new GridBagLayout());
		setSize(360,250);
		
		iconList = ilObject.getIconList();
		Collections.shuffle(iconList);
		
		
		GridBagConstraints gc = new GridBagConstraints();
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		
		
		/////////First Row////////////////////////////////////
		
		gc.gridx = 0;
		gc.gridy = 0;
		
		button1 = new GameButton(1);
		button1.setIcon(iconList.remove(0));
		button1.addActionListener(listener);
		add(button1, gc);
		
		
		gc.gridx = 1;
		gc.gridy = 0;
		
		button2 = new GameButton(2);
		button2.setIcon(iconList.remove(0));
		button2.addActionListener(listener);
		add(button2, gc);
		
		gc.gridx = 2;
		gc.gridy = 0;
		
		button3 = new GameButton(3);
		button3.setIcon(iconList.remove(0));
		button3.addActionListener(listener);
		add(button3, gc);
		
		gc.gridx = 3;
		gc.gridy = 0;
		
		button4 = new GameButton(4);
		button4.setIcon(iconList.remove(0));
		button4.addActionListener(listener);
		add(button4, gc);
		
		//////////////Second Row////////////
		
		gc.gridx = 0;
		gc.gridy = 1;
		
		button5 = new GameButton(5);
		button5.setIcon(iconList.remove(0));
		button5.addActionListener(listener);
		add(button5, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		
		button6 = new GameButton(6);
		button6.setIcon(iconList.remove(0));
		button6.addActionListener(listener);
		add(button6, gc);
		
		gc.gridx = 2;
		gc.gridy = 1;
		
		button7 = new GameButton(7);
		button7.setIcon(iconList.remove(0));
		button7.addActionListener(listener);
		add(button7, gc);
		
		gc.gridx = 3;
		gc.gridy = 1;
		
		button8 = new GameButton(8);
		button8.setIcon(iconList.remove(0));
		button8.addActionListener(listener);
		add(button8, gc);
		
		////////Third Row//////////////
		
		gc.gridx = 0;
		gc.gridy = 2;
		
		button9 = new GameButton(9);
		button9.setIcon(iconList.remove(0));
		button9.addActionListener(listener);
		add(button9, gc);
		
		gc.gridx = 1;
		gc.gridy = 2;
		
		button10 = new GameButton(10);
		button10.setIcon(iconList.remove(0));
		button10.addActionListener(listener);
		add(button10, gc);
		
		gc.gridx = 2;
		gc.gridy = 2;
		
		button11 = new GameButton(11);
		button11.setIcon(iconList.remove(0));
		button11.addActionListener(listener);
		add(button11, gc);
		
		gc.gridx = 3;
		gc.gridy = 2;
		
		button12 = new GameButton(12);
		button12.setIcon(iconList.remove(0));
		button12.addActionListener(listener);
		add(button12, gc);
		
		///////////Fourth Row///////////////
		
		gc.gridx = 0;
		gc.gridy = 3;
		
		button13 = new GameButton(13);
		button13.setIcon(iconList.remove(0));
		button13.addActionListener(listener);
		add(button13, gc);
		
		gc.gridx = 1;
		gc.gridy = 3;
		
		button14 = new GameButton(14);
		button14.setIcon(iconList.remove(0));
		button14.addActionListener(listener);
		add(button14, gc);
		
		gc.gridx = 2;
		gc.gridy = 3;
		
		button15 = new GameButton(15);
		button15.setIcon(iconList.remove(0));
		button15.addActionListener(listener);
		add(button15, gc);
		
		gc.gridx = 3;
		gc.gridy = 3;
		
		button16 = new GameButton(16);
		button16.setVisible(false);
		button16.addActionListener(listener);
		add(button16, gc);
		
		invisibleButton = button16;
	}
	
	public String getPanelMessage()
	{
		return panelMessage;
	}
	
	
	
	
	
	public void solve()
	{
		iconList2 = ilObject2.getIconList();
		button1.setIcon(iconList2.remove(0));
//		button1.setIcon(new ImageIcon("1.png"));
		button1.setVisible(true);
		button2.setIcon(new ImageIcon("2.png"));
		button2.setVisible(true);
		button3.setIcon(new ImageIcon("3.png"));
		button3.setVisible(true);
		button4.setIcon(new ImageIcon("4.png"));
		button4.setVisible(true);
		button5.setIcon(new ImageIcon("5.png"));
		button5.setVisible(true);
		button6.setIcon(new ImageIcon("6.png"));
		button6.setVisible(true);
		button7.setIcon(new ImageIcon("7.png"));
		button7.setVisible(true);
		button8.setIcon(new ImageIcon("8.png"));
		button8.setVisible(true);
		button9.setIcon(new ImageIcon("9.png"));
		button9.setVisible(true);
		button10.setIcon(new ImageIcon("10.png"));
		button10.setVisible(true);
		button11.setIcon(new ImageIcon("11.png"));
		button11.setVisible(true);
		button12.setIcon(new ImageIcon("12.png"));
		button12.setVisible(true);
		button13.setIcon(new ImageIcon("13.png"));
		button13.setVisible(true);
		button14.setIcon(new ImageIcon("14.png"));
		button14.setVisible(true);
		button15.setIcon(new ImageIcon("15.png"));
		button15.setVisible(true);
		button16.setVisible(false);
		invisibleButton = button16;
			
	}
	
	
	
	
	class Listener implements ActionListener
	{
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			
			GameButton button = (GameButton) e.getSource();
			int value = button.getValue();
			
			if((Math.abs(value - invisibleButton.getValue()) == 1) || (Math.abs(value - invisibleButton.getValue()) == 4))
			{
				invisibleButton.setIcon(button.getIcon());
				invisibleButton.setVisible(true);
				button.setIcon(null);
				button.setVisible(false);
				invisibleButton = button;
			}
			if(invisibleButton.equals(button16))
			{
				if((button1.getIcon().toString().equalsIgnoreCase("1.png")) && (button2.getIcon().toString().equalsIgnoreCase("2.png")) && (button3.getIcon().toString().equalsIgnoreCase("3.png")) && (button4.getIcon().toString().equalsIgnoreCase("4.png")) && (button5.getIcon().toString().equalsIgnoreCase("5.png" )) && (button6.getIcon().toString().equalsIgnoreCase("6.png")) && (button7.getIcon().toString().equalsIgnoreCase("7.png")) && (button8.getIcon().toString().equalsIgnoreCase("8.png")) && (button9.getIcon().toString().equalsIgnoreCase("9.png")) && (button10.getIcon().toString().equalsIgnoreCase("10.png")) && (button11.getIcon().toString().equalsIgnoreCase("11.png")) && (button12.getIcon().toString().equalsIgnoreCase("12.png")) && (button13.getIcon().toString().equalsIgnoreCase("13.png")) && (button14.getIcon().toString().equalsIgnoreCase("14.png")) && (button15.getIcon().toString().equalsIgnoreCase("15.png")))
					panelMessage = "You Win!";			
			}
			
		}
		
	}
	
	


}
