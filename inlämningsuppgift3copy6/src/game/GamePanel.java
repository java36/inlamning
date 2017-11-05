package game;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GamePanel extends JPanel 
{
	
	private List<GameButton> gameButtonList;
	
	private GridBagLayout gbl = new GridBagLayout();
	private GridBagConstraints gc = new GridBagConstraints();
	
	private WinGame winGame;
		
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
	
	private GameIcon icon1;
	private GameIcon icon2;
	private GameIcon icon3;
	private GameIcon icon4;
	private GameIcon icon5;
	private GameIcon icon6;
	private GameIcon icon7;
	private GameIcon icon8;
	private GameIcon icon9;
	private GameIcon icon10;
	private GameIcon icon11;
	private GameIcon icon12;
	private GameIcon icon13;
	private GameIcon icon14;
	private GameIcon icon15;
	
	//Object of the ActionListener class
	Listener listener = new Listener();
	
	public void setWinGame(WinGame winGame)
	{
		this.winGame = winGame;
	}
	
	
	
	public GamePanel() throws IOException
	{
		setBackground(Color.WHITE);
		setLayout(gbl);
		setSize(360,250);
		
		
		
		
		
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;
		
		
		/////////First Row////////////////////////////////////
		
		gc.gridx = 0;
		gc.gridy = 0;
		
		button1 = new GameButton(1, 0, 0);
		icon1 = new GameIcon(1, 0, 0);
		BufferedImage image1 = ImageIO.read(new File("1.png"));
		icon1.setImage(image1);
		button1.setGameIcon(icon1);
		icon1.setGameButton(button1);
		button1.addActionListener(listener);
		add(button1, gc);
		
		
		gc.gridx = 1;
		gc.gridy = 0;
		
		button2 = new GameButton(2, 1, 0);
		icon2 = new GameIcon(2,1,0);
		icon2.setImage(ImageIO.read(new File("2.png")));
		button2.setGameIcon(icon2);
		icon2.setGameButton(button2);
		button2.addActionListener(listener);
		add(button2, gc);
		
		gc.gridx = 2;
		gc.gridy = 0;
		
		button3 = new GameButton(3,2,0);
		icon3 = new GameIcon(3,2,0);
		icon3.setImage(ImageIO.read(new File("3.png")));
		button3.setGameIcon(icon3);
		icon3.setGameButton(button3);
		button3.addActionListener(listener);
		add(button3, gc);
		
		gc.gridx = 3;
		gc.gridy = 0;
		
		button4 = new GameButton(4,3,0);
		icon4 = new GameIcon(4,3,0);
		icon4.setImage(ImageIO.read(new File("4.png")));
		button4.setGameIcon(icon4);
		icon4.setGameButton(button4);
		button4.addActionListener(listener);
		add(button4, gc);
		
		//////////////Second Row////////////
		
		gc.gridx = 0;
		gc.gridy = 1;
		
		button5 = new GameButton(5,0,1);
		icon5 = new GameIcon(5,0,1);
		icon5.setImage(ImageIO.read(new File("5.png")));
		button5.setGameIcon(icon5);
		icon5.setGameButton(button5);
		button5.addActionListener(listener);
		add(button5, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		
		button6 = new GameButton(6,1,1);
		icon6 = new GameIcon(6,1,1);
		icon6.setImage(ImageIO.read(new File("6.png")));
		button6.setGameIcon(icon6);
		icon6.setGameButton(button6);
		button6.addActionListener(listener);
		add(button6, gc);
		
		gc.gridx = 2;
		gc.gridy = 1;
		
		button7 = new GameButton(7,2,1);
		icon7 = new GameIcon(7,2,1);
		icon7.setImage(ImageIO.read(new File("7.png")));
		button7.setGameIcon(icon7);
		icon7.setGameButton(button7);
		button7.addActionListener(listener);
		add(button7, gc);
		
		gc.gridx = 3;
		gc.gridy = 1;
		
		button8 = new GameButton(8,3,1);
		icon8 = new GameIcon(8,3,1);
		icon8.setImage(ImageIO.read(new File("8.png")));
		button8.setGameIcon(icon8);
		icon8.setGameButton(button8);
		button8.addActionListener(listener);
		add(button8, gc);
		
		////////Third Row//////////////
		
		gc.gridx = 0;
		gc.gridy = 2;
		
		button9 = new GameButton(9,0,2);
		icon9 = new GameIcon(9,0,2);
		icon9.setImage(ImageIO.read(new File("9.png")));
		button9.setGameIcon(icon9);
		icon9.setGameButton(button9);
		button9.addActionListener(listener);
		add(button9, gc);
		
		gc.gridx = 1;
		gc.gridy = 2;
		
		button10 = new GameButton(10,1,2);
		icon10 = new GameIcon(10,1,2);
		icon10.setImage(ImageIO.read(new File("10.png")));
		button10.setGameIcon(icon10);
		icon10.setGameButton(button10);
		button10.addActionListener(listener);
		add(button10, gc);
		
		gc.gridx = 2;
		gc.gridy = 2;
		
		button11 = new GameButton(11,2,2);
		icon11 = new GameIcon(11,2,2);
		icon11.setImage(ImageIO.read(new File("11.png")));
		button11.setGameIcon(icon11);
		icon11.setGameButton(button11);
		button11.addActionListener(listener);
		add(button11, gc);
		
		gc.gridx = 3;
		gc.gridy = 2;
		
		button12 = new GameButton(12,3,2);
		icon12 = new GameIcon(12,3,2);
		icon12.setImage(ImageIO.read(new File("12.png")));
		button12.setGameIcon(icon12);
		icon12.setGameButton(button12);
		button12.addActionListener(listener);
		add(button12, gc);
		
		///////////Fourth Row///////////////
		
		gc.gridx = 0;
		gc.gridy = 3;
		
		button13 = new GameButton(13,0,3);
		icon13 = new GameIcon(13,0,3);
		icon13.setImage(ImageIO.read(new File("13.png")));
		button13.setGameIcon(icon13);
		icon13.setGameButton(button13);
		button13.addActionListener(listener);
		add(button13, gc);
		
		gc.gridx = 1;
		gc.gridy = 3;
		
		button14 = new GameButton(14,1,3);
		icon14 = new GameIcon(14,1,3);
		icon14.setImage(ImageIO.read(new File("14.png")));
		button14.setGameIcon(icon14);
		icon14.setGameButton(button14);
		button14.addActionListener(listener);
		add(button14, gc);
		
		gc.gridx = 2;
		gc.gridy = 3;
		
		button15 = new GameButton(15,2,3);
		icon15 = new GameIcon(15,2,3);
		icon15.setImage(ImageIO.read(new File("15.png")));
		button15.setGameIcon(icon15);
		icon15.setGameButton(button15);
		button15.addActionListener(listener);
		add(button15, gc);
		
		gc.gridx = 3;
		gc.gridy = 3;
		
		button16 = new GameButton(16,3,3);
		button16.addActionListener(listener);
		button16.setVisible(false);
		add(button16, gc);
		
		invisibleButton = button16;
		
		shuffle();
	}
	
	public void solve()
	{
		button1.setGameIcon(icon1);
		button1.setBackground(Color.RED);
		
		button1.setVisible(true);
		button2.setGameIcon(icon2);
		button2.setBackground(Color.RED);
		
		button2.setVisible(true);
		button3.setGameIcon(icon3);
		button3.setBackground(Color.RED);
		
		button3.setVisible(true);
		button4.setGameIcon(icon4);
		button4.setBackground(Color.RED);
		button4.setVisible(true);
		button5.setGameIcon(icon5);
		button5.setBackground(Color.RED);
		button5.setVisible(true);
		button6.setGameIcon(icon6);
		button6.setBackground(Color.RED);
		button6.setVisible(true);
		button7.setGameIcon(icon7);
		button7.setBackground(Color.RED);
		button7.setVisible(true);
		button8.setGameIcon(icon8);
		button8.setBackground(Color.RED);
		button8.setVisible(true);
		button9.setGameIcon(icon9);
		button9.setBackground(Color.RED);
		button9.setVisible(true);
		button10.setGameIcon(icon10);
		button10.setBackground(Color.RED);
		button10.setVisible(true);
		button11.setGameIcon(icon11);
		button11.setBackground(Color.RED);
		button11.setVisible(true);
		button12.setGameIcon(icon12);
		button12.setBackground(Color.RED);
		button12.setVisible(true);
		button13.setGameIcon(icon13);
		button13.setBackground(Color.RED);
		button13.setVisible(true);
		button14.setGameIcon(icon14);
		button14.setBackground(Color.RED);
		button14.setVisible(true);
		button15.setGameIcon(icon15);
		button15.setBackground(Color.RED);
		button15.setVisible(true);
		button16.setVisible(false);
		
			
	}
	
	public void shuffle()
	{
		Random rand = new Random();
		
				
		int numberOfMoves = 900 + rand.nextInt(100);
		
		
		
		for(int i = 0; i<numberOfMoves; i++)
		{
			int nowX = invisibleButton.getButtonX();
			int nowY = invisibleButton.getButtonY();
			int toX = 0;
			int toY = 0;
			int toButtonValue = 0; 
			GameButton toButton = new GameButton();
			
			do
			{
				if(rand.nextBoolean())
				{
					
					if(rand.nextBoolean())
					{
						toX = nowX+1;
						toY = nowY;
					}
					else
					{
						toX = nowX;
						toY = nowY+1;
					}
				}
				else
				{
					
					if(rand.nextBoolean())
					{
						toX = nowX-1;
						toY = nowY;
					}
					else
					{
						toX = nowX;
						toY = nowY-1;
					}
				}
			}while(!((toX >= 0 && toX <=3) && (toY >=0 && toY <=3)));
			
			toButtonValue = 4*toY+toX;
			toButton = (GameButton) getComponent(toButtonValue);
					
			invisibleButton.setGameIcon(toButton.getGameIcon());
			invisibleButton.setVisible(true);
			toButton.setIcon(null);
			toButton.setVisible(false);
			invisibleButton.getGameIcon().setGameButton(invisibleButton);
			invisibleButton.getGameIcon().setIconX(invisibleButton.getButtonX());
			invisibleButton.getGameIcon().setIconY(invisibleButton.getButtonY());
			invisibleButton = toButton;
			invisibleButton.setButtonX(toButton.getButtonX());
			invisibleButton.setButtonY(toButton.getButtonY());
			invisibleButton.setButtonValue(toButton.getButtonValue());
		}
		
	}
	
	public void gameWon()
	{
		button1.setBackground(Color.RED);
		
		button2.setBackground(Color.RED);
		
		button3.setBackground(Color.RED);
		
		button4.setBackground(Color.RED);
		
		button5.setBackground(Color.RED);
		
		button6.setBackground(Color.RED);
		
		button7.setBackground(Color.RED);
		
		button8.setBackground(Color.RED);
		
		button9.setBackground(Color.RED);
		
		button10.setBackground(Color.RED);
		
		button11.setBackground(Color.RED);
		
		button12.setBackground(Color.RED);
		
		button13.setBackground(Color.RED);
		
		button14.setBackground(Color.RED);
		
		button15.setBackground(Color.RED);
		
		
		
	}
	public void stop()
	{
		button1.removeActionListener(listener);
		button2.removeActionListener(listener);
		button3.removeActionListener(listener);
		button4.removeActionListener(listener);
		button5.removeActionListener(listener);
		button6.removeActionListener(listener);
		button7.removeActionListener(listener);
		button8.removeActionListener(listener);
		button9.removeActionListener(listener);
		button10.removeActionListener(listener);
		button11.removeActionListener(listener);
		button12.removeActionListener(listener);
		button13.removeActionListener(listener);
		button14.removeActionListener(listener);
		button15.removeActionListener(listener);
		button16.removeActionListener(listener);
		
	}
	
	
	class Listener implements ActionListener
	{
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			int isMatch = 0;
			gameButtonList = new ArrayList<>();
			GameButton button = (GameButton) e.getSource();
			int value = button.getButtonValue();
			
			if(((Math.abs(value - invisibleButton.getButtonValue()) == 1) || (Math.abs(value - invisibleButton.getButtonValue()) == 4))
					&&((button.getButtonX() == invisibleButton.getButtonX()) || ((button.getButtonY() == invisibleButton.getButtonY()))))
			{
				invisibleButton.setGameIcon(button.getGameIcon());
				invisibleButton.setVisible(true);
				button.setIcon(null);
				button.setVisible(false);
				invisibleButton.getGameIcon().setGameButton(invisibleButton);
				invisibleButton.getGameIcon().setIconX(invisibleButton.getButtonX());
				invisibleButton.getGameIcon().setIconY(invisibleButton.getButtonY());
				
				invisibleButton = button;
			}
			
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
			
			
			for(GameButton b : gameButtonList)
			{
				if(b.getGameIcon().getIconValue() == b.getButtonValue())
					b.setBackground(Color.GREEN);
				else
					b.setBackground(Color.WHITE);
			}
			
			if(invisibleButton.equals(button16))
			{
				for(int i=0; i<16; i++)
				{
					
					if(gameButtonList.get(i).getGameIcon() != null)
					{
						if(gameButtonList.get(i).getGameIcon().getIconValue() == gameButtonList.get(i).getButtonValue())
						{
							isMatch++;
						}					
					}					
				}
			}
			
			if(isMatch == 15)
			{
				winGame.gameWon();
				
			}
			
		}
		
	}
	
	


}
