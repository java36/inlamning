package game;

import javax.swing.JButton;

public class GameButton extends JButton
{
	private int value;
	
	public void setValue(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public GameButton()
	{
		
	}
	
	public GameButton(int value)
	{
		this.value = value;
	}

}
