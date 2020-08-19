package zzzz;

import java.awt.Color;
import java.awt.Graphics;

public class ScreenFade 
{
	int gameWidth = 0;
	int gameHeight = 0;
	
	public ScreenFade()
	{
		
	}
	
	void fadeScreen(Handler handler, Graphics g, int alpha)
	{
		gameWidth = handler.getGame().getWidth();
		gameHeight = handler.getGame().getHeight();
		Color c = new Color(0, 0, 0, alpha);
		g.setColor(c);
		g.fillRect(0, 0, gameWidth, gameHeight);
	}
	
	
}
