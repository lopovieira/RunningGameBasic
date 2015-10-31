package com.hackaton.kissmyassfault.actors;

import com.badlogic.gdx.physics.box2d.Body;
import com.hackaton.kissmyassfault.box2d.RunnerUserData;

public class Runner extends GameActor {

    private boolean jumping = false;
    private boolean dodging = false;
    private boolean hitted = false;

    public Runner(Body body) {
        super(body);
    }

    @Override
    public RunnerUserData getUserData() {
        return (RunnerUserData) userData;
    }

    public void jump(){

        if (!(jumping || dodging || hitted)){
            body.applyLinearImpulse(getUserData().getJumpingLinearImpulse(), body.getWorldCenter(), true);
            jumping = true;
        }

    }

    public void landed(){
        jumping = false;
    }

    public void dodge(){
        if (!(jumping || hitted)){
            body.setTransform(getUserData().getDodgePosition(), getUserData().getDodgeAngle());
            dodging = true;
        }
    }

    public void stopDodge(){
        dodging = false;
        if (!hitted) body.setTransform(getUserData().getRunningPosition(), 0f);
    }

    public boolean isDodging(){
        return dodging;
    }

    public void hit() {
        body.applyAngularImpulse(getUserData().getHitAngularImpulse(), true);
        hitted = true;
    }

    public boolean isHitted() {
        return hitted;
    }
}
