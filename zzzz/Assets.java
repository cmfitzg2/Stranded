package zzzz;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 32, height = 32;
	public static final int textboxWidth = 228, textboxHeight = 96;
	
	public static BufferedImage dirt, grass, stone, tree, water,
								playerDownNormal, playerUpNormal, playerLeftNormal, playerRightNormal,
								oldmanUpNormal, oldmanLeftNormal, oldmanRightNormal, oldmanDownNormal, 
								raft;
	public static BufferedImage textbox, textbox_player, textbox_reflection;
	public static BufferedImage[] player_down, player_up, player_left, player_right;
	public static BufferedImage[] player_sit_right;
	public static BufferedImage[] reflection_down, reflection_up, reflection_left, reflection_right;
	public static BufferedImage[] reflectionfade_right;
	public static BufferedImage[] btn_start;
	public static void init(){
		
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));
		SpriteSheet playerSheet = new SpriteSheet(ImageLoader.loadImage("/textures/Charactersheet.png"));
		SpriteSheet reflectionSheet = new SpriteSheet(ImageLoader.loadImage("/textures/characterclone.png"));
		SpriteSheet menuSheet = new SpriteSheet(ImageLoader.loadImage("/textures/Start.png"));
		SpriteSheet reflectionFadeSheet = new SpriteSheet(ImageLoader.loadImage("/textures/clonefadeout.png"));
		SpriteSheet dedaf = new SpriteSheet(ImageLoader.loadImage("/textures/dedaf.png"));
		
		raft = ImageLoader.loadImage("/textures/raft.png");
		textbox_player = ImageLoader.loadImage("/textures/tb1.png");
		textbox_reflection = ImageLoader.loadImage("/textures/tb2.png");
		textbox = ImageLoader.loadImage("/textures/tb.png");
		
		btn_start = new BufferedImage[2];
		btn_start[0] = menuSheet.crop(0,0,width*2,height);
		btn_start[1] = menuSheet.crop(width*2, 0, width, height);
		
		player_down = new BufferedImage[4]; 		//4 = frame count
		player_up = new BufferedImage[4];
		player_left = new BufferedImage[4];
		player_right = new BufferedImage[4];
		
		player_down[0] = playerSheet.crop(0, 0, width, height);
		player_down[1] = playerSheet.crop(width, 0, width, height);
		player_down[2] = playerSheet.crop(width*2, 0, width, height);
		player_down[3] = playerSheet.crop(width*3, 0, width, height);
		
		player_up[0] = playerSheet.crop(0, height, width, height);
		player_up[1] = playerSheet.crop(width, height, width, height);
		player_up[2] = playerSheet.crop(width*2, height, width, height);
		player_up[3] = playerSheet.crop(width*3, height, width, height);
		
		player_left[0] = playerSheet.crop(0, height*2, width, height);
		player_left[1] = playerSheet.crop(width, height*2, width, height);
		player_left[2] = playerSheet.crop(width*2, height*2, width, height);
		player_left[3] = playerSheet.crop(width*3, height*2, width, height);
		
		player_right[0] = playerSheet.crop(0, height*3, width, height);
		player_right[1] = playerSheet.crop(width, height*3, width, height);
		player_right[2] = playerSheet.crop(width*2, height*3, width, height);
		player_right[3] = playerSheet.crop(width*3, height*3, width, height);
		
		player_sit_right = new BufferedImage[4];
		
		player_sit_right[0] = dedaf.crop(0, 0, width, height);
		player_sit_right[1] = dedaf.crop(width, 0, width, height);
		player_sit_right[2] = dedaf.crop(width*2, 0, width, height);
		player_sit_right[3] = dedaf.crop(width*3, 0, width, height);
		
		reflection_down = new BufferedImage[4];
		reflection_up = new BufferedImage[4];
		reflection_left = new BufferedImage[4];
		reflection_right = new BufferedImage[4];
		
		reflection_down[0] = reflectionSheet.crop(0, 0, width, height);
		reflection_down[1] = reflectionSheet.crop(width, 0, width, height);
		reflection_down[2] = reflectionSheet.crop(width*2, 0, width, height);
		reflection_down[3] = reflectionSheet.crop(width*3, 0, width, height);
		
		reflection_up[0] = reflectionSheet.crop(0, height, width, height);
		reflection_up[1] = reflectionSheet.crop(width, height, width, height);
		reflection_up[2] = reflectionSheet.crop(width*2, height, width, height);
		reflection_up[3] = reflectionSheet.crop(width*3, height, width, height);
		
		reflection_left[0] = reflectionSheet.crop(0, height*2, width, height);
		reflection_left[1] = reflectionSheet.crop(width, height*2, width, height);
		reflection_left[2] = reflectionSheet.crop(width*2, height*2, width, height);
		reflection_left[3] = reflectionSheet.crop(width*3, height*2, width, height);
		
		reflection_right[0] = reflectionSheet.crop(0, height*3, width, height);
		reflection_right[1] = reflectionSheet.crop(width, height*3, width, height);
		reflection_right[2] = reflectionSheet.crop(width*2, height*3, width, height);
		reflection_right[3] = reflectionSheet.crop(width*3, height*3, width, height);
		
		reflectionfade_right = new BufferedImage[16];
		
		reflectionfade_right[0] = reflectionFadeSheet.crop(0, 0, width, height);
		reflectionfade_right[1] = reflectionFadeSheet.crop(width, 0, width, height);
		reflectionfade_right[2] = reflectionFadeSheet.crop(width*2, 0, width, height);
		reflectionfade_right[3] = reflectionFadeSheet.crop(width*3, 0, width, height);
		reflectionfade_right[4] = reflectionFadeSheet.crop(0, height, width, height);
		reflectionfade_right[5] = reflectionFadeSheet.crop(width, height, width, height);
		reflectionfade_right[6] = reflectionFadeSheet.crop(width*2, height, width, height);
		reflectionfade_right[7] = reflectionFadeSheet.crop(width*3, height, width, height);
		reflectionfade_right[8] = reflectionFadeSheet.crop(0, height*2, width, height);
		reflectionfade_right[9] = reflectionFadeSheet.crop(width, height*2, width, height);
		reflectionfade_right[10] = reflectionFadeSheet.crop(width*2, height*2, width, height);
		reflectionfade_right[11] = reflectionFadeSheet.crop(width*3, height*2, width, height);
		reflectionfade_right[12] = reflectionFadeSheet.crop(0, height*3, width, height);
		reflectionfade_right[13] = reflectionFadeSheet.crop(width, height*3, width, height);
		reflectionfade_right[14] = reflectionFadeSheet.crop(width*2, height*3, width, height);
		reflectionfade_right[15] = reflectionFadeSheet.crop(width*3, height*3, width, height);

		
		
		
		playerDownNormal = player_down[0];
		playerLeftNormal = player_left[0];
		playerRightNormal = player_right[0];
		playerUpNormal = player_up[0];
				
		dirt = sheet.crop(0,0,width,height);
		grass = sheet.crop(width, 0, width, height);
		stone = sheet.crop(width*2, 0, width, height);
		tree = sheet.crop(width*3, 0, width, height);
		water = sheet.crop(0, height*2, width, height);
	}
	public static int getTextboxHeight()
	{
		return textboxHeight;
	}
	
	public static int getTextboxWidth()
	{
		return textboxWidth;
	}
}
