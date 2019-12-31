package game_library.src;

import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BeginFrame {

	public BeginFrame(Controller) {
		JFrame start = new JFrame(Start);
		start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
	        f.getContentPane().add(panel);
		
		JButton button = new JButton("Start");
	        button.setBounds(220, 240, 60, 20);
                panel.add(button);
		
		start.setSize(500,500);
		start.setResizable(false);
		start.setVisible(true);

		}


}
