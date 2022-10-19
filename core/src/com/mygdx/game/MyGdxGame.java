package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
    private SpriteBatch batch;
    private  Anim animation;
    private Boolean dir;
    @Override
    public void create() {
        batch = new SpriteBatch();
        animation = new Anim("Sprites2.png",6,4 , Animation.PlayMode.LOOP);
    }

    @Override
    public void render() {
        ScreenUtils.clear(1, 1, 1, 1);

        animation.setTime(Gdx.graphics.getDeltaTime());
        float x = Gdx.input.getX() - animation.getFrame().getRegionWidth()/2;
        float y = Gdx.graphics.getHeight() - Gdx.input.getY() - animation.getFrame().getRegionHeight() / 2;

        batch.begin();
        batch.draw(animation.getFrame(), 10,20);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        animation.dispose();
    }
}
