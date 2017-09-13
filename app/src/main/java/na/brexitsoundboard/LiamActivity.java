package na.brexitsoundboard;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class LiamActivity extends BrexitSoundboardActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liam);

        firebaseWrapper.firebaseAnalytics = FirebaseAnalytics.getInstance(this);

        registerClickListener(R.id.buttonLiamBlamingTheMedia);
        registerClickListener(R.id.buttonLiamChickenObsessedMedia);
        registerClickListener(R.id.buttonLiamCitizensFirstNotPolitics);
        registerClickListener(R.id.buttonLiamEasiestInHumanHistory);
        registerClickListener(R.id.buttonLiamHowWeConductOurselves);
        registerClickListener(R.id.buttonLiamIntemperateLanguage);
        registerClickListener(R.id.buttonLiamNotHavingADealWouldBeBad);
        registerClickListener(R.id.buttonLiamThisIsNotJustAboutEurope);
        registerClickListener(R.id.buttonLiamTooLazyAndTooFat);
        registerClickListener(R.id.buttonLiamTremendousOpportunitiesOutThere);
        registerClickListener(R.id.buttonLiamWeCantBeBlackmailed);
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
            case R.id.buttonLiamBlamingTheMedia:
                playMediaFile(R.raw.liam_sound_blaming_the_media);
                break;

            case R.id.buttonLiamChickenObsessedMedia:
                playMediaFile(R.raw.liam_sound_chicken_obsessed_media);
                break;

            case R.id.buttonLiamCitizensFirstNotPolitics:
                playMediaFile(R.raw.liam_sound_citizens_first_not_politics);
                break;

            case R.id.buttonLiamEasiestInHumanHistory:
                playMediaFile(R.raw.liam_sound_easiest_in_human_history);
                break;

            case R.id.buttonLiamHowWeConductOurselves:
                playMediaFile(R.raw.liam_sound_how_we_conduct_ourselves);
                break;

            case R.id.buttonLiamIntemperateLanguage:
                playMediaFile(R.raw.liam_sound_intemperate_language);
                break;

            case R.id.buttonLiamNotHavingADealWouldBeBad:
                playMediaFile(R.raw.liam_sound_not_having_a_deal_would_be_bad);
                break;

            case R.id.buttonLiamThisIsNotJustAboutEurope:
                playMediaFile(R.raw.liam_sound_this_is_not_just_about_europe);
                break;

            case R.id.buttonLiamTooLazyAndTooFat:
                playMediaFile(R.raw.liam_sound_too_lazy_and_too_fat);
                break;

            case R.id.buttonLiamTremendousOpportunitiesOutThere:
                playMediaFile(R.raw.liam_sound_tremendous_opportunities_out_there);
                break;

            case R.id.buttonLiamWeCantBeBlackmailed:
                playMediaFile(R.raw.liam_sound_we_cant_be_blackmailed);
                break;

        }
    }
}
