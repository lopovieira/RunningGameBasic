package com.hackaton.kissmyassfault.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.hackaton.kissmyassfault.KissMyAssfault;
import com.hackaton.kissmyassfault.utils.Constants;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Constants.GAME_WIDTH;
		config.height = Constants.GAME_HEIGHT;
		new LwjglApplication(new KissMyAssfault(), config);
	}
}
