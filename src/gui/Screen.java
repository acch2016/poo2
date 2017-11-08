package gui;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import sound.Player;

public class Screen extends JFrame {

	private Image   backImage = Toolkit.getDefaultToolkit().getImage("Background.png");
	private Player  player    = null;
	private boolean paused    = false;

	private JPanel backPanel = new JPanel() {
		@Override
		public void paint(Graphics g) {
			g.drawImage(backImage, 0, 0, this);
		}
	};	
	
	private KeyListener teclazos = new KeyAdapter() {
		public void keyPressed(KeyEvent e) {
			int code = e.getKeyCode();
			switch(code) {
				case KeyEvent.VK_LEFT   : System.out.println("Izquierda"); 	break;
				case KeyEvent.VK_RIGHT  : System.out.println("Derecha"); 	break;
				case KeyEvent.VK_F1     : System.out.println("F1"); 		break;
				case KeyEvent.VK_F2     : System.out.println("F2"); 		break;
				case KeyEvent.VK_ENTER  : playOrPause(); 					break;
				case KeyEvent.VK_ESCAPE : System.exit(0);
			}
		}		
	};
	
	private void playOrPause() {
		if (player == null) {    // Si es el primer Enter, crea el reproductor y lo arranca
			this.player = new Player();
			this.player.start();
			
		} else {  // Si no es el primer Enter, pausa al reproductor o lo reanuda
			if (paused) {
				player.resume();
				paused = false;
			} else {
				player.suspend();
				paused = true;
			}
		}
	}
	
	public Screen() {
		super("Testing Hyper Collider API");
		setSize(960, 620);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		Container c = getContentPane();
		c.add(backPanel);
		addKeyListener(teclazos);
		setVisible(true);
	}	
	
}
