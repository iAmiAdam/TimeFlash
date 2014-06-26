package info.adamjsmith.timeflash;

import java.util.ArrayList;
import java.util.List;

public class Player {
	public final int RIGHT = 3;
	public final int LEFT = 1;
	public final int DOWN = 2;
	public final int UP = 0;
	
	public List < Life > lives = new ArrayList < Life > ();
	public int direction;
	
	public Player() {
		direction = RIGHT;
		lives.add(new Life(3, 4));
		lives.add(new Life(2, 4));
		lives.add(new Life(1, 4));
	}
	
	public void turnLeft() {
		Life front = lives.get(0);
		Life middle =  lives.get(1);
		if (front.x != middle.x) {
			direction = LEFT;
		}
	}
	
	public void turnRight() {
		Life front = lives.get(0);
		Life middle =  lives.get(1);
		if (front.x != middle.x) {
			direction = RIGHT;
		}
	}
}
