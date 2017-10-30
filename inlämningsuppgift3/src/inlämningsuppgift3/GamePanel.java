package inlämningsuppgift3;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class GamePanel extends JPanel
{
	private int panelValue;
	
	public GamePanel()
	{
		setLayout(new BorderLayout());
		setSize(90, 60);
		setVisible(true);
	}
	
	public int getPanelValue()
	{
		return panelValue;
	}
	public void setPanelValue(int panelValue)
	{
		this.panelValue = panelValue;
	}
	

}
