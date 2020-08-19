package zzzz;

import java.awt.Graphics;

public class Raft extends StaticEntity 
{
	private boolean interactedWith = false;

	public Raft(Handler handler, float x, float y) 
	{
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		bounds.x = 0;
		bounds.y = 0;
		bounds.width = 0;
		bounds.height = 0;
	}

	@Override
	public void tick() 
	{
		
	}
	
	@Override
	public void die()
	{
		handler.getWorld().getEntityManager().removeEntity(this);
	}
	
	@Override
	public void interactedWith()
	{

	}
	
	@Override
	public void render(Graphics g) 
	{
		g.drawImage(Assets.raft, (int) (x - handler.getGameCamera().getxOffset()), 
								(int) (y - handler.getGameCamera().getyOffset()), null);
	}

	@Override
	public boolean isInteracting() 
	{
		
		return interactedWith;
	}

	@Override
	public boolean isFirstRender() {
		// TODO Auto-generated method stub
		return true;
	}

}
