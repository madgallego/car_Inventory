package oop.ui;

import javax.swing.JPanel;

public class BasicUI extends JPanel{
	
	private int x = 0;
	private int y = 0;
	private int WIDTH = 800;
	private int HEIGHT = 600;
	
	BasicUI(){};
	
	BasicUI(int x, int y, int WIDTH, int HEIGHT){
		this.x = x;
		this.y = y;
		this.WIDTH = WIDTH;
		this.HEIGHT = HEIGHT;
		this.setBounds(this.x, this.y, this.WIDTH, this.HEIGHT);
	}
	
}