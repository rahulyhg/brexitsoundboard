package na.brexitsoundboard;

import android.app.Activity;
import android.media.MediaPlayer;

public class SoundActivity extends Activity {
    protected MediaPlayer mediaPlayer = null;

    protected void playSound(final int raw_sound) {
        mediaPlayer = MediaPlayer.create(this, raw_sound);
        mediaPlayer.start();
    }
}
