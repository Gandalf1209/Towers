package me.gandalf1209.main;

import com.gandalf1209.yge2.engine.Application;
import com.gandalf1209.yge2.engine.Game;
import com.gandalf1209.yge2.graphics.Display;
import com.gandalf1209.yge2.graphics.GraphicsX;

public class MainGame implements Game {

	private Display d;
	
	public static void main(String[] args) {
		Application.start();
		new MainGame().init();
	}
	
	public void init() {
		d = new Display("Towers - " + Application.VERSION, 800, 600, this);
		
		d.getWindow().setResizable(false);
		d.getWindow().setVisible(true);
		
		d.start(30);
	}
	
	@Override
	public void render(GraphicsX g) {
		
	}

	@Override
	public void update() {
		
	}
	
}