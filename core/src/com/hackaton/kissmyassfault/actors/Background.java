package com.hackaton.kissmyassfault.actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.hackaton.kissmyassfault.utils.Constants;

public class Background extends Actor {

    private final TextureRegion textureRegion;
    private Rectangle textureRegionBounds1;
    private Rectangle textureRegionBounds2;
    private int speed = 200;

    public Background() {
        textureRegion = new TextureRegion(new Texture(Gdx.files.internal(Constants.BACKGROUND_IMAGE_PATH)));
        textureRegionBounds1 = new Rectangle(0 - Constants.GAME_WIDTH / 2, 0, Constants.GAME_WIDTH, Constants.GAME_HEIGHT);
        textureRegionBounds2 = new Rectangle(Constants.GAME_WIDTH / 2, 0, Constants.GAME_WIDTH, Constants.GAME_HEIGHT);
    }

    @Override
    public void act(float delta) {

        if (leftBoundsReached(delta)) {
            resetBounds();
        } else {
            updateXBounds(-delta);
        }
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);

        batch.draw(textureRegion, textureRegionBounds1.x, textureRegionBounds1.y, Constants.GAME_WIDTH,
                Constants.GAME_HEIGHT);
        batch.draw(textureRegion, textureRegionBounds2.x, textureRegionBounds2.y, Constants.GAME_WIDTH,
                Constants.GAME_HEIGHT);


    }

    private boolean leftBoundsReached(float delta) {
        return (textureRegionBounds2.x - (delta * speed)) <= 0;
    }

    private void updateXBounds(float delta) {
        textureRegionBounds1.x += delta * speed;
        textureRegionBounds2.x += delta * speed;
    }


    private void resetBounds() {
        textureRegionBounds1 = textureRegionBounds2;
        textureRegionBounds2 = new Rectangle(Constants.GAME_WIDTH, 0, Constants.GAME_WIDTH, Constants.GAME_HEIGHT);

    }

}