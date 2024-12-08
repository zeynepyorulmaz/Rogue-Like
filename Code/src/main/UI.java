package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;

import object.OBJ_Key;

public class UI {
	
	GamePanel gp;
	Graphics2D g2;
	Font arial_80B, arial_40, arial_20;
//	BufferedImage keyImage;
	public boolean messageOn = false;
	public String message = "";
	int messageCounter = 0; 
	public boolean gameFinished = false;
	
	public double playTime;
	DecimalFormat dFormat = new DecimalFormat("#0.00");
	
	public UI(GamePanel gp) {
		
		this.gp = gp;
		arial_80B = new Font("Arial", Font.BOLD, 80);
		arial_40 = new Font("Arial", Font.PLAIN, 40);
		arial_20 = new Font("Arial", Font.PLAIN, 20);
//		OBJ_Key key = new OBJ_Key();
//		keyImage = key.image;
	}
	
	public void showMessage(String text) {
		
		message = text;
		messageOn = true;
		
	}
	
	public void draw(Graphics2D g2) {
		
		this.g2 = g2;
		
		g2.setFont(arial_40);
		g2.setColor(Color.white);
		
		if (gp.gameState == gp.playState) {
			// Do playState stuff later
		}
		
		if (gp.gameState == gp.pauseState) {
			drawPuaseScreen();
			
		}
	}
	
	public void drawPuaseScreen() {
		
		String text = "PAUSED";
		int x, y;
		
		x = getXforCenteredText(text);
		
		y = gp.screenHeight / 2;
		
		g2.drawString(text, x, y);
		
	}
	
	public int getXforCenteredText(String text) {
		int length = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
		int x = gp.screenWidth/2 - length/2;
		
		return x;
	}
	
	
//	public void treasreHuntGameDraw() {
//		if (gameFinished == true) {
//			
//			String text;
//			int textLength;
//			int x, y;
//			
//			g2.setFont(arial_40);
//			g2.setColor(Color.white); 
//			
//			text = "You found the treasure!";
//			textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
//			x = gp.screenWidth/2 - textLength / 2;
//			y = gp.screenHeight/2 - (gp.tileSize * 3);
//			g2.drawString(text, x, y);
//			
//			text = "Your Time is:" + dFormat.format(playTime) + "!";
//			textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
//			x = gp.screenWidth/2 - textLength / 2;
//			y = gp.screenHeight/2 + (gp.tileSize * 4);
//			g2.drawString(text, x, y);
//			
//			g2.setFont(arial_80B);
//			g2.setColor(Color.yellow);
//			
//			text = "Congratulations";
//			textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
//			x = gp.screenWidth/2 - textLength / 2;
//			y = gp.screenHeight/2 + (gp.tileSize * 2);
//			g2.drawString(text, x, y);
//			
//			gp.gameThread = null;
//			
//		} else {
//			
//			g2.setFont(arial_40);
//			g2.setColor(Color.white); 
//			g2.drawImage(keyImage, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
//			g2.drawString("x " + gp.player.hasKey, 74, 65);
//			
//			// TIME
//			playTime += (double)1/60;
//			g2.drawString("Time:" + dFormat.format(playTime), gp.tileSize*11, 65);
//			
//			// MESSAGE
//			
//			if (messageOn == true) {
//				
//				g2.setFont(arial_20);
//				g2.drawString(message, 20, 545);
//				
//				messageCounter++;
//				
//				if (messageCounter > gp.FPS*2) {
//					messageCounter = 0;
//					messageOn = false;
//				}		
//			}	
//		}
//		
//	}
}
