package gold_miner.game;

import java.awt.Toolkit;

public class Gold extends Object{
	public Gold() {
		this.x = 300;
		this.y = 500;
		this.width = 52;
		this.height = 52;
		this.img = Toolkit.getDefaultToolkit().getImage("images/gold_2.gif");
	}
}
