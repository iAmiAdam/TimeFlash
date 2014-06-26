package info.adamjsmith.timeflash;

import info.adamjsmith.framework.Screen;
import info.adamjsmith.framework.impl.AndroidGame;

public class TimeFlashGame extends AndroidGame {
	public Screen getStartScreen() {
		return new LoadingScreen(this);
	}
}