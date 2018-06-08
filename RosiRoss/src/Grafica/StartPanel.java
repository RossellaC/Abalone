package Grafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import core.Mondo;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


//creare la pagina di gioco modificando questa prova
public class StartPanel extends JPanel {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private Image immagini=null;
private JLabel jPlay;
	public StartPanel(final MainFrame mF) {
		// TODO Auto-generated constructor stub
		try {
			
		immagini=ImageIO.read(new File("src/immagini/SfondoAbalone.jpg"));
			
		} catch (IOException e) {
		JOptionPane.showMessageDialog(null, "Problema nel caricare lo sfondo");
		}
		
		setLayout(null);
		jPlay =new JLabel("START");
		jPlay.setForeground(Color.WHITE);
		jPlay.setFont(new Font("Bernard MT Condensed", Font.ROMAN_BASELINE, 40));
		jPlay.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			public void mouseExited(MouseEvent e) {
				jPlay.setForeground(Color.WHITE);
			}
			
			public void mouseEntered(MouseEvent e) {
				jPlay.setForeground(Color.BLACK);
			}
			
			public void mouseClicked(MouseEvent e) {
				Mondo m=new Mondo();
				mF.setPanel(new PlayPanel(m, mF));
			
			}
		});
		jPlay.setBounds(100, 603, 300, 84);
		add(jPlay);
		
	}

	 @Override
	    public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (immagini == null) {
		    return;
		}
		int width = this.getWidth();
		int height = this.getHeight();

		g.drawImage(immagini, 0, 0, width, height, null);
	    }
}
