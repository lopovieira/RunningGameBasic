package com.hackaton.kissmyassfault;

import com.badlogic.gdx.Game;
import com.hackaton.kissmyassfault.screens.GameScreen;

public class KissMyAssfault extends Game {

	@Override
	public void create () {
		setScreen(new GameScreen());
	}

	@Override
	public void render() {
		super.render();
	}
}
