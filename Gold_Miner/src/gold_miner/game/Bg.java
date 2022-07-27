package gold_miner.game;

import java.awt.*;

public class Bg {
	Image bg = Toolkit.getDefaultToolkit().getImage("images/background.jpeg");
	Image sky = Toolkit.getDefaultToolkit().getImage("images/background_sky.jpeg");
	Image character = Toolkit.getDefaultToolkit().getImage("images/character.png");
	
	public void paintSelf(Graphics g) {
		g.drawImage(sky, 0, 0, null);
		g.drawImage(bg, 0, 200, null);
		g.drawImage(character, 310, 50, null);
	}
}
