package na.brexitsoundboard;

import android.view.View;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import na.brexitsoundboard.logging.FirebaseWrapper;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BorisSoundsTest {
    @Test
    public void ensureButtonsPlayCorrectSounds() throws Exception {
        BorisActivity borisActivity = new BorisActivity();
        borisActivity.firebaseWrapper = mock(FirebaseWrapper.class);

        Map<Integer, Integer> buttonIdToSoundId = new HashMap<Integer, Integer>();
        buttonIdToSoundId.put(R.id.buttonBoris350MillionPoundsAWeek, R.raw.boris_sound_350_million_pounds_a_week);
        buttonIdToSoundId.put(R.id.buttonBorisAllYourOptionsAreGood, R.raw.boris_sound_all_your_options_are_good);
        buttonIdToSoundId.put(R.id.buttonBorisCostOfGettingOutVirtuallyNil, R.raw.boris_sound_cost_of_getting_out_virtually_nil);
        buttonIdToSoundId.put(R.id.buttonBorisGoWhistle, R.raw.boris_sound_go_whistle);
        buttonIdToSoundId.put(R.id.buttonBorisHiggeldyPiggeldyNations, R.raw.boris_sound_higgeldy_piggeldy_nations);
        buttonIdToSoundId.put(R.id.buttonBorisMeetOurObligations, R.raw.boris_sound_meet_our_obligations);
        buttonIdToSoundId.put(R.id.buttonBorisPoundIsStable, R.raw.boris_sound_pound_is_stable);
        buttonIdToSoundId.put(R.id.buttonBorisRightsCompletelyProtected, R.raw.boris_sound_rights_completely_protected);
        buttonIdToSoundId.put(R.id.buttonBorisVindicatedByHistory, R.raw.boris_sound_vindicated_by_history);
        buttonIdToSoundId.put(R.id.buttonBorisWeExportTvAerials, R.raw.boris_sound_we_export_tv_aerials);
        buttonIdToSoundId.put(R.id.buttonBorisWeightLiftedFromBritishBusiness, R.raw.boris_sound_weight_lifted_from_british_business);
        buttonIdToSoundId.put(R.id.buttonBorisWinWinForAllOfUs, R.raw.boris_sound_win_win_for_all_off_us);

        View view = mock(View.class);
        for (Map.Entry<Integer, Integer> entry : buttonIdToSoundId.entrySet()) {
            when(view.getId()).thenReturn(entry.getKey().intValue());
            assertEquals(entry.getValue().intValue(), borisActivity.getRawSoundIdForViewId(view));
        }
    }
}