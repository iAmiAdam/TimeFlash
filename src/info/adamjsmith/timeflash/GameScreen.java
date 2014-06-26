package info.adamjsmith.timeflash;

import info.adamjsmith.framework.Game;
import info.adamjsmith.framework.Graphics;
import info.adamjsmith.framework.Screen;

public class GameScreen extends Screen {

	World world;
	Level level;
	
	public GameScreen(Game game) {
		super(game);
		world = new World();
		level = new Level();
	}

	@Override
	public void update(float deltaTime) {
		level.advance(deltaTime);
		
	}

	@Override
	public void present(float deltaTime) {
		drawWorld(world);
		
	}
	
	public void drawWorld(World world) {
		Graphics g = game.getGraphics();
		
		Level level = world.level;
	}
	
	public void drawLevel(Level level) {
		Graphics g = game.getGraphics();
		
		int[][] levelArray = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
							  {0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
							  {0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
							  {0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
							  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
							  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
							  {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0},
							  {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
							  {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 16; j++) {
				if (levelArray[i][j] == 1) {
					g.drawPixmap(Assets.block, j * 77, i * 77);
				}
			}
		}
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
