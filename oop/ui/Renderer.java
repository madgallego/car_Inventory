package oop.ui;

import java.awt.Canvas;
import javax.swing.JFrame;

//renderer class. all ui shall be sent here for rendering
public class Renderer extends Canvas{
	private int WIDTH = 800;
	private int HEIGHT = 600;
	
	public void display(){
		Renderer window = new Renderer();
		JFrame frame = new JFrame();
		
		frame.add(window);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}
	
}