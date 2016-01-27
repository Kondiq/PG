/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektowaniegraficzne;

import javax.swing.JFrame;

/**
 * Główna klasa projektu, zawierająca metodę main.
 * @author Kondiq
 */
public class ProjektowanieGraficzne{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainWindow frame = new MainWindow();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(1100, 700);
	frame.setVisible(true);
    }
    
}
