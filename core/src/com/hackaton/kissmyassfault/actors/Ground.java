package com.hackaton.kissmyassfault.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.hackaton.kissmyassfault.box2d.GroundUserData;
import com.hackaton.kissmyassfault.box2d.UserData;

/**
 * Created by cadet on 30/10/15.
 */
public class Ground extends GameActor{

    public Ground(Body body) {
        super(body);
    }

    @Override
    public UserData getUserData() {
        return (GroundUserData) userData;
    }
}
