package game;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GameButtonList 
{
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
	
	private List<GameButton> gameButtonList = new ArrayList<>();
	
	public GameButtonList()
	{
		button1 = new GameButton(1);
		
		button2 = new GameButton(2);
		
		button3 = new GameButton(3);
		
		button4 = new GameButton(4);
		
		button5 = new GameButton(5);
		
		button6 = new GameButton(6);
		
		button7 = new GameButton(7);
		
		button8 = new GameButton(8);
		
		button9 = new GameButton(9);
		
		button10 = new GameButton(10);
		
		button11 = new GameButton(11);
		
		button12 = new GameButton(12);
		
		button13 = new GameButton(13);
		
		button14 = new GameButton(14);
		
		button15 = new GameButton(15);
		
		button16 = new GameButton(16);
		button16.setVisible(false);
		
		gameButtonList.add(button1);
		gameButtonList.add(button2);
		gameButtonList.add(button3);
		gameButtonList.add(button4);
		gameButtonList.add(button5);
		gameButtonList.add(button6);
		gameButtonList.add(button7);
		gameButtonList.add(button8);
		gameButtonList.add(button9);
		gameButtonList.add(button10);
		gameButtonList.add(button11);
		gameButtonList.add(button12);
		gameButtonList.add(button13);
		gameButtonList.add(button14);
		gameButtonList.add(button15);
		gameButtonList.add(button16);
		
		
	}
	
	public List<GameButton> getGameButtonList()
	{
		return gameButtonList;
	}

}
