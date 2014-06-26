package info.adamjsmith.timeflash;

public class World {
	public final int WORLD_HEIGHT = 9;
	public final int WORLD_WIDTH = 16;
	
	public Player player;
	public Level level;
	
	public World() {
		player = new Player();
		level = new Level();
	}
}
