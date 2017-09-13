package na.brexitsoundboard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class DavidActivity extends BrexitSoundboardActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_david);

        firebaseWrapper.firebaseAnalytics = FirebaseAnalytics.getInstance(this);

        registerClickListener(R.id.buttonDavidConfidentOfAGoodOutcome);
        registerClickListener(R.id.buttonDavidConstructiveAmbiguity);
        registerClickListener(R.id.buttonDavidDifficultToReadWhatWeIntend);
        registerClickListener(R.id.buttonDavidFollowUs);
        registerClickListener(R.id.buttonDavidIRuleNothingInNothingOut);
        registerClickListener(R.id.buttonDavidItsGettingABitTense);
        registerClickListener(R.id.buttonDavidItsGoingIncrediblyWell);
        registerClickListener(R.id.buttonDavidNobodyPretendedThisWillBeSimpleOrEasy);
        registerClickListener(R.id.buttonDavidVeryGoodLawyers);
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
            case R.id.buttonDavidConfidentOfAGoodOutcome:
                playMediaFile(R.raw.david_sound_confident_of_a_good_outcome);
                break;

            case R.id.buttonDavidConstructiveAmbiguity:
                playMediaFile(R.raw.david_sound_constructive_ambiguity);
                break;

            case R.id.buttonDavidDifficultToReadWhatWeIntend:
                playMediaFile(R.raw.david_sound_difficult_to_read_what_we_intend);
                break;

            case R.id.buttonDavidFollowUs:
                playMediaFile(R.raw.david_sound_follow_us);
                break;

            case R.id.buttonDavidIRuleNothingInNothingOut:
                playMediaFile(R.raw.david_sound_i_rule_nothing_in_nothing_out);
                break;

            case R.id.buttonDavidItsGettingABitTense:
                playMediaFile(R.raw.david_sound_its_getting_a_bit_tense);
                break;

            case R.id.buttonDavidItsGoingIncrediblyWell:
                playMediaFile(R.raw.david_sound_its_going_incredibly_well);
                break;

            case R.id.buttonDavidNobodyPretendedThisWillBeSimpleOrEasy:
                playMediaFile(R.raw.david_sound_nobody_pretended_this_will_be_simple_or_easy);
                break;

            case R.id.buttonDavidVeryGoodLawyers:
                playMediaFile(R.raw.david_sound_very_good_lawyers);
                break;
        }
    }
}
