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
	
	void painSelf(Graphics g) {
		g.drawImage(img, x, y,null);
	}
}
