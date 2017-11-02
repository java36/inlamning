package game;

import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class IconList 
{
	private List<Icon> iconList = new ArrayList<>();
	
	private Icon icon1;
	private Icon icon2;
	private Icon icon3;
	private Icon icon4;
	private Icon icon5;
	private Icon icon6;
	private Icon icon7;
	private Icon icon8;
	private Icon icon9;
	private Icon icon10;
	private Icon icon11;
	private Icon icon12;
	private Icon icon13;
	private Icon icon14;
	private Icon icon15;
	
	public IconList()
	{
		icon1 = new ImageIcon("1.png");
		icon2 = new ImageIcon("2.png");
		icon3 = new ImageIcon("3.png");
		icon4 = new ImageIcon("4.png");
		icon5 = new ImageIcon("5.png");
		icon6 = new ImageIcon("6.png");
		icon7 = new ImageIcon("7.png");
		icon8 = new ImageIcon("8.png");
		icon9 = new ImageIcon("9.png");
		icon10 = new ImageIcon("10.png");
		icon11 = new ImageIcon("11.png");
		icon12 = new ImageIcon("12.png");
		icon13 = new ImageIcon("13.png");
		icon14 = new ImageIcon("14.png");
		icon15 = new ImageIcon("15.png");
		
		iconList.add(icon1);
		iconList.add(icon2);
		iconList.add(icon3);
		iconList.add(icon4);
		iconList.add(icon5);
		iconList.add(icon6);
		iconList.add(icon7);
		iconList.add(icon8);
		iconList.add(icon9);
		iconList.add(icon10);
		iconList.add(icon11);
		iconList.add(icon12);
		iconList.add(icon13);
		iconList.add(icon14);
		iconList.add(icon15);
		
		
		
	}
	
	public List<Icon> getIconList()
	{
		return iconList;
	}
	
	

}
