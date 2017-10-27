package na.brexitsoundboard;

import org.junit.Test;

public class BorisTest extends AssertMap {
    @Test
    public void ensureButtonsPlayCorrectSounds() throws Exception {
        keyValueMap.put(R.id.buttonBoris350MillionPoundsAWeek, R.raw.boris_sound_350_million_pounds_a_week);
        keyValueMap.put(R.id.buttonBorisAllYourOptionsAreGood, R.raw.boris_sound_all_your_options_are_good);
        keyValueMap.put(R.id.buttonBorisCostOfGettingOutVirtuallyNil, R.raw.boris_sound_cost_of_getting_out_virtually_nil);
        keyValueMap.put(R.id.buttonBorisGoWhistle, R.raw.boris_sound_go_whistle);
        keyValueMap.put(R.id.buttonBorisHiggeldyPiggeldyNations, R.raw.boris_sound_higgeldy_piggeldy_nations);
        keyValueMap.put(R.id.buttonBorisMeetOurObligations, R.raw.boris_sound_meet_our_obligations);
        keyValueMap.put(R.id.buttonBorisPoundIsStable, R.raw.boris_sound_pound_is_stable);
        keyValueMap.put(R.id.buttonBorisRightsCompletelyProtected, R.raw.boris_sound_rights_completely_protected);
        keyValueMap.put(R.id.buttonBorisTigerIntheTank, R.raw.boris_sound_tiger_in_the_tank);
        keyValueMap.put(R.id.buttonBorisVindicatedByHistory, R.raw.boris_sound_vindicated_by_history);
        keyValueMap.put(R.id.buttonBorisWeExportTvAerials, R.raw.boris_sound_we_export_tv_aerials);
        keyValueMap.put(R.id.buttonBorisWeightLiftedFromBritishBusiness, R.raw.boris_sound_weight_lifted_from_british_business);
        keyValueMap.put(R.id.buttonBorisWinWinForAllOfUs, R.raw.boris_sound_win_win_for_all_off_us);

        assertKeyValueMatch();
    }
}