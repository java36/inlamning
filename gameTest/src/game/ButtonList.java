package game;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonList 
{
	private List<JButton> buttonList = new ArrayList<>();
	
	private JButton oneBtn;
	private JButton twoBtn;
	private JButton threeBtn;
	private JButton fourBtn;
	private JButton fiveBtn;
	private JButton sixBtn;
	private JButton sevenBtn;
	private JButton eightBtn;
	private JButton nineBtn;
	private JButton tenBtn;
	private JButton elevenBtn;
	private JButton twelveBtn;
	private JButton thirteenBtn;
	private JButton fourteenBtn;
	private JButton fifteenBtn;
	
	public ButtonList()
	{
		oneBtn= new JButton(); 
		oneBtn.setIcon(new ImageIcon("1.png"));
		buttonList.add(oneBtn);
		twoBtn= new JButton("2.png"); 
		twoBtn.setIcon(new ImageIcon());
		buttonList.add(twoBtn);
		threeBtn = new JButton(); 
		threeBtn.setIcon(new ImageIcon());
		buttonList.add(threeBtn);
		fourBtn = new JButton(); 
		fourBtn.setIcon(new ImageIcon("4.png"));
		buttonList.add(fourBtn);
		fiveBtn= new JButton(); 
		fiveBtn.setIcon(new ImageIcon("5.png"));
		buttonList.add(fiveBtn);
		sixBtn= new JButton(); 
		sixBtn.setIcon(new ImageIcon("6.png"));
		buttonList.add(sixBtn);
		sevenBtn = new JButton(); 
		sevenBtn.setIcon(new ImageIcon("7.png"));
		buttonList.add(sevenBtn);
		eightBtn = new JButton(); 
		eightBtn.setIcon(new ImageIcon("8.png"));
		buttonList.add(eightBtn);
		nineBtn= new JButton(); 
		nineBtn.setIcon(new ImageIcon("9.png"));
		buttonList.add(nineBtn);
		tenBtn = new JButton(); 
		tenBtn.setIcon(new ImageIcon("10.png"));
		buttonList.add(tenBtn);
		elevenBtn = new JButton(); 
		elevenBtn.setIcon(new ImageIcon("11.png"));
		buttonList.add(elevenBtn);
		twelveBtn = new JButton(); 
		twelveBtn.setIcon(new ImageIcon("12.png"));
		buttonList.add(twelveBtn);
		thirteenBtn = new JButton(); 
		thirteenBtn.setIcon(new ImageIcon("13.png"));
		buttonList.add(thirteenBtn);
		fourteenBtn = new JButton(); 
		fourteenBtn.setIcon(new ImageIcon("14.png"));
		buttonList.add(fourteenBtn);
		fifteenBtn = new JButton(); 
		fifteenBtn.setIcon(new ImageIcon("15.png"));
		buttonList.add(fifteenBtn);
	}
	
	public List<JButton> getButtonList()
	{
		return buttonList;
	}
	

}
