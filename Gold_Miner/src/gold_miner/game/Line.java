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
	// state determines whether the line is swinging or extending.
	// State 0: swing
	// State 1: hook
	// State 2: retrieve
	// State 3: catch and retrieve
	int state;
	
	int hookSpeed = 5;
	int retrieveSpeed = 5;
	
	GameWin frame;
	
	Line(GameWin frame){this.frame = frame;}
	
	void logic() {
		for(Object obj: this.frame.objectList) {
			if(endX > obj.x
					&& endX < obj.x + obj.width 
					&& endY > obj.y 
					&& endY < obj.height + obj.y) {
				state = 3;
				obj.flag = true;
			}
		}
		
	}
	
	void lines(Graphics g) {
		endX = (int) (x + length * Math.cos(n * Math.PI));
		endY = (int) (y + length * Math.sin(n * Math.PI));
		
		g.setColor(Color.yellow);
		g.drawLine(x, y, endX, endY); 
	}
	
	void paintSelf(Graphics g) {
		logic();
		switch(state) {
			case 0:
				if(n <= 0.1) {
					direction = 1;
				} else if (n >= 0.9){
					direction = -1;
				}
				n= n + 0.005 * direction;
				lines(g);
				break;
			case 1:
				if(length < 500) {
					length = length + hookSpeed;
					
					lines(g);
				} else {
					state = 2;
				}
				break;
			case 2:
				if(length > 100) {
					length -= retrieveSpeed;
					lines(g);
				} else {
					state = 0;
				}
			case 3:
				int mass = 1;
				if(length > 100) {
					length -= 10;
					lines(g);
					for(Object obj: this.frame.objectList) {
						if(obj.flag) {
							mass = obj.mass;
							obj.x = endX - obj.getWidth() / 2; // the gold is 52 x 52 pixels in size
							obj.y = endY;
							if(length <= 100) {
								obj.x = -150;
								obj.y = -150;
								obj.flag = false;
								state = 0;
							}
						}
					}
				}
				try {
					Thread.sleep(mass);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			default:
		}
		
		
		
	}
}
