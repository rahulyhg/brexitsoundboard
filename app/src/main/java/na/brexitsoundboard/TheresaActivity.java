package na.brexitsoundboard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TheresaActivity extends SoundActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theresa);
        registerClickListener(R.id.buttonTheresaBrexitMeansBrexit);
        registerClickListener(R.id.buttonTheresaNoNeedForAnElection);
        registerClickListener(R.id.buttonTheresaRedWhiteAndBlueBrexit);
        registerClickListener(R.id.buttonTheresaStrongAndStableLeadership);
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
            case R.id.buttonTheresaBrexitMeansBrexit:
                playSound(R.raw.theresa_sound_brexit_means_brexit);
                break;

            case R.id.buttonTheresaNoNeedForAnElection:
                playSound(R.raw.theresa_sound_no_need_for_an_election);
                break;

            case R.id.buttonTheresaRedWhiteAndBlueBrexit:
                playSound(R.raw.theresa_sound_red_white_and_blue_brexit);
                break;

            case R.id.buttonTheresaStrongAndStableLeadership:
                playSound(R.raw.theresa_sound_strong_and_stable_leadership);
                break;
        }
    }
}
