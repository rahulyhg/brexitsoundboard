package na.brexitsoundboard;

import org.junit.Test;

public class TheresaTest extends AssertMap {
    @Test
    public void ensureButtonsPlayCorrectSounds() throws Exception {
        keyValueMap.put(R.id.buttonTheresaBrexitMeansBrexit, R.raw.theresa_sound_brexit_means_brexit);
        keyValueMap.put(R.id.buttonTheresaEveryVoteForMe, R.raw.theresa_sound_every_vote_for_me);
        keyValueMap.put(R.id.buttonTheresaNoDealBetterThanABadDeal, R.raw.theresa_sound_no_deal_better_than_a_bad_deal);
        keyValueMap.put(R.id.buttonTheresaNoNeedForAnElection, R.raw.theresa_sound_no_need_for_an_election);
        keyValueMap.put(R.id.buttonTheresaRedWhiteAndBlueBrexit, R.raw.theresa_sound_red_white_and_blue_brexit);
        keyValueMap.put(R.id.buttonTheresaStrongAndStableLeadership, R.raw.theresa_sound_strong_and_stable_leadership);

        assertKeyValueMatch();
    }
}