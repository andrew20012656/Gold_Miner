package gold_miner.game;

import java.awt.Toolkit;

public class Rock extends Object{
	Rock(){
		this.x = (int)(Math.random() * 700);
		this.y = (int)(Math.random() * 550 + 300);
		this.width = 71;
		this.height = 71;
		this.img = Toolkit.getDefaultToolkit().getImage("images/rock_1.png");
		this.flag = false;
	}
}
