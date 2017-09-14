package na.brexitsoundboard.buttontosound;

import android.annotation.SuppressLint;

import java.util.HashMap;
import java.util.Map;

import na.brexitsoundboard.R;

public class MapButtonToSound {
    @SuppressLint("UseSparseArrays")
    public final Map<Integer, Integer> buttonIdToSoundIdMap = new HashMap<>();

    public MapButtonToSound() {
        populateBorisButtonToSoundMap();
        populateDavidButtonToSoundMap();
        populateLiamButtonToSoundMap();
        populateTheresaButtonToSoundMap();
    }

    private void populateBorisButtonToSoundMap() {
        buttonIdToSoundIdMap.put(R.id.buttonBoris350MillionPoundsAWeek, R.raw.boris_sound_350_million_pounds_a_week);
        buttonIdToSoundIdMap.put(R.id.buttonBorisAllYourOptionsAreGood, R.raw.boris_sound_all_your_options_are_good);
        buttonIdToSoundIdMap.put(R.id.buttonBorisCostOfGettingOutVirtuallyNil, R.raw.boris_sound_cost_of_getting_out_virtually_nil);
        buttonIdToSoundIdMap.put(R.id.buttonBorisGoWhistle, R.raw.boris_sound_go_whistle);
        buttonIdToSoundIdMap.put(R.id.buttonBorisHiggeldyPiggeldyNations, R.raw.boris_sound_higgeldy_piggeldy_nations);
        buttonIdToSoundIdMap.put(R.id.buttonBorisMeetOurObligations, R.raw.boris_sound_meet_our_obligations);
        buttonIdToSoundIdMap.put(R.id.buttonBorisPoundIsStable, R.raw.boris_sound_pound_is_stable);
        buttonIdToSoundIdMap.put(R.id.buttonBorisRightsCompletelyProtected, R.raw.boris_sound_rights_completely_protected);
        buttonIdToSoundIdMap.put(R.id.buttonBorisVindicatedByHistory, R.raw.boris_sound_vindicated_by_history);
        buttonIdToSoundIdMap.put(R.id.buttonBorisWeExportTvAerials, R.raw.boris_sound_we_export_tv_aerials);
        buttonIdToSoundIdMap.put(R.id.buttonBorisWeightLiftedFromBritishBusiness, R.raw.boris_sound_weight_lifted_from_british_business);
        buttonIdToSoundIdMap.put(R.id.buttonBorisWinWinForAllOfUs, R.raw.boris_sound_win_win_for_all_off_us);
    }

    private void populateDavidButtonToSoundMap() {
        buttonIdToSoundIdMap.put(R.id.buttonDavidConfidentOfAGoodOutcome, R.raw.david_sound_confident_of_a_good_outcome);
        buttonIdToSoundIdMap.put(R.id.buttonDavidConstructiveAmbiguity, R.raw.david_sound_constructive_ambiguity);
        buttonIdToSoundIdMap.put(R.id.buttonDavidDifficultToReadWhatWeIntend, R.raw.david_sound_difficult_to_read_what_we_intend);
        buttonIdToSoundIdMap.put(R.id.buttonDavidFollowUs, R.raw.david_sound_follow_us);
        buttonIdToSoundIdMap.put(R.id.buttonDavidIRuleNothingInNothingOut, R.raw.david_sound_i_rule_nothing_in_nothing_out);
        buttonIdToSoundIdMap.put(R.id.buttonDavidItsGettingABitTense, R.raw.david_sound_its_getting_a_bit_tense);
        buttonIdToSoundIdMap.put(R.id.buttonDavidItsGoingIncrediblyWell, R.raw.david_sound_its_going_incredibly_well);
        buttonIdToSoundIdMap.put(R.id.buttonDavidNobodyPretendedThisWillBeSimpleOrEasy, R.raw.david_sound_nobody_pretended_this_will_be_simple_or_easy);
        buttonIdToSoundIdMap.put(R.id.buttonDavidVeryGoodLawyers, R.raw.david_sound_very_good_lawyers);
    }

    private void populateLiamButtonToSoundMap() {
        buttonIdToSoundIdMap.put(R.id.buttonLiamBlamingTheMedia, R.raw.liam_sound_blaming_the_media);
        buttonIdToSoundIdMap.put(R.id.buttonLiamChickenObsessedMedia, R.raw.liam_sound_chicken_obsessed_media);
        buttonIdToSoundIdMap.put(R.id.buttonLiamCitizensFirstNotPolitics, R.raw.liam_sound_citizens_first_not_politics);
        buttonIdToSoundIdMap.put(R.id.buttonLiamEasiestInHumanHistory, R.raw.liam_sound_easiest_in_human_history);
        buttonIdToSoundIdMap.put(R.id.buttonLiamHowWeConductOurselves, R.raw.liam_sound_how_we_conduct_ourselves);
        buttonIdToSoundIdMap.put(R.id.buttonLiamIntemperateLanguage, R.raw.liam_sound_intemperate_language);
        buttonIdToSoundIdMap.put(R.id.buttonLiamNotHavingADealWouldBeBad, R.raw.liam_sound_not_having_a_deal_would_be_bad);
        buttonIdToSoundIdMap.put(R.id.buttonLiamThisIsNotJustAboutEurope, R.raw.liam_sound_this_is_not_just_about_europe);
        buttonIdToSoundIdMap.put(R.id.buttonLiamTooLazyAndTooFat, R.raw.liam_sound_too_lazy_and_too_fat);
        buttonIdToSoundIdMap.put(R.id.buttonLiamTremendousOpportunitiesOutThere, R.raw.liam_sound_tremendous_opportunities_out_there);
        buttonIdToSoundIdMap.put(R.id.buttonLiamWeCantBeBlackmailed, R.raw.liam_sound_we_cant_be_blackmailed);
        buttonIdToSoundIdMap.put(R.id.buttonBoris350MillionPoundsAWeek, R.raw.boris_sound_350_million_pounds_a_week);
    }

    private void populateTheresaButtonToSoundMap() {
        buttonIdToSoundIdMap.put(R.id.buttonTheresaBrexitMeansBrexit, R.raw.theresa_sound_brexit_means_brexit);
        buttonIdToSoundIdMap.put(R.id.buttonTheresaEveryVoteForMe, R.raw.theresa_sound_every_vote_for_me);
        buttonIdToSoundIdMap.put(R.id.buttonTheresaNoDealBetterThanABadDeal, R.raw.theresa_sound_no_deal_better_than_a_bad_deal);
        buttonIdToSoundIdMap.put(R.id.buttonTheresaNoNeedForAnElection, R.raw.theresa_sound_no_need_for_an_election);
        buttonIdToSoundIdMap.put(R.id.buttonTheresaRedWhiteAndBlueBrexit, R.raw.theresa_sound_red_white_and_blue_brexit);
        buttonIdToSoundIdMap.put(R.id.buttonTheresaStrongAndStableLeadership, R.raw.theresa_sound_strong_and_stable_leadership);
    }
}
