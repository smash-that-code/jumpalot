package jump.concept.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import jump.concept.JumpOne;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.fullscreen = false;
		config.samples = 4; //antialiasing
		config.title = "Start small and keep it fun (with jumps)!";
		config.width = 1920;
		config.height = 1000;
		new LwjglApplication(new JumpOne(), config);
	}
}
