import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;


class Game
{
	static JTextField p1f1 = new JTextField();
	static JTextField p1f2 = new JTextField();
	static JTextField p1f3 = new JTextField();
	static JTextField p1f4 = new JTextField();
	static JTextField p1f5 = new JTextField();
	static JTextField p1f6 = new JTextField();
	static JTextField p1f7 = new JTextField();
	static JTextField p1f8 = new JTextField();
	static JTextField p1f9 = new JTextField();
	static JTextField p1f10 = new JTextField();
	static JTextField p1f11 = new JTextField();
	static JTextField p1f12 = new JTextField();
	static JTextField p1f13 = new JTextField();
	static JTextField p1f14 = new JTextField();
	static JTextField p1f15 = new JTextField();

	static JTextField p2f1 = new JTextField();
	static JTextField p2f2 = new JTextField();
	static JTextField p2f3 = new JTextField();
	static JTextField p2f4 = new JTextField();
	static JTextField p2f5 = new JTextField();
	static JTextField p2f6 = new JTextField();
	static JTextField p2f7 = new JTextField();
	static JTextField p2f8 = new JTextField();
	static JTextField p2f9 = new JTextField();
	static JTextField p2f10 = new JTextField();
	static JTextField p2f11 = new JTextField();
	static JTextField p2f12 = new JTextField();
	static JTextField p2f13 = new JTextField();
	static JTextField p2f14 = new JTextField();
	static JTextField p2f15 = new JTextField();
	
	static JLabel p1total = new JLabel("");
	static JLabel p2total = new JLabel("");
	static JButton reset = new JButton("RESET CARDS");
	static JButton playagain = new JButton("PLAY AGAIN");
	
	static JFrame frame = new JFrame();
	static Container cntr = frame.getContentPane();
	
	static int a=0;
	static int b=0;
	static int c=0;
	static int d=0;
	
	static int turn=2;
	static int p1count=1;
	static int p2count=1;
	
	static int p1score=0;
	static int p2score=0;
	static int count =0;
	
	
	static	JButton c1 = new JButton();
	static	JButton c2 = new JButton();
	static	JButton c3 = new JButton();
	static	JButton c4 = new JButton();
	
	static	Font f1 = new Font("Times New Roman",Font.BOLD,35);
	static	Font f2 = new Font("Times New Roman",Font.BOLD,25);
	static	Font f4 = new Font("Times New Roman",Font.BOLD,35);
	
	static boolean flagRefresh = true;
	
	static void getNum()
	{
		Random rand = new Random();
		
		a = rand.nextInt(7);
		
		while(b==0)
		{
			int temp = rand.nextInt(7);
			
			if(temp != a)
			{
				b=temp;
			}		
		}
		
		while(c==0)
		{
			int temp2 = rand.nextInt(7);
			
			if(temp2!= a && temp2!= b)
			{
				c=temp2;
			}		
		}
		
		while(d==0)
		{
			int temp3 = rand.nextInt(7);
			
			if(temp3!= a && temp3!= b && temp3!=c)
			{
				d=temp3;
			}		
		}
	}
	
	public static void main(String[] args)
	{
		JPanel scorePanel = new JPanel();
		JPanel scorelable = new JPanel();
		JLabel scorelabletext = new JLabel("SCORE BOARD");
		JPanel player1panel = new JPanel();
		JPanel player2panel = new JPanel();
		JLabel player1lable = new JLabel("");
		JLabel player2lable = new JLabel("");
		JPanel cardpanel = new JPanel();
		JPanel cards = new JPanel();
		
		frame.setVisible(true);
		frame.setBounds(0,0,1368,730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cntr.setLayout(null);
		cntr.setBackground(Color.WHITE);
		scorePanel.setBackground(Color.WHITE);
		scorelable.setBackground(Color.WHITE);
		player1panel.setBackground(Color.WHITE);
		player2panel.setBackground(Color.WHITE);
		cardpanel.setBackground(Color.WHITE);
		cards.setBackground(Color.WHITE);
		
		cntr.add(scorePanel);
		
		scorePanel.setBounds(25,50,700,525);
		scorePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		scorePanel.setLayout(null);
		scorePanel.add(scorelable);
		scorelable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		scorelable.setBounds(0,0,698,75);
		scorelabletext.setFont(f1);
		scorelable.setLayout(null);
		scorelable.add(scorelabletext);
		scorelabletext.setBounds(200,10,400,75);
		scorePanel.add(player1panel);
		player1panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		player1panel.setBounds(0,74,348,554);
		scorePanel.add(player2panel);
		player2panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		player2panel.setBounds(350,74,348,554);
		player1panel.setLayout(null);
		player1panel.add(player1lable);
		player1lable.setText("                    "+"PLAYER 1");
		player1lable.setFont(f2);
		player1lable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		player1lable.setBounds(0,0,348,75);
		player2panel.setLayout(null);
		player2panel.add(player2lable);
		player2lable.setText("                    "+"PLAYER 2");
		player2lable.setFont(f2);
		player2lable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		player2lable.setBounds(0,0,348,75);
		
		player1panel.add(p1f1);
		player1panel.add(p1f2);
		player1panel.add(p1f3);
		player1panel.add(p1f4);
		player1panel.add(p1f5);
		player1panel.add(p1f6);
		player1panel.add(p1f7);
		player1panel.add(p1f8);
		player1panel.add(p1f9);
		player1panel.add(p1f10);
		player1panel.add(p1f11);
		player1panel.add(p1f12);
		player1panel.add(p1f13);
		player1panel.add(p1f14);
		player1panel.add(p1f15);
		
		p1f1.setEditable(false);
		p1f2.setEditable(false);
		p1f3.setEditable(false);
		p1f4.setEditable(false);
		p1f5.setEditable(false);
		p1f6.setEditable(false);
		p1f7.setEditable(false);
		p1f8.setEditable(false);
		p1f9.setEditable(false);
		p1f10.setEditable(false);
		p1f11.setEditable(false);
		p1f12.setEditable(false);
		p1f13.setEditable(false);
		p1f14.setEditable(false);
		p1f15.setEditable(false);
		
		p1f1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p1f2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p1f3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p1f1.setBounds(2,76,114,70);
		p1f2.setBounds(118,76,114,70);
		p1f3.setBounds(233,76,114,70);
		
		p1f4.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p1f5.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p1f6.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p1f4.setBounds(2,147,114,75);
		p1f5.setBounds(118,147,114,75);
		p1f6.setBounds(233,147,114,75);
		
		p1f7.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p1f8.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p1f9.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p1f7.setBounds(2,223,114,75);
		p1f8.setBounds(118,223,114,75);
		p1f9.setBounds(233,223,114,75);
		
		p1f10.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p1f11.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p1f12.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p1f10.setBounds(2,299,114,75);
		p1f11.setBounds(118,299,114,75);
		p1f12.setBounds(233,299,114,75);
		
		p1f13.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p1f14.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p1f15.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p1f13.setBounds(2,375,114,75);
		p1f14.setBounds(118,375,114,75);
		p1f15.setBounds(233,375,114,75);
		
		player2panel.add(p2f1);
		player2panel.add(p2f2);
		player2panel.add(p2f3);
		player2panel.add(p2f4);
		player2panel.add(p2f5);
		player2panel.add(p2f6);
		player2panel.add(p2f7);
		player2panel.add(p2f8);
		player2panel.add(p2f9);
		player2panel.add(p2f10);
		player2panel.add(p2f11);
		player2panel.add(p2f12);
		player2panel.add(p2f13);
		player2panel.add(p2f14);
		player2panel.add(p2f15);
		
		p2f1.setEditable(false);
		p2f2.setEditable(false);
		p2f3.setEditable(false);
		p2f4.setEditable(false);
		p2f5.setEditable(false);
		p2f6.setEditable(false);
		p2f7.setEditable(false);
		p2f8.setEditable(false);
		p2f9.setEditable(false);
		p2f10.setEditable(false);
		p2f11.setEditable(false);
		p2f12.setEditable(false);
		p2f13.setEditable(false);
		p2f14.setEditable(false);
		p2f15.setEditable(false);
		
		p2f1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2f2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2f3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2f1.setBounds(2,76,114,70);
		p2f2.setBounds(118,76,114,70);
		p2f3.setBounds(233,76,114,70);
		
		p2f4.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2f5.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2f6.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2f4.setBounds(2,147,114,75);
		p2f5.setBounds(118,147,114,75);
		p2f6.setBounds(233,147,114,75);
		
		p2f7.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2f8.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2f9.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2f7.setBounds(2,223,114,75);
		p2f8.setBounds(118,223,114,75);
		p2f9.setBounds(233,223,114,75);
		
		p2f10.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2f11.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2f12.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2f10.setBounds(2,299,114,75);
		p2f11.setBounds(118,299,114,75);
		p2f12.setBounds(233,299,114,75);
		
		p2f13.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2f14.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2f15.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2f13.setBounds(2,375,114,75);
		p2f14.setBounds(118,375,114,75);
		p2f15.setBounds(233,375,114,75);
		
		cntr.add(p1total);
		p1total.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		p1total.setBounds(25,550,348,100);
		p1total.setText("                    "+"TOTAL = 0");
		p1total.setFont(f2);
		
		cntr.add(p2total);
		p2total.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		p2total.setBounds(376,550,349,100);
		p2total.setText("                    "+"TOTAL = 0");
		p2total.setFont(f2);
		
		cntr.add(cardpanel);
		cardpanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		cardpanel.setBounds(750,50,585,600);
		cardpanel.setLayout(null);
		
		cardpanel.add(reset);
		cardpanel.add(playagain);
		reset.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		playagain.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		reset.setBounds(40,5,245,65);
		playagain.setBounds(290,5,250,65);
		reset.setFont(f2);
		playagain.setFont(f2);
		
		cardpanel.add(cards);
		cards.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		cards.setBounds(40,74,500,500);
		cards.setLayout(null);
		
		cards.add(c1);
		cards.add(c2);
		cards.add(c3);
		cards.add(c4);
		
		c1.setBounds(25,25,200,200);
		c2.setBounds(275,25,200,200);
		c3.setBounds(25,275,200,200);
		c4.setBounds(275,275,200,200);
		
		c1.addActionListener(new ActionListener() 
			{
				
				public void actionPerformed(ActionEvent event)
				{
					c1_action(event);
				}
			}
		);
		
		c2.addActionListener(new ActionListener() 
			{
				
				public void actionPerformed(ActionEvent event)
				{
					c2_action(event);
				}
			}
		);
		
		c3.addActionListener(new ActionListener() 
			{
				
				public void actionPerformed(ActionEvent event)
				{
					c3_action(event);
				}
			}
		);
		
		c4.addActionListener(new ActionListener()
			{
				
				public void actionPerformed(ActionEvent event)
				{
					c4_action(event);
				}
			}
		);
		
		reset.addActionListener(new ActionListener() 
			{
				
				public void actionPerformed(ActionEvent event)
				{
					reset_action(event);
				}
			}
		);
		
		playagain.addActionListener(new ActionListener() 
			{
				
				public void actionPerformed(ActionEvent event)
				{
					playagain_action(event);
				}
			}
		);
		
		c1.setFont(f1);
		c2.setFont(f1);
		c3.setFont(f1);
		c4.setFont(f1);
		
		p1f1.setFont(f2);
		p1f2.setFont(f2);
		p1f3.setFont(f2);
		p1f4.setFont(f2);
		p1f5.setFont(f2);
		p1f6.setFont(f2);
		p1f7.setFont(f2);
		p1f8.setFont(f2);
		p1f9.setFont(f2);
		p1f10.setFont(f2);
		p1f11.setFont(f2);
		p1f12.setFont(f2);
		p1f13.setFont(f2);
		p1f14.setFont(f2);
		p1f15.setFont(f2);
		
		p2f1.setFont(f2);
		p2f2.setFont(f2);
		p2f3.setFont(f2);
		p2f4.setFont(f2);
		p2f5.setFont(f2);
		p2f6.setFont(f2);
		p2f7.setFont(f2);
		p2f8.setFont(f2);
		p2f9.setFont(f2);
		p2f10.setFont(f2);
		p2f11.setFont(f2);
		p2f12.setFont(f2);
		p2f13.setFont(f2);
		p2f14.setFont(f2);
		p2f15.setFont(f2);
	}	
	
	public static void c1_action(ActionEvent event)
	{
		if(flagRefresh==true)
		{
			Font f3 = new Font("Times new Romen",Font.BOLD,75);
			c1.setFont(f3);
			getNum();
			c1.setText(""+a);
			c2.setFont(f4);
			c3.setFont(f4);
			c4.setFont(f4);
			c2.setText(""+b);
			c3.setText(""+c);
			c4.setText(""+d);
			
			if(turn%2==0)
			{
				if(p1count==1)
				{
					p1f1.setText("        "+a);
					p1count++;
					turn++;
					count++;
					p1score+=a;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==2)
				{
					p1f2.setText("        "+a);
					p1count++;
					turn++;
					count++;
					p1score+=a;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==3)
				{
					p1f3.setText("        "+a);
					p1count++;
					turn++;
					count++;
					p1score+=a;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==4)
				{
					p1f4.setText("        "+a);
					p1count++;
					turn++;
					count++;
					p1score+=a;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==5)
				{
					p1f5.setText("        "+a);
					p1count++;
					turn++;
					count++;
					p1score+=a;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==6)
				{
					p1f6.setText("        "+a);
					p1count++;
					turn++;
					count++;
					p1score+=a;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==7)
				{
					p1f7.setText("        "+a);
					p1count++;
					turn++;
					count++;
					p1score+=a;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==8)
				{
					p1f8.setText("        "+a);
					p1count++;
					turn++;
					count++;
					p1score+=a;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==9)
				{
					p1f9.setText("        "+a);
					p1count++;
					turn++;
					count++;
					p1score+=a;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==10)
				{
					p1f10.setText("        "+a);
					p1count++;
					turn++;
					count++;
					p1score+=a;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==11)
				{
					p1f11.setText("        "+a);
					p1count++;
					turn++;
					count++;
					p1score+=a;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==12)
				{
					p1f12.setText("        "+a);
					p1count++;
					turn++;
					count++;
					p1score+=a;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==13)
				{
					p1f13.setText("        "+a);
					p1count++;
					turn++;
					count++;
					p1score+=a;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==14)
				{
					p1f14.setText("        "+a);
					p1count++;
					turn++;
					count++;
					p1score+=a;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==15)
				{
					p1f15.setText("        "+a);
					p1count++;
					turn++;
					count++;
					p1score+=a;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
			}
			
			else
			{
				if(p2count==1)
				{
					p2f1.setText("        "+a);
					p2count++;
					turn++;
					count++;
					p2score+=a;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==2)
				{
					p2f2.setText("        "+a);
					p2count++;
					turn++;
					count++;
					p2score+=a;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==3)
				{
					p2f3.setText("        "+a);
					p2count++;
					turn++;
					count++;
					p2score+=a;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==4)
				{
					p2f4.setText("        "+a);
					p2count++;
					turn++;
					count++;
					p2score+=a;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==5)
				{
					p2f5.setText("        "+a);
					p2count++;
					turn++;
					count++;
					p2score+=a;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==6)
				{
					p2f6.setText("        "+a);
					p2count++;
					turn++;
					count++;
					p2score+=a;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==7)
				{
					p2f7.setText("        "+a);
					p2count++;
					turn++;
					count++;
					p2score+=a;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==8)
				{
					p2f8.setText("        "+a);
					p2count++;
					turn++;
					count++;
					p2score+=a;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==9)
				{
					p2f9.setText("        "+a);
					p2count++;
					turn++;
					count++;
					p2score+=a;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==10)
				{
					p2f10.setText("        "+a);
					p2count++;
					turn++;
					count++;
					p2score+=a;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==11)
				{
					p2f11.setText("        "+a);
					p2count++;
					turn++;
					count++;
					p2score+=a;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==12)
				{
					p2f12.setText("        "+a);
					p2count++;
					turn++;
					count++;
					p2score+=a;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==13)
				{
					p2f13.setText("        "+a);
					p2count++;
					turn++;
					count++;
					p2score+=a;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==14)
				{
					p2f14.setText("        "+a);
					p2count++;
					turn++;
					count++;
					p2score+=a;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==15)
				{
					p2f15.setText("        "+a);
					p2count++;
					turn++;
					count++;
					p2score+=a;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
			}
			
			if(count==30)
			{
				if(p1score>p2score)
				{
					JOptionPane.showMessageDialog(cntr,"!! PLAYER 1 HAS WON !!");
				}
				
				else
				{
					JOptionPane.showMessageDialog(cntr,"!! PLAYER 2 HAS WON !!");
				}
			}
		}
		
		else
		{
			JOptionPane.showMessageDialog(cntr," PLEASE REFRESH CARDS ");
		}
		
	}
	
	public static void c2_action(ActionEvent event)
	{

		if(flagRefresh==true)
		{
			Font f3 = new Font("Times new Romen",Font.BOLD,75);
			c2.setFont(f3);
			getNum();
			c2.setText(""+b);
			c1.setFont(f4);
			c3.setFont(f4);
			c4.setFont(f4);
			c1.setText(""+a);
			c3.setText(""+c);
			c4.setText(""+d);
			
			if(turn%2==0)
			{
				if(p1count==1)
				{
					p1f1.setText("        "+b);
					p1count++;
					turn++;
					count++;
					p1score+=b;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==2)
				{
					p1f2.setText("        "+b);
					p1count++;
					turn++;
					count++;
					p1score+=b;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==3)
				{
					p1f3.setText("        "+b);
					p1count++;
					turn++;
					count++;
					p1score+=b;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==4)
				{
					p1f4.setText("        "+b);
					p1count++;
					turn++;
					count++;
					p1score+=b;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==5)
				{
					p1f5.setText("        "+b);
					p1count++;
					turn++;
					count++;
					p1score+=b;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==6)
				{
					p1f6.setText("        "+b);
					p1count++;
					turn++;
					count++;
					p1score+=b;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==7)
				{
					p1f7.setText("        "+b);
					p1count++;
					turn++;
					count++;
					p1score+=b;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==8)
				{
					p1f8.setText("        "+b);
					p1count++;
					turn++;
					count++;
					p1score+=b;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==9)
				{
					p1f9.setText("        "+a);
					p1count++;
					turn++;
					count++;
					p1score+=b;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==10)
				{
					p1f10.setText("        "+b);
					p1count++;
					turn++;
					count++;
					p1score+=b;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
				}
				
				else if(p1count==11)
				{
					p1f11.setText("        "+b);
					p1count++;
					turn++;
					count++;
					p1score+=b;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==12)
				{
					p1f12.setText("        "+b);
					p1count++;
					turn++;
					count++;
					p1score+=b;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==13)
				{
					p1f13.setText("        "+b);
					p1count++;
					turn++;
					count++;
					p1score+=b;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==14)
				{
					p1f14.setText("        "+b);
					p1count++;
					turn++;
					count++;
					p1score+=b;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==15)
				{
					p1f15.setText("        "+b);
					p1count++;
					turn++;
					count++;
					p1score+=b;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
			}
			
			else
			{
				if(p2count==1)
				{
					p2f1.setText("        "+b);
					p2count++;
					turn++;
					count++;
					p2score+=b;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==2)
				{
					p2f2.setText("        "+b);
					p2count++;
					turn++;
					count++;
					p2score+=b;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==3)
				{
					p2f3.setText("        "+b);
					p2count++;
					turn++;
					count++;
					p2score+=b;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==4)
				{
					p2f4.setText("        "+b);
					p2count++;
					turn++;
					count++;
					p2score+=b;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==5)
				{
					p2f5.setText("        "+b);
					p2count++;
					turn++;
					count++;
					p2score+=b;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==6)
				{
					p2f6.setText("        "+b);
					p2count++;
					turn++;
					count++;
					p2score+=b;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==7)
				{
					p2f7.setText("        "+b);
					p2count++;
					turn++;
					count++;
					p2score+=b;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==8)
				{
					p2f8.setText("        "+b);
					p2count++;
					turn++;
					count++;
					p2score+=b;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==9)
				{
					p2f9.setText("        "+b);
					p2count++;
					turn++;
					count++;
					p2score+=b;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==10)
				{        
					p2f10.setText("        "+b);
					p2count++;
					turn++;
					count++;
					p2score+=b;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==11)
				{
					p2f11.setText("        "+b);
					p2count++;
					turn++;
					count++;
					p2score+=b;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==12)
				{
					p2f12.setText("        "+b);
					p2count++;
					turn++;
					count++;
					p2score+=b;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==13)
				{
					p2f13.setText("        "+b);
					p2count++;
					turn++;
					count++;
					p2score+=b;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==14)
				{
					p2f14.setText("        "+b);
					p2count++;
					turn++;
					count++;
					p2score+=b;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==15)
				{
					p2f15.setText("        "+b);
					p2count++;
					turn++;
					count++;
					p2score+=b;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
			}
			
			if(count==30)
			{
				if(p1score>p2score)
				{
					JOptionPane.showMessageDialog(cntr,"!! PLAYER 1 HAS WON !!");
				}
				
				else
				{
					JOptionPane.showMessageDialog(cntr,"!! PLAYER 2 HAS WON !!");
				}
			}
		}
		
		else
		{
			JOptionPane.showMessageDialog(cntr," PLEASE REFRESH CARDS ");
		}
		
	}
	
	public static void c3_action(ActionEvent event)
	{	
		if(flagRefresh==true)
		{
			Font f3 = new Font("Times new Romen",Font.BOLD,75);
			c3.setFont(f3);
			getNum();
			c3.setText(""+c);
			c1.setFont(f4);
			c2.setFont(f4);
			c4.setFont(f4);
			c1.setText(""+a);
			c2.setText(""+b);
			c4.setText(""+d);
			
			if(turn%2==0)
			{
				if(p1count==1)
				{
					p1f1.setText("        "+c);
					p1count++;
					turn++;
					count++;
					p1score+=c;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==2)
				{
					p1f2.setText("        "+c);
					p1count++;
					turn++;
					count++;
					p1score+=c;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==3)
				{
					p1f3.setText("        "+c);
					p1count++;
					turn++;
					count++;
					p1score+=c;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==4)
				{
					p1f4.setText("        "+c);
					p1count++;
					turn++;
					count++;
					p1score+=c;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==5)
				{
					p1f5.setText("        "+c);
					p1count++;
					turn++;
					count++;
					p1score+=c;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==6)
				{
					p1f6.setText("        "+c);
					p1count++;
					turn++;
					count++;
					p1score+=c;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==7)
				{
					p1f7.setText("        "+c);
					p1count++;
					turn++;
					count++;
					p1score+=c;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==8)
				{
					p1f8.setText("        "+c);
					p1count++;
					turn++;
					count++;
					p1score+=c;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==9)
				{
					p1f9.setText("        "+c);
					p1count++;
					turn++;
					count++;
					p1score+=c;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==10)
				{
					p1f10.setText("        "+c);
					p1count++;
					turn++;
					count++;
					p1score+=c;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==11)
				{
					p1f11.setText("        "+c);
					p1count++;
					turn++;
					count++;
					p1score+=c;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==12)
				{
					p1f12.setText("        "+c);
					p1count++;
					turn++;
					count++;
					p1score+=c;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==13)
				{
					p1f13.setText("        "+c);
					p1count++;
					turn++;
					count++;
					p1score+=c;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==14)
				{
					p1f14.setText("        "+c);
					p1count++;
					turn++;
					count++;
					p1score+=c;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==15)
				{
					p1f15.setText("        "+c);
					p1count++;
					turn++;
					count++;
					p1score+=c;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
			}
			
			else
			{
				if(p2count==1)
				{
					p2f1.setText("        "+c);
					p2count++;
					turn++;
					count++;
					p2score+=c;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
					
				}
				
				else if(p2count==2)
				{
					p2f2.setText("        "+c);
					p2count++;
					turn++;
					count++;
					p2score+=c;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==3)
				{
					p2f3.setText("        "+c);
					p2count++;
					turn++;
					count++;
					p2score+=c;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==4)
				{
					p2f4.setText("        "+c);
					p2count++;
					turn++;
					count++;
					p2score+=c;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==5)
				{
					p2f5.setText("        "+c);
					p2count++;
					turn++;
					count++;
					p2score+=c;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==6)
				{
					p2f6.setText("        "+c);
					p2count++;
					turn++;
					count++;
					p2score+=c;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==7)
				{
					p2f7.setText("        "+c);
					p2count++;
					turn++;
					count++;
					p2score+=c;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==8)
				{
					p2f8.setText("        "+c);
					p2count++;
					turn++;
					count++;
					p2score+=c;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==9)
				{
					p2f9.setText("        "+c);
					p2count++;
					turn++;
					count++;
					p2score+=c;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==10)
				{
					p2f10.setText("        "+c);
					p2count++;
					turn++;
					count++;
					p2score+=c;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==11)
				{
					p2f11.setText("        "+c);
					p2count++;
					turn++;
					count++;
					p2score+=c;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==12)
				{
					p2f12.setText("        "+c);
					p2count++;
					turn++;
					count++;
					p2score+=c;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==13)
				{
					p2f13.setText("        "+c);
					p2count++;
					turn++;
					count++;
					p2score+=c;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==14)
				{
					p2f14.setText("        "+c);
					p2count++;
					turn++;
					count++;
					p2score+=c;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==15)
				{
					p2f15.setText("        "+c);
					p2count++;
					turn++;
					count++;
					p2score+=c;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
			}
			
			if(count==30)
			{
				if(p1score>p2score)
				{
					JOptionPane.showMessageDialog(cntr,"!! PLAYER 1 HAS WON !!");
				}
				
				else
				{
					JOptionPane.showMessageDialog(cntr,"!! PLAYER 2 HAS WON !!");
				}
			}
		}
		
		else
		{
			JOptionPane.showMessageDialog(cntr," PLEASE REFRESH THE CARDS ");
		}
		
	}
	
	public static void c4_action(ActionEvent event)
	{
		if(flagRefresh==true)
		{
			Font f3 = new Font("Times new Romen",Font.BOLD,75);
			c4.setFont(f3);
			getNum();
			c4.setText(""+d);
			c2.setFont(f4);
			c3.setFont(f4);
			c1.setFont(f4);
			c2.setText(""+b);
			c3.setText(""+c);
			c1.setText(""+a);
			
			if(turn%2==0)
			{
				if(p1count==1)
				{
					p1f1.setText("        "+d);
					p1count++;
					turn++;
					count++;
					p1score+=d;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==2)
				{
					p1f2.setText("        "+d);
					p1count++;
					turn++;
					count++;
					p1score+=d;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==3)
				{
					p1f3.setText("        "+d);
					p1count++;
					turn++;
					count++;
					p1score+=d;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==4)
				{
					p1f4.setText("        "+d);
					p1count++;
					turn++;
					count++;
					p1score+=d;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==5)
				{
					p1f5.setText("        "+d);
					p1count++;
					turn++;
					count++;
					p1score+=d;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==6)
				{
					p1f6.setText("        "+d);
					p1count++;
					turn++;
					count++;
					p1score+=d;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==7)
				{
					p1f7.setText("        "+d);
					p1count++;
					turn++;
					count++;
					p1score+=d;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==8)
				{
					p1f8.setText("        "+d);
					p1count++;
					turn++;
					count++;
					p1score+=d;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==9)
				{
					p1f9.setText("        "+d);
					p1count++;
					turn++;
					count++;
					p1score+=d;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==10)
				{
					p1f10.setText("        "+d);
					p1count++;
					turn++;
					count++;
					p1score+=d;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==11)
				{
					p1f11.setText("        "+d);
					p1count++;
					turn++;
					count++;
					p1score+=d;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==12)
				{
					p1f12.setText("        "+d);
					p1count++;
					turn++;
					count++;
					p1score+=d;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==13)
				{
					p1f13.setText("        "+d);
					p1count++;
					turn++;
					count++;
					p1score+=d;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==14)
				{
					p1f14.setText("        "+d);
					p1count++;
					turn++;
					count++;
					p1score+=d;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p1count==15)
				{
					p1f15.setText("        "+d);
					p1count++;
					turn++;
					count++;
					p1score+=d;
					p1total.setText("                    "+"TOTAL = "+p1score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
			}
			
			else
			{
				if(p2count==1)
				{
					p2f1.setText("        "+d);
					p2count++;
					turn++;
					count++;
					p2score+=d;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==2)
				{
					p2f2.setText("        "+d);
					p2count++;
					turn++;
					count++;
					p2score+=d;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==3)
				{
					p2f3.setText("        "+d);
					p2count++;
					turn++;
					count++;
					p2score+=d;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==4)
				{
					p2f4.setText("        "+d);
					p2count++;
					turn++;
					count++;
					p2score+=d;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==5)
				{
					p2f5.setText("        "+d);
					p2count++;
					turn++;
					count++;
					p2score+=d;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==6)
				{
					p2f6.setText("        "+d);
					p2count++;
					turn++;
					count++;
					p2score+=d;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==7)
				{
					p2f7.setText("        "+d);
					p2count++;
					turn++;
					count++;
					p2score+=d;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==8)
				{
					p2f8.setText("        "+d);
					p2count++;
					turn++;
					count++;
					p2score+=d;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==9)
				{
					p2f9.setText("        "+d);
					p2count++;
					turn++;
					count++;
					p2score+=d;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==10)
				{
					p2f10.setText("        "+d);
					p2count++;
					turn++;
					count++;
					p2score+=d;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==11)
				{
					p2f11.setText("        "+d);
					p2count++;
					turn++;
					count++;
					p2score+=d;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==12)
				{
					p2f12.setText("        "+d);
					p2count++;
					turn++;
					count++;
					p2score+=d;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==13)
				{
					p2f13.setText("        "+d);
					p2count++;
					turn++;
					count++;
					p2score+=d;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==14)
				{
					p2f14.setText("        "+d);
					p2count++;
					turn++;
					count++;
					p2score+=d;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}
				
				else if(p2count==15)
				{
					p2f15.setText("        "+d);
					p2count++;
					turn++;
					count++;
					p2score+=d;
					p2total.setText("                    "+"TOTAL = "+p2score);
					a=0;
					b=0;
					c=0;
					d=0;
					flagRefresh=false;
				}	
			}
			
			if(count==30)
			{
				if(p1score>p2score)
				{
					JOptionPane.showMessageDialog(cntr,"!! PLAYER 1 HAS WON !!");
				}
				
				else
				{
					JOptionPane.showMessageDialog(cntr,"!! PLAYER 2 HAS WON !!");
				}
			}
		}
		
		else
		{
			JOptionPane.showMessageDialog(cntr,"  PLEASE REFRESH CARDS  ");
		}
	}
	
	public static void reset_action(ActionEvent event)
	{
		c1.setText("");
		c2.setText("");
		c3.setText("");
		c4.setText("");
		flagRefresh=true;
	}
	
	public static void playagain_action(ActionEvent event)
	{
		c1.setText("");
		c2.setText("");
		c3.setText("");
		c4.setText("");
		
		p1f1.setText("");
		p1f2.setText("");
		p1f3.setText("");
		p1f4.setText("");
		p1f5.setText("");
		p1f6.setText("");
		p1f7.setText("");
		p1f8.setText("");
		p1f9.setText("");
		p1f10.setText("");
		p1f11.setText("");
		p1f12.setText("");
		p1f13.setText("");
		p1f14.setText("");
		p1f15.setText("");
		
		p2f1.setText("");
		p2f2.setText("");
		p2f3.setText("");
		p2f4.setText("");
		p2f5.setText("");
		p2f6.setText("");
		p2f7.setText("");
		p2f8.setText("");
		p2f9.setText("");
		p2f10.setText("");
		p2f11.setText("");
		p2f12.setText("");
		p2f13.setText("");
		p2f14.setText("");
		p2f15.setText("");
		
		turn=2;
		p1count=1;
		p2count=1;
		
		p1score=0;
		p2score=0;
		
		p1total.setText("                    "+"TOTAL = 0");
		p2total.setText("                    "+"TOTAL = 0");
		count=0;
		
	}
}