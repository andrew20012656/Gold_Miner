package gold_miner.game;

import java.awt.Color;
import java.awt.Graphics;

public class Line {
	// starting coordinate
	int x = 380;
	int y = 180;
	// ending coordinate
	int endX = 500;
	int endY = 500;
	// length of line
	double length = 100;
	double n = 0;
	// direction
	int direction = 1;
	
	
	void paintSelf(Graphics g) {
		
		if(n <= 0.1) {
			direction = 1;
		} else if (n >= 0.9){
			direction = -1;
		}
		n= n + 0.005 * direction;
		
		endX = (int) (x + length * Math.cos(n * Math.PI));
		endY = (int) (y + length * Math.sin(n * Math.PI));
		
		g.setColor(Color.yellow);
		g.drawLine(x, y, endX, endY);
	}
}
