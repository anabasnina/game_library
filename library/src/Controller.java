package game_library.src;

import java.io.*;
import java.util.*;
import javax.swing.Timer;

public class Controller {

	public int score;
	public int gametime;


	public Controller() {

	}

	public void mainTimer() {
		Timer timer = new Timer(36000, this);
	}

}
