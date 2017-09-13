package na.brexitsoundboard;

import android.app.Activity;
import android.media.MediaPlayer;

import na.brexitsoundboard.logging.FirebaseWrapper;

public abstract class BrexitSoundboardActivity extends Activity {
    public FirebaseWrapper firebaseWrapper = new FirebaseWrapper();

    private MediaPlayer mediaPlayer = null;

    void resetMediaPlayer() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }

    void playMediaFile(final int raw_sound) {
        mediaPlayer = MediaPlayer.create(this, raw_sound);
        mediaPlayer.start();
    }
}
