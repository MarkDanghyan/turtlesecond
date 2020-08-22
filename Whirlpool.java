package com.turtlesecondgdx.game;

import com.badlogic.gdx.scenes.scene2d.Stage;

public class Whirlpool extends BaseActor {
    public Whirlpool(float x, float y, Stage stage) {
        super(x, y, stage);
        loadAnimationFromSheet("whirlpool.png", 2, 5, 0.1f, true);
    }
    public void act(float dt) {
        super.act(dt);
        if (isAnimationFinished())
            remove();
    }
}
