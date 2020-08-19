package zzzz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Textbox 
{
	private int textLengthFirst = 1, textLengthSecond = 1, textLengthThird = 1, textboxNumber = 1;
	private String firstLine = "", secondLine = "", thirdLine = "";
	private String currentTextFirst = "", currentTextSecond = "", currentTextThird = "";
	boolean textFinished = false;
	
					//entity number, part of game, textbox number for that part
	public void updateTextbox(int id, int gameFlag, int textBox)
	{
		if(id == 0 && gameFlag == 0)
		{
			if(textBox == 0)
			{
				firstLine= "How long have we been adrift?";
				secondLine = "";
				thirdLine = "";
			}
			
			else if(textBox == 1)
			{
				firstLine = "If you don't know, what makes you think I will?";
				secondLine = "";
				thirdLine = "";
			}
			
			else if(textBox == 2)
			{
				firstLine = "I thought maybe you had been keeping ";
				secondLine = "track.";
				thirdLine = "";
			}
			
			else if(textBox == 3)
			{
				firstLine = "What for? It's been at least two days since we";
				secondLine = "ran out of water. We'll probably be dead soon.";
				thirdLine = "";
			}
		}
		
		else if(id == 0 && gameFlag == 1)
			
		{
			if(textBox == 0)
			{
				firstLine= "Are you scared of death?";
				secondLine = "";
				thirdLine = "";
			}
			
			else if(textBox == 1)
			{
				firstLine = "Not really.";
				secondLine = "";
				thirdLine = "";
			}
			
			else if(textBox == 2)
			{
				firstLine = "I am.";
				secondLine = "";
				thirdLine = "";
			}
			
			else if(textBox == 3)
			{
				firstLine = "Why?";
				secondLine = "";
				thirdLine = "";
			}
			
			else if(textBox == 4)
			{
				firstLine = "We don't know what it's like, or what";
				secondLine = "happens to us afterwards.";
				thirdLine = "";
			}
			
			else if(textBox == 5)
			{
				firstLine = "Could it be worse than this?";
				secondLine = "";
				thirdLine = "";
			}
			
			else if(textBox == 6)
			{
				firstLine = "Maybe it is this. Maybe we're already";
				secondLine = "dead.";
				thirdLine = "";
			}
			
			else if(textBox == 7)
			{
				firstLine = "Don't be stupid.";
				secondLine = "";
				thirdLine = "";
			}
			
			else if(textBox == 8)
			{
				firstLine = "Just a thought.";
				secondLine = "";
				thirdLine = "";
			}
		}
		
		else if(id == 0 && gameFlag == 2)
			
		{
			if(textBox == 0)
			{
				firstLine= "You know we aren't dead.";
				secondLine = "";
				thirdLine = "";
			}
			
			else if(textBox == 1)
			{
				firstLine = "I don't even know what day it is.";
				secondLine = "";
				thirdLine = "";
			}
			
			else if(textBox == 2)
			{
				firstLine = "Fair enough.";
				secondLine = "";
				thirdLine = "";
			}
		}
		
		else if(id == 0 && gameFlag == 3)
			
		{
			if(textBox == 0)
			{
				firstLine= "Do you think it will rain?";
				secondLine = "";
				thirdLine = "";
			}
			
			else if(textBox == 1)
			{
				firstLine = "No.";
				secondLine = "";
				thirdLine = "";
			}
			
			else if(textBox == 2)
			{
				firstLine = "It looks like it might rain.";
				secondLine = "";
				thirdLine = "";
			}
			
			else if(textBox == 3)
			{
				firstLine = "There hasn't been a cloud in the sky since we've";
				secondLine = "been out here.";
				thirdLine = "";	
			}
		}
		else if(id == 0 && gameFlag == 4)
			
		{
			if(textBox == 0)
			{
				firstLine= "My skin is fried.";
				secondLine = "";
				thirdLine = "";
			}
			
			else if(textBox == 1)
			{
				firstLine = "I'm aware.";
				secondLine = "";
				thirdLine = "";
			}
		}
		
		else if(id == 0 && gameFlag == 5)
			
		{
			if(textBox == 0)
			{
				firstLine= "Do you think we'll die of dehydration or";
				secondLine = "heat stroke first?";
				thirdLine = "";
			}
			
			else if(textBox == 1)
			{
				firstLine = "Doesn't make much difference.";
				secondLine = "";
				thirdLine = "";
			}
		}
		
		else if(id == 0 && gameFlag == 6)
			
		{
			if(textBox == 0)
			{
				firstLine= "We could try fishing again.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 1)
			{
				firstLine = "You lost the tackle.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 2)
			{
				firstLine = "Some people can fish with their bare ";
				secondLine = "hands.";
				thirdLine = "";
			}
			else if(textBox == 3)
			{
				firstLine = "Can you?";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 4)
			{
				firstLine = "No.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 5)
			{
				firstLine = "Then shut up.";
				secondLine = "";
				thirdLine = "";
			}
		}
		
		else if(id == 0 && gameFlag == 7)
			
		{
			if(textBox == 0)
			{
				firstLine= "Maybe a boat will come by.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 1)
			{
				firstLine = "Maybe a search and rescue helicopter will show";
				secondLine = "up any minute.";
				thirdLine = "";
			}
			else if(textBox == 2)
			{
				firstLine = "You think so?";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 3)
			{
				firstLine = "No.";
				secondLine = "";
				thirdLine = "";
			}
		}
		else if(id == 0 && gameFlag == 8)
			
		{
			if(textBox == 0)
			{
				firstLine= "So I guess there's no hope, then.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 1)
			{
				firstLine = "Yep.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 2)
			{
				firstLine = "I don't want to die.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 3)
			{
				firstLine = "I don't think you have a choice.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 4)
			{
				firstLine= "I never thought it would end like this.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 5)
			{
				firstLine = "How did you think it would end?";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 6)
			{
				firstLine = "I guess I never really thought about it at all." ;
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 7)
			{
				firstLine = "Exactly.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 8)
			{
				firstLine= "Do you think it will hurt?";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 9)
			{
				firstLine = "Do you hurt already?";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 10)
			{
				firstLine = "Yeah." ;
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 11)
			{
				firstLine = "Then what does it matter?";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 12)
			{
				firstLine= "I guess it doesn't. I'm just not ready.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 13)
			{
				firstLine = "That's why I'm here.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 14)
			{
				firstLine = "What if there's no afterlife?";
				secondLine = "What if we just stop existing when we die?";
				thirdLine = "";
			}
			else if(textBox == 15)
			{
				firstLine = "Then you probably won't care.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 16)
			{
				firstLine= "Doesn't non-existence scare you?";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 17)
			{
				firstLine = "Why should it?";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 18)
			{
				firstLine = "I don't know. It seems wrong.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 19)
			{
				firstLine = "Maybe it is.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 20)
			{
				firstLine= "Then what's right?";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 21)
			{
				firstLine = "We'll find out soon enough.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 22)
			{
				firstLine = "You're looking forward to it, aren't you? ";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 23)
			{
				firstLine = "Of course not. I just know there's no point in";
				secondLine = "hiding from it.";
				thirdLine = "";
			}
			else if(textBox == 24)
			{
				firstLine = "Death is a reality that we have to face and deal";
				secondLine = "with, even if we don't understand it.";
				thirdLine = "";
			}
			else if(textBox == 25)
			{
				firstLine = "Everybody dies.";
				secondLine = "Everybody.";
				thirdLine = "";
			}
			else if(textBox == 26)
			{
				firstLine = " More people have died than are alive right";
				secondLine = "now.";
				thirdLine = "";
			}
			else if(textBox == 27)
			{
				firstLine = "Dozens of people have probably died during";
				secondLine = "the course of this conversation.";
				thirdLine = "";
			}
			else if(textBox == 28)
			{
				firstLine = " If we don't die now, we'll just die later.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 29)
			{
				firstLine = "The least we can do is accept that and die with";
				secondLine = "dignity, knowing that we aren't alone. ";
				thirdLine = "";
			}
			else if(textBox == 30)
			{
				firstLine = "We do not have to face anything that hasn't";
				secondLine = "been faced before.";
				thirdLine = "";
			}
			else if(textBox == 31)
			{
				firstLine = "If someone else could handle it, so can we.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 32)
			{
				firstLine = "...";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 33)
			{
				firstLine = "I guess you're right.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 34)
			{
				firstLine = "You know I'm right.";
				secondLine = "";
				thirdLine = "";
			}
			else if(textBox == 35)
			{
				firstLine = "I know. I know I am.";
				secondLine = "";
				thirdLine = "";
			}
			
		}
		
		
		
			if(textLengthFirst <= firstLine.length())
			{
				currentTextFirst = firstLine.substring(0, textLengthFirst);
				textLengthFirst++;
			}
			
			else if(textLengthSecond <= secondLine.length())
			{
				currentTextSecond = secondLine.substring(0, textLengthSecond);
				textLengthSecond++;
			}
			
			else if(textLengthThird <= thirdLine.length())
			{
				currentTextThird = thirdLine.substring(0, textLengthThird);
				textLengthThird++;
			}
			
			else
				textFinished = true;
	}
	
	public boolean isTextFinished() {
		return textFinished;
	}

	public void clearText()
	{
		textLengthFirst = 1; textLengthSecond = 1; textLengthThird = 1; textboxNumber = 1;
		firstLine = ""; secondLine = ""; thirdLine = "";
		currentTextFirst = ""; currentTextSecond = ""; currentTextThird = "";
		textFinished = false;
		
	}
	
	public boolean textboxExists(int id, int gameFlag, int textBox)
	{
		if(id==0 && gameFlag==0 && textBox <= 3)
			return true;
		else if(id==0 && gameFlag==1 && textBox <=8)
			return true;
		else if(id==0 && gameFlag==2 && textBox <=2)
			return true;
		else if(id==0 && gameFlag==3 && textBox <=3)
			return true;
		else if(id==0 && gameFlag==4 && textBox<=1)
			return true;
		else if(id==0 && gameFlag==5 && textBox<=1)
			return true;
		else if(id==0 && gameFlag==6 && textBox<=5)
			return true;
		else if(id==0 && gameFlag==7 && textBox<=3)
			return true;
		else if(id==0 && gameFlag==8 && textBox<=35)
			return true;
		else
			return false;
	}
	
	public void renderTextbox(Handler handler, Graphics g, int id, int gameFlag, int textBox)
	{
		if(textBox%2 == 0 && gameFlag!=2 && textBox<=22)
		{
			g.setColor(Color.WHITE);
			g.setFont(new Font("SansSerif", Font.PLAIN, 30));
			g.drawImage(Assets.textbox_player, 100, handler.getHeight() - Assets.getTextboxHeight() - 35, 700, Assets.getTextboxHeight() + 35, null);
		}
		else if(textBox%2 == 1 && gameFlag!=2 && textBox<=22)
		{
			g.setColor(Color.WHITE);
			g.setFont(new Font("Serif", Font.PLAIN, 30));
			g.drawImage(Assets.textbox_reflection, 100, handler.getHeight() - Assets.getTextboxHeight() - 35, 700, Assets.getTextboxHeight() + 35, null);
		}
		
		else if(gameFlag == 2)
		{
			if(textBox%2 == 0)
			{
				g.setColor(Color.WHITE);
				g.setFont(new Font("Serif", Font.PLAIN, 30));
				g.drawImage(Assets.textbox_reflection, 100, handler.getHeight() - Assets.getTextboxHeight() - 35, 700, Assets.getTextboxHeight() + 35, null);
			}
			else if(textBox%2 == 1)
			{
				g.setColor(Color.WHITE);
				g.setFont(new Font("SansSerif", Font.PLAIN, 30));
				g.drawImage(Assets.textbox_player, 100, handler.getHeight() - Assets.getTextboxHeight() - 35, 700, Assets.getTextboxHeight() + 35, null);
			}
		}
		
		else if(gameFlag == 8)
		{
			if(textBox>=22&&textBox<=31 || textBox == 34)
			{
				g.setColor(Color.WHITE);
				g.setFont(new Font("Serif", Font.PLAIN, 30));
				g.drawImage(Assets.textbox_reflection, 100, handler.getHeight() - Assets.getTextboxHeight() - 35, 700, Assets.getTextboxHeight() + 35, null);
			}
			else
			{
				g.setColor(Color.WHITE);
				g.setFont(new Font("SansSerif", Font.PLAIN, 30));
				g.drawImage(Assets.textbox_player, 100, handler.getHeight() - Assets.getTextboxHeight() - 35, 700, Assets.getTextboxHeight() + 35, null);
			}
		}
		
		g.drawString(currentTextFirst, 220, handler.getHeight() - Assets.getTextboxHeight() + 10);
		g.drawString(currentTextSecond, 220, handler.getHeight() - Assets.getTextboxHeight() + 42);
		g.drawString(currentTextThird, 220, handler.getHeight() - Assets.getTextboxHeight() + 74);
	}
	
}

