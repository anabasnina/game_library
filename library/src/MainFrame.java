package game_library.src;

import java.io.*;
import java.util.*;
import javax.swing.JFrame;

public class MainFrame {

	public MainFrame(Controller) {
			JFrame frame = new JFrame(Library);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setSize(1000,600);
		    frame.setResizable(false);
		    frame.add(new Draw(frame));
			frame.setVisible(true);

	}

}
