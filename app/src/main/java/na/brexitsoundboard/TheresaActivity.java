package na.brexitsoundboard;

import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

public class TheresaActivity extends BrexitSoundboardActivity {
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
}
