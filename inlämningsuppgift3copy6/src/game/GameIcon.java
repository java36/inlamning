package game;

import javax.swing.ImageIcon;

public class GameIcon extends ImageIcon
{
	private int iconValue;
	private int iconX;
	private int iconY;
	private GameButton gameButton;
	
	
	public int getIconValue() {
		return iconValue;
	}
	
	public int getIconX() {
		return iconX;
	}
	public void setIconX(int iconX) {
		this.iconX = iconX;
	}
	public int getIconY() {
		return iconY;
	}
	public void setIconY(int iconY) {
		this.iconY = iconY;
	}
	public GameButton getGameButton() {
		return gameButton;
	}
	public void setGameButton(GameButton gameButton) {
		this.gameButton = gameButton;
	}
	
	public GameIcon(int iconValue, int iconX, int iconY)
	{
		this.iconValue = iconValue;
		this.iconX = iconX;
		this.iconY = iconY;
	}
	
	
	
	
	

}
