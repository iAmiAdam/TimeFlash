package info.adamjsmith.timeflash;

import java.util.List;

import info.adamjsmith.framework.Game;
import info.adamjsmith.framework.Graphics;
import info.adamjsmith.framework.Screen;
import info.adamjsmith.framework.Input.TouchEvent;

public class GameScreen extends Screen {

	World world;
	Level level;
	Graphics g;
	
	public GameScreen(Game game) {
		super(game);
		world = new World();
		level = new Level();
		g = game.getGraphics();
	}

	@Override
	public void update(float deltaTime) {
		List < TouchEvent > touchEvents = game.getInput().getTouchEvents();
		int len = touchEvents.size();
		for(int i = 0; i < len; i++) {
			TouchEvent event = touchEvents.get(i);
			if(event.type == TouchEvent.TOUCH_DOWN){
				if(event.x > 800 && event.y > 0) {
					world.update(deltaTime);
				}
			}	
		
		}
	}

	@Override
	public void present(float deltaTime) {
		g.drawPixmap(Assets.background, 0, 0);
		drawWorld(world);
		
	}
	
	public void drawWorld(World world) {
		
		int[][] level = world.level.levelArray;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 16; j++) {
				if (level[i][j] == 1) {
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
