package na.brexitsoundboard;

import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

public class BorisActivity extends BrexitSoundboardActivity {
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
        registerClickListener(R.id.buttonBorisTalkingWithoutDetail);
        registerClickListener(R.id.buttonBorisTigerIntheTank);
        registerClickListener(R.id.buttonBorisVindicatedByHistory);
        registerClickListener(R.id.buttonBorisWeExportTvAerials);
        registerClickListener(R.id.buttonBorisWeightLiftedFromBritishBusiness);
        registerClickListener(R.id.buttonBorisWinWinForAllOfUs);
        registerClickListener(R.id.buttonBorisUsaVeryEnthusiasticAboutFreeTradeDeal);
    }
}