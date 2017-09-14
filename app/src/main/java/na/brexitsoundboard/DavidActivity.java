package na.brexitsoundboard;

import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

public class DavidActivity extends BrexitSoundboardActivity {
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
}
