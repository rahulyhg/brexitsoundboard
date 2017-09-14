package na.brexitsoundboard;

import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

public class LiamActivity extends BrexitSoundboardActivity {
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
}
