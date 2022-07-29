package gold_miner.game;

import java.awt.Graphics;
import java.awt.Image;

public class Object {
	// Coordinate
	int x;
	int y;
	// Height/Width
	int width;
	int height;
	Image img;
	// whether object can be moved
	boolean flag;
	
	void paintSelf(Graphics g) {
		g.drawImage(img, x, y,null);
	}

	public int getWidth() {
		return width;
	}
	
}
