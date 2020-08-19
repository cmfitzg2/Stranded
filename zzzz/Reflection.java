package zzzz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Reflection extends Creature
{
	private Animation animDown, animUp, animLeft, animRight, fadeRight;
	private EntityManager entityManager;
	private boolean down = false, up = false, left = false, right = false, interactedWith = false;
	private Textbox textbox;
	private String fullText = "", currentText ="";
	private int textLength = 1, textboxNumber = 0;
	private boolean textboxFinished = false;
	private int id = 0;
	
	public Reflection(Handler handler, float x, float y)
	{
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		
		bounds.x = 16;
		bounds.y = 32;
		bounds.width = 32;
		bounds.height = 32;
		
		//Animations
		animDown = new Animation(450, Assets.reflection_down);
		animLeft = new Animation(450, Assets.reflection_left);
		animUp = new Animation(450, Assets.reflection_up);
		animRight = new Animation(450, Assets.reflection_right);
		fadeRight = new Animation(100, Assets.reflectionfade_right);
		
		textbox = new Textbox();
	}

	@Override
	public void tick() 
	{
		xMove = 0;
		yMove = 0;
		speed = speed/6;
		//
		//decide when to move here
		//
		
		if(fadeRight.getIndex() != 15 && handler.getGameFlag() == 9)
			fadeRight.tick();
		else if(handler.getGameFlag() == 9)
			handler.setGameFlag(10);
		
//		if(xMove!=0 || yMove!=0)
//			{
//			animDown.tick();
//			animLeft.tick();
//			animUp.tick();
//			animRight.tick();
//			
//			move();
//			}
		
		if(interactedWith)
			textbox.updateTextbox(id, handler.getGameFlag(), textboxNumber);

		if(handler.getKeyManager().z && !handler.getKeyManager().isStillHoldingZ() && textbox.isTextFinished())
		{
			//get the next textbox
			textboxNumber++;
			textbox.clearText();
			if(textbox.textboxExists(id, handler.getGameFlag(), textboxNumber))
				textbox.updateTextbox(id, handler.getGameFlag(), textboxNumber);
			else
			{
				handler.setGameFlag(handler.getGameFlag()+1);
				textboxNumber = 0;
				interactedWith = false;
				handler.setPlayerFrozen(false);
				handler.getKeyManager().setStillHoldingZ(true);
				
			}
			handler.getKeyManager().setStillHoldingZ(true);
			
		}
		
	}

	@Override
	public void render(Graphics g) {
		if(interactedWith)
			if(textbox.textboxExists(id, handler.getGameFlag(), textboxNumber))
				textbox.renderTextbox(handler, g, id, handler.getGameFlag(), textboxNumber);
		if(yMove>0)
		 {
			down = true; left = false; up = false; right = false;
			g.drawImage(animDown.getCurrentFrame(), (int) (x - handler.getGameCamera().getxOffset()),  (int) (y-handler.getGameCamera().getyOffset()), width, height, null);
		 }
		 else if(xMove>0)
		 {
			down = false; right = true; left = false; up = false;
			g.drawImage(animRight.getCurrentFrame(), (int) (x - handler.getGameCamera().getxOffset()),  (int) (y-handler.getGameCamera().getyOffset()), width, height, null);

		 }
		 else if(yMove<0)
		 {
			up = true; right = false; left = false; down = false;
			g.drawImage(animUp.getCurrentFrame(), (int) (x - handler.getGameCamera().getxOffset()),  (int) (y-handler.getGameCamera().getyOffset()), width, height, null);
		 }
		 else if(xMove<0)
		 {
			left = true; up = false; right = false; down = false;
			g.drawImage(animLeft.getCurrentFrame(), (int) (x - handler.getGameCamera().getxOffset()),  (int) (y-handler.getGameCamera().getyOffset()), width, height, null);
		 }
		
		 else if(xMove == 0 && yMove == 0 && handler.getGameFlag() != 9 && handler.getGameFlag() != 10)
		 {
			 if(down)
				 g.drawImage(animDown.getCurrentFrame(), (int) (x - handler.getGameCamera().getxOffset()),  (int) (y-handler.getGameCamera().getyOffset()), width, height, null);
			 else if(left)
				 g.drawImage(animLeft.getCurrentFrame(), (int) (x - handler.getGameCamera().getxOffset()),  (int) (y-handler.getGameCamera().getyOffset()), width, height, null);
			 else if(up)
				 g.drawImage(animUp.getCurrentFrame(), (int) (x - handler.getGameCamera().getxOffset()),  (int) (y-handler.getGameCamera().getyOffset()), width, height, null);
			 else 
				 g.drawImage(animRight.getCurrentFrame(), (int) (x - handler.getGameCamera().getxOffset()),  (int) (y-handler.getGameCamera().getyOffset()), width, height, null);
		 }
		
		 else if(fadeRight.getIndex() != 15 && handler.getGameFlag() == 9)
			 g.drawImage(fadeRight.getCurrentFrame(), (int) (x - handler.getGameCamera().getxOffset()),  (int) (y-handler.getGameCamera().getyOffset()), width, height, null);
	}
	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interactedWith() 
	{
		interactedWith = true;
		handler.setPlayerFrozen(true);
		handler.getKeyManager().setStillHoldingZ(true);
		System.out.println("Interaction with " + this);
		//interactedWith = false;
	}

	@Override
	public boolean isInteracting() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFirstRender() {
		// TODO Auto-generated method stub
		return false;
	}

}
