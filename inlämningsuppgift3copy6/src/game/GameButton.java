package game;

import javax.swing.JButton;

public class GameButton extends JButton
{
	private int buttonValue;
	private int buttonX;
	private int buttonY;
	private GameIcon gameIcon;
	
	public GameIcon getGameIcon() {
		return gameIcon;
	}

	public void setGameIcon(GameIcon gameIcon) {
		setIcon(gameIcon);
		this.gameIcon = gameIcon;
	}

	public int getButtonX() 
	{
		return buttonX;
	}

	public int getButtonY() 
	{
		return buttonY;
	}

	public void setButtonValue(int value)
	{
		this.buttonValue = value;
	}
	
	public int getButtonValue()
	{
		return buttonValue;
	}
	
	public GameButton()
	{
		
	}
	
	public GameButton(int buttonValue, int buttonX, int buttonY)
	{
		this.buttonValue = buttonValue;
		this.buttonX = buttonX;
		this.buttonY = buttonY;
	}

}
