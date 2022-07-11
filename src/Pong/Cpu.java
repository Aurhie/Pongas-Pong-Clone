package Pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Cpu {
	
	public double x, y;
	public int width, height;
	
	public Cpu(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 10;
	}
	
	public void tick() {
		
		x+= (Game.ball.x - x - 6) * 0.07;
		
		/*Rectangle rect1 = new Rectangle((int)x, (int) y, width, height);
		if() {
			
		}
		*/
	}
	
	public void render(Graphics g) {
		g.setColor(Color.pink);
		g.fillRect((int)x, (int)y, width, height);
	}

}
