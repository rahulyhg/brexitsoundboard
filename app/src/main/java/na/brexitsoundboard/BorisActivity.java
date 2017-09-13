package na.brexitsoundboard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class BorisActivity extends BrexitSoundboardActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boris);

        firebaseWrapper.firebaseAnalytics = FirebaseAnalytics.getInstance(this);

        registerClickListener(R.id.buttonBoris350MillionPoundsAWeek);
        registerClickListener(R.id.buttonBorisAllYourOptionsAreGood);
        registerClickListener(R.id.buttonBorisCostOfGettingOutVirtuallyNil);
        registerClickListener(R.id.buttonBorisGoWhistle);
        registerClickListener(R.id.buttonBorisHiggeldyPiggeldyNations);
        registerClickListener(R.id.buttonBorisMeetOurObligations);
        registerClickListener(R.id.buttonBorisPoundIsStable);
        registerClickListener(R.id.buttonBorisRightsCompletelyProtected);
        registerClickListener(R.id.buttonBorisVindicatedByHistory);
        registerClickListener(R.id.buttonBorisWeExportTvAerials);
        registerClickListener(R.id.buttonBorisWeightLiftedFromBritishBusiness);
        registerClickListener(R.id.buttonBorisWinWinForAllOfUs);
    }

    private void registerClickListener(final int buttonId) {
        Button button = (Button) findViewById(buttonId);
        button.setOnClickListener(this);
    }

    public int getRawSoundIdForViewId(final View viewId) {
        int soundId = 0;
        switch (viewId.getId()) {
            case R.id.buttonBoris350MillionPoundsAWeek:
                soundId = R.raw.boris_sound_350_million_pounds_a_week;
                break;

            case R.id.buttonBorisAllYourOptionsAreGood:
                soundId = R.raw.boris_sound_all_your_options_are_good;
                break;

            case R.id.buttonBorisCostOfGettingOutVirtuallyNil:
                soundId = R.raw.boris_sound_cost_of_getting_out_virtually_nil;
                break;

            case R.id.buttonBorisGoWhistle:
                soundId = R.raw.boris_sound_go_whistle;
                break;

            case R.id.buttonBorisHiggeldyPiggeldyNations:
                soundId = R.raw.boris_sound_higgeldy_piggeldy_nations;
                break;

            case R.id.buttonBorisMeetOurObligations:
                soundId = R.raw.boris_sound_meet_our_obligations;
                break;

            case R.id.buttonBorisPoundIsStable:
                soundId = R.raw.boris_sound_pound_is_stable;
                break;

            case R.id.buttonBorisRightsCompletelyProtected:
                soundId = R.raw.boris_sound_rights_completely_protected;
                break;

            case R.id.buttonBorisVindicatedByHistory:
                soundId = R.raw.boris_sound_vindicated_by_history;
                break;

            case R.id.buttonBorisWeExportTvAerials:
                soundId = R.raw.boris_sound_we_export_tv_aerials;
                break;

            case R.id.buttonBorisWeightLiftedFromBritishBusiness:
                soundId = R.raw.boris_sound_weight_lifted_from_british_business;
                break;

            case R.id.buttonBorisWinWinForAllOfUs:
                soundId = R.raw.boris_sound_win_win_for_all_off_us;
                break;
        }
        return soundId;
    }

    @Override
    public void onClick(View view) {
        resetMediaPlayer();
        firebaseWrapper.logAnalyticsEvent("id", "name", "contentType");
        playMediaFile(getRawSoundIdForViewId(view));
    }
}