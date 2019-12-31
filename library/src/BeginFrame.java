package game_library.src;

import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BeginFrame {

	JPanel panel = new JPanel();
	f.getContentPane().add(panel);

	JButton button = new JButton("Start");
	button.setBounds(95, 40, 85, 30);
          panel.add(button);

	public BeginFrame(Controller) {
		JFrame start = new JFrame(Start);
		start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.setSize(1000,600);
		start.setResizable(false);
		start.setVisible(true);

		}


}
