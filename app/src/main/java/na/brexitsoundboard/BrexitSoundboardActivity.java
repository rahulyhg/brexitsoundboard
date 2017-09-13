package na.brexitsoundboard;

import android.app.Activity;
import android.media.MediaPlayer;

import na.brexitsoundboard.logging.FirebaseWrapper;

public class BrexitSoundboardActivity extends Activity {
    public FirebaseWrapper firebaseWrapper = new FirebaseWrapper();

    public MediaPlayer mediaPlayer = null;

    protected void resetMediaPlayer() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }

    protected void playMediaFile(final int raw_sound) {
        mediaPlayer = MediaPlayer.create(this, raw_sound);
        mediaPlayer.start();
    }
}
