package meujogo.Modelo;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player {

	private int x, y;
	private int dx, dy;
	private Image imagem;
	private int altura, largura;
	
	public Player() {
		
		this.x = -450;
		this.y = 0;
		
	}
	
	public void load() {
		ImageIcon referencia = new ImageIcon("res\\naruto neutro1.png");
		imagem = referencia.getImage();
		
		altura = imagem.getHeight(null);
		largura = imagem.getWidth(null);
	}
	
	public void update() {
		
		x += dx;
		y += dy;
		
	}
	
	public void keyPressed(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_W) {
			dy = -5;
		}
		
		if(codigo == KeyEvent.VK_S) {
			dy = 5;
		}
		
		if(codigo == KeyEvent.VK_A) {
			dx = -5;
		}
		
		if(codigo == KeyEvent.VK_D) {
			dx = 5;
		}
	}
	
	public void keyRelease(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_W) {
			dy = 0;
		}
		
		if(codigo == KeyEvent.VK_S) {
			dy = 0;
		}
		
		if(codigo == KeyEvent.VK_A) {
			dx = 0;
		}
		
		if(codigo == KeyEvent.VK_D) {
			dx = 0;
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}
	
	
}
