package na.brexitsoundboard;

import android.app.Activity;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import na.brexitsoundboard.analytics.FirebaseWrapper;
import na.brexitsoundboard.buttontosound.MapButtonToSound;

public abstract class BrexitSoundboardActivity extends Activity implements View.OnClickListener {
    private final MapButtonToSound mapButtonToSound = new MapButtonToSound();

    private MediaPlayer mediaPlayer = null;

    final FirebaseWrapper firebaseWrapper = new FirebaseWrapper();

    private void resetMediaPlayer() {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }

    private void playMediaFile(final int raw_sound) {
        Log.i(this.getClass().getSimpleName(), "playMediaFile");
        mediaPlayer = MediaPlayer.create(this, raw_sound);
        mediaPlayer.start();
    }

    void registerClickListener(final int buttonId) {
        Button button = (Button) findViewById(buttonId);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.i(this.getClass().getSimpleName(), "onClick");
        firebaseWrapper.logAnalyticsEvent(
                this.getClass().getSimpleName(),
                getResources().getResourceName(view.getId()),
                "onClick");
        resetMediaPlayer();
        playMediaFile((mapButtonToSound.buttonIdToSoundIdMap).get(view.getId()));
    }
}
