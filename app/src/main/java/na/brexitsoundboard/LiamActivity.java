package na.brexitsoundboard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LiamActivity extends SoundActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liam);
        registerClickListener(R.id.buttonLiamEasiestInHumanHistory);
        registerClickListener(R.id.buttonLiamWeCantBeBlackmailed);
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
            case R.id.buttonLiamEasiestInHumanHistory:
                playSound(R.raw.liam_sound_easiest_in_human_history);
                break;

            case R.id.buttonLiamWeCantBeBlackmailed:
                playSound(R.raw.liam_sound_we_cant_be_blackmailed);
                break;
        }
    }
}
