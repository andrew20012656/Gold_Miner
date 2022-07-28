package gold_miner.game;

import java.awt.*;

import javax.swing.*;

public class GameWin extends JFrame{
	
	Bg bg = new Bg();
	Line line = new Line();
	Gold gold = new Gold();
	
	Image offScreenImage;
	
	void launch() {
		this.setVisible(true);
		this.setSize(768, 1000);
		this.setLocationRelativeTo(null);
		this.setTitle("Gold Miner 2022");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		while(true) {
			repaint();
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void paint(Graphics g) {
		offScreenImage = this.createImage(768, 1000);
		Graphics gImage = offScreenImage.getGraphics();
		
		bg.paintSelf(gImage);
		line.paintSelf(gImage);
		gold.painSelf(gImage);
		
		g.drawImage(offScreenImage, 0, 0, null);
	}
	
	public static void main(String[] args) {
		GameWin gameWin = new GameWin();
		gameWin.launch();
	}
}
