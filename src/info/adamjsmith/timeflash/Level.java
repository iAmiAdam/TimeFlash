package info.adamjsmith.timeflash;

public class Level {
	
	int[][] levelArray = {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
			  			  {0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 1, 0},
			  			  {0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
						  {0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
						  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
						  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0},
						  {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0},
						  {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0},
						  {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};
	
	public void advance(float deltaTime) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < levelArray[i].length - 1; j++) {
				levelArray[i][j] = levelArray[i][j+1];
			}
		}
	}
	
	public void move(float deltaTime) {
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < levelArray[i].length - 1; j++) {
				if (levelArray[i][j] == 2) {
					if (levelArray[i-1][j] == 0) {
						levelArray[i][j] = 0;
						levelArray[i-1][j] = 2;
					} else {
						levelArray[i+1][j] = 3;
					}
				}  
				if(levelArray[i][j] == 3) {
					if (levelArray[i+1][j] == 0) {
						if (levelArray[i-1][j] == 2 || levelArray[i-1][j] == 3) {
							levelArray[i-1][j] = 0;
						} else {
							
							levelArray[i+1][j] = 3;
						}
					} else {
						levelArray[i][j] = 0;
						levelArray[i-1][j] = 2;
					}
				}
			}
		}
	}		
}
