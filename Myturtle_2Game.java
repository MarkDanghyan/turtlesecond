package com.turtlesecondgdx.game;


import com.badlogic.gdx.scenes.scene2d.actions.Actions;

public class Myturtle_2Game extends GameBeta {
	private Turtle turtle;
	private BaseActor ocean;
	private Whirlpool whirlpool;
	private BaseActor youWinMessage;
	boolean win;

	@Override
	public void initialise() {
		ocean = new BaseActor(0,0, mainStage);
		ocean.loadTexture( "water.jpg" );
		ocean.setSize(800,600);

		new Starfish(400,400, mainStage);
		new Starfish(500,100, mainStage);
		new Starfish(100,140, mainStage);
		new Starfish(200,250, mainStage);

		new Rock(200,150, mainStage);
		new Rock(100,300, mainStage);
		new Rock(300,350, mainStage);
		new Rock(400,250, mainStage);

		turtle = new Turtle(20,20, mainStage);

		whirlpool = new Whirlpool(0, 0, mainStage);
		whirlpool.setVisible(false);
		whirlpool.setAnimationPaused(true);

		youWinMessage = new BaseActor(0,0,mainStage);
		youWinMessage.setVisible(false);
		youWinMessage.loadTexture("you-win.png");
		youWinMessage.centerAtPosition(400,300);
		youWinMessage.setOpacity(0);
	}

	@Override
	public void update(float dt) {

		for (BaseActor rockActor : BaseActor.getList(mainStage, "Rock"))
			turtle.preventOverlap(rockActor);
		for (BaseActor starfishActor : BaseActor.getList(mainStage, "Starfish"));

	}
}

