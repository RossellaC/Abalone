package Grafica;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;

	private JPanel basePanel;
	
	//Creo la finestra 
	public MainFrame() {
		setTitle("ABALONE");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		 setMenuBar();
		}
	
    public void setPanel(JPanel p) {
    	basePanel =p;
    	this.setContentPane(basePanel);
    	this.validate();
    	
    	
    }
   
	public  void setMenuBar() {
		JMenuBar bar =  new JMenuBar();
		JMenu menu = new JMenu("Impostazioni");
		bar.add(menu);
		menu.add(new AbstractAction("Nuova Partita") {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
			
				/*
				 * aggiungere qui la pag del gioco
				 */
				System.out.println("pulsante funzionante");
			}
		});
		setJMenuBar(bar);
		
	}

	public static void main(String[] args) {
		MainFrame mF = new MainFrame();
		mF.setVisible(true);
		mF.setSize(800, 800);
		mF.setResizable(false);
        mF.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/3, Toolkit.getDefaultToolkit().getScreenSize().height/10);
	
	StartPanel start= new StartPanel(mF);
	mF.setPanel(start);
	mF.setVisible(true);
	
	}

}
