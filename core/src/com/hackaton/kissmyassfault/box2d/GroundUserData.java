package com.hackaton.kissmyassfault.box2d;

import com.hackaton.kissmyassfault.enums.UserDataType;

public class GroundUserData extends UserData {

    public GroundUserData(float width, float height) {
        super(width, height);
        userDataType = UserDataType.GROUND;
    }
}
