package game;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
	
	private GameButtonList gblObject = new GameButtonList();
	private IconList ilObject = new IconList();
	
	private List<GameButton> gameButtonList;
	private List<Icon> iconList;
	
	private GameButton invisibleButton;
	
	
	
	
	public GamePanel()
	{
		setSize(400,400);
		setBackground(Color.WHITE);
		setLayout(new GridBagLayout());
		
		gameButtonList = gblObject.getGameButtonList();
		iconList = ilObject.getIconList();
		Collections.shuffle(iconList);
		System.out.println(iconList.toString());
		
		
		GridBagConstraints gc = new GridBagConstraints();
		
		
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		
		for(int i=0; i<4;i++)
		{
			for (int j=0; j<4; j++)
			{
				gc.gridy = i;
				gc.gridx = j;
				
				if(!gameButtonList.isEmpty())
				{
					GameButton button = gameButtonList.remove(0);
					if(!iconList.isEmpty())
						button.setIcon(iconList.remove(0));
					add(button, gc);
				}
			}
		}
		
	
		
//		gc.gridx = 0;
//		gc.gridy = 0;
//		add(buttonList.remove(0), gc);
//		
//		
//		
//		gc.gridx = 1;
//		gc.gridy = 0;
//		add(buttonList.remove(0), gc);
//		
//		gc.gridx = 2;
//		gc.gridy = 0;
//		add(buttonList.remove(0), gc);
//		
//		gc.gridx = 3;
//		gc.gridy = 0;
//		add(buttonList.remove(0), gc);
//		
//		gc.gridx = 0;
//		gc.gridy = 1;
//		add(buttonList.remove(0), gc);
//		
//		gc.gridx = 1;
//		gc.gridy = 1;
//		add(buttonList.remove(0), gc);
//		
//		gc.gridx = 2;
//		gc.gridy = 1;
//		add(buttonList.remove(0), gc);
//		
//		gc.gridx = 3;
//		gc.gridy = 1;
//		add(buttonList.remove(0), gc);
//		
//		gc.gridx = 0;
//		gc.gridy = 2;
//		add(buttonList.remove(0), gc);
//		
//		gc.gridx = 1;
//		gc.gridy = 2;
//		add(buttonList.remove(0), gc);
//		
//		gc.gridx = 2;
//		gc.gridy = 2;
//		add(buttonList.remove(0), gc);
//		
//		gc.gridx = 3;
//		gc.gridy = 2;
//		add(buttonList.remove(0), gc);
//		
//		gc.gridx = 0;
//		gc.gridy = 3;
//		add(buttonList.remove(0), gc);
//		
//		gc.gridx = 1;
//		gc.gridy = 3;
//		add(buttonList.remove(0), gc);
//		
//		gc.gridx = 2;
//		gc.gridy = 3;
//		add(buttonList.remove(0), gc);
//		
		
		
		
		
		
	}
	
//	public List<JButton> shuffle()
//	{
//		List<JButton> originalList = new ArrayList();
//		List<JButton> returnedList = new ArrayList();
//		Random rand = new Random();
//		
//		originalList.add(button1);
//		originalList.add(button2);
//		originalList.add(button3);
//		originalList.add(button4);
//		originalList.add(button5);
//		originalList.add(button6);
//		originalList.add(button7);
//		originalList.add(button8);
//		originalList.add(button9);
//		originalList.add(button10);
//		originalList.add(button11);
//		originalList.add(button12);
//		originalList.add(button13);
//		originalList.add(button14);
//		originalList.add(button15);
//		
//		for(int i=0; i<15; i++)
//		{
//			returnedList.add(originalList.remove(rand.nextInt(originalList.size())));
//		}
//		
//		
//		
//		return returnedList;
//		
//
//	}

}
