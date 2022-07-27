package gold_miner.game;

import java.awt.*;

import javax.swing.*;

public class GameWin extends JFrame{
	
	Bg bg = new Bg();
	Line line = new Line();
	
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
		bg.paintSelf(g);
		line.paintSelf(g);
	}
	
	public static void main(String[] args) {
		GameWin gameWin = new GameWin();
		gameWin.launch();
	}
}