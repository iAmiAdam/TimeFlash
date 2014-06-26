package info.adamjsmith.timeflash;

import info.adamjsmith.framework.Game;
import info.adamjsmith.framework.Graphics;
import info.adamjsmith.framework.Screen;
import info.adamjsmith.framework.Graphics.PixmapFormat;

public class LoadingScreen extends Screen{

	public LoadingScreen(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(float deltaTime) {
		Graphics g = game.getGraphics();
		
		Assets.background = g.newPixmap("background.png", PixmapFormat.RGB565);
		Assets.block = g.newPixmap("block.png", PixmapFormat.ARGB4444);
		Assets.body = g.newPixmap("body.png", PixmapFormat.ARGB4444);
		game.setScreen(new GameScreen(game));
		
	}

	@Override
	public void present(float deltaTime) {
		// TODO Auto-generated method stub
		
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
