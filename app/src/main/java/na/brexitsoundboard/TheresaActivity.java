package na.brexitsoundboard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class TheresaActivity extends BrexitSoundboardActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theresa);

        firebaseWrapper.firebaseAnalytics = FirebaseAnalytics.getInstance(this);

        registerClickListener(R.id.buttonTheresaBrexitMeansBrexit);
        registerClickListener(R.id.buttonTheresaEveryVoteForMe);
        registerClickListener(R.id.buttonTheresaNoDealBetterThanABadDeal);
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
        resetMediaPlayer();
        firebaseWrapper.logAnalyticsEvent("id", "name", "contentType");

        switch (view.getId()) {
            case R.id.buttonTheresaBrexitMeansBrexit:
                playMediaFile(R.raw.theresa_sound_brexit_means_brexit);
                break;

            case R.id.buttonTheresaEveryVoteForMe:
                playMediaFile(R.raw.theresa_sound_every_vote_for_me);
                break;

            case R.id.buttonTheresaNoDealBetterThanABadDeal:
                playMediaFile(R.raw.theresa_sound_no_deal_better_than_a_bad_deal);
                break;

            case R.id.buttonTheresaNoNeedForAnElection:
                playMediaFile(R.raw.theresa_sound_no_need_for_an_election);
                break;

            case R.id.buttonTheresaRedWhiteAndBlueBrexit:
                playMediaFile(R.raw.theresa_sound_red_white_and_blue_brexit);
                break;

            case R.id.buttonTheresaStrongAndStableLeadership:
                playMediaFile(R.raw.theresa_sound_strong_and_stable_leadership);
                break;
        }
    }
}
