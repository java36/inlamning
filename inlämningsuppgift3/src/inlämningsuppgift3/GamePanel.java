package inlämningsuppgift3;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class GamePanel extends JPanel
{
	private int x;
	private int y;
	private boolean hasButton;
	
	public GamePanel()
	{
		setLayout(new BorderLayout());
		setSize(90, 60);
		setVisible(true);
	}
	
	public int getX()
	{
		return x;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public int getY()
	{
		return y;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	
	public boolean getHasButton()
	{
		return hasButton;
	}
	public void setHasButton(boolean hasButton)
	{
		this.hasButton = hasButton;
	}
	

}
