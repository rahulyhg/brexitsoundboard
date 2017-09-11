package na.brexitsoundboard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DavidActivity extends SoundActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_david);

        registerClickListener(R.id.buttonDavidConfidentOfAGoodOutcome);
        registerClickListener(R.id.buttonDavidFollowUs);
    }

    private void registerClickListener(final int buttonId) {
        Button button = (Button) findViewById(buttonId);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }

        switch (view.getId()) {
            case R.id.buttonDavidConfidentOfAGoodOutcome:
                playSound(R.raw.david_sound_confident_of_a_good_outcome);
                break;

            case R.id.buttonDavidFollowUs:
                playSound(R.raw.david_sound_follow_us);
                break;
        }
    }
}
