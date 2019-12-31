package library.src;

import java.io.*;
import java.util.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Draw {

	Image img1 = new ImageIcon("1.png").getImage();
	Image img2 = new ImageIcon("2.png").getImage();
	Image img3 = new ImageIcon("3.png").getImage();
	Image img4 = new ImageIcon("4.png").getImage();



	public Draw(Controller,MainFrame) {
		this.frame = frame;
	}

	public void drawLibrarian(Graphics g) {
//отсутствует изображение библиотекаря
	}

	public void drawReader(Graphics g) {
		g.drawImage(img2, 0, 0,frame.getWidth(), frame.getHeight(), null);
	}

	public void drawComponents(Graphics) {
//на диаграмме нет обазначения что есть Components
	}

	public void drawScore(Graphics g) {
//отсутствует класс подсчета счета игры
	}

	public void drawTimer(Graphics g) {
//необходим отдельный класс таймер,лишь метода в контройллере недостаточно
	}

	public void drawReadingPlase(Graphics g) {
		g.drawImage(img3, 600, 90,frame.getWidth(), frame.getHeight(), null);
	}

	public void drawRack(Graphics g) {
		g.drawImage(img4, 100, 400,frame.getWidth(), frame.getHeight(), null);
		g.drawImage(img4, 300, 400,frame.getWidth(), frame.getHeight(), null);
		g.drawImage(img4, 500, 400,frame.getWidth(), frame.getHeight(), null);
		g.drawImage(img4, 700, 400,frame.getWidth(), frame.getHeight(), null);
		g.drawImage(img4, 900, 400,frame.getWidth(), frame.getHeight(), null);
	}

}
