package inlämningsuppgift3;

import java.util.ArrayList;
import java.util.List;

public class GamePanelList 
{
	List<GamePanel> gamePanelList = new ArrayList<>();
	
	private GamePanel panel1;
	private GamePanel panel2;
	private GamePanel panel3;
	private GamePanel panel4;
	private GamePanel panel5;
	private GamePanel panel6;
	private GamePanel panel7;
	private GamePanel panel8;
	private GamePanel panel9;
	private GamePanel panel10;
	private GamePanel panel11;
	private GamePanel panel12;
	private GamePanel panel13;
	private GamePanel panel14;
	private GamePanel panel15;
	private GamePanel panel16;
	
	public GamePanelList()
	{
		panel1 = new GamePanel();
		panel1.setX(0);
		panel1.setY(0);
		gamePanelList.add(panel1);
		panel2 = new GamePanel();
		panel2.setX(1);
		panel2.setY(0);
		gamePanelList.add(panel2);
		panel3 = new GamePanel();
		panel3.setX(2);
		panel3.setY(0);
		gamePanelList.add(panel3);
		panel4 = new GamePanel();
		panel4.setX(3);
		panel4.setY(0);
		gamePanelList.add(panel4);
		panel5 = new GamePanel();
		panel5.setX(0);
		panel5.setY(1);
		gamePanelList.add(panel5);
		panel6 = new GamePanel();
		panel6.setX(1);
		panel6.setY(1);
		gamePanelList.add(panel6);
		panel7 = new GamePanel();
		panel7.setX(2);
		panel7.setY(1);
		gamePanelList.add(panel7);
		panel8 = new GamePanel();
		panel8.setX(3);
		panel8.setY(1);
		gamePanelList.add(panel8);
		panel9 = new GamePanel();
		panel9.setX(0);
		panel9.setY(2);
		gamePanelList.add(panel9);
		panel10 = new GamePanel();
		panel10.setX(1);
		panel10.setY(2);
		gamePanelList.add(panel10);
		panel11 = new GamePanel();
		panel11.setX(2);
		panel11.setY(2);
		gamePanelList.add(panel11);
		panel12 = new GamePanel();
		panel12.setX(3);
		panel12.setY(2);
		gamePanelList.add(panel12);
		panel13 = new GamePanel();
		panel13.setX(0);
		panel13.setY(3);
		gamePanelList.add(panel13);
		panel14 = new GamePanel();
		panel14.setX(1);
		panel14.setY(3);
		gamePanelList.add(panel14);
		panel15 = new GamePanel();
		panel15.setX(2);
		panel15.setY(3);
		gamePanelList.add(panel15);
		panel16 = new GamePanel();
		panel16.setX(3);
		panel16.setY(3);
		gamePanelList.add(panel16);
	}
	
	public List<GamePanel> getGamePanelList()
	{
		return gamePanelList;
	}
	

}
