package gold_miner.game;

import java.awt.Toolkit;

public class Gold extends Object{
	
	public Gold() {
		this.x = (int)(Math.random() * 700);
		this.y = (int)(Math.random() * 550 + 300);
		this.width = 52;
		this.height = 52;
		this.img = Toolkit.getDefaultToolkit().getImage("images/gold_2.gif");
		this.flag = false;
	}
}
