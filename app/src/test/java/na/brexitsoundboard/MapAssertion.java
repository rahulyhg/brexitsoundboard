package na.brexitsoundboard;

import android.annotation.SuppressLint;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

import na.brexitsoundboard.buttontosound.MapButtonToSound;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public abstract class MapAssertion {
    @SuppressLint("UseSparseArrays")
    final
    Map<Integer, Integer> keyValueMap = new HashMap<>();

    void assertKeyValuesMatch() {
        MapButtonToSound mapButtonToSound = new MapButtonToSound();

        View view = mock(View.class);
        for (Map.Entry<Integer, Integer> entry : keyValueMap.entrySet()) {
            when(view.getId()).thenReturn(entry.getKey());
            assertEquals(entry.getValue(), (mapButtonToSound.buttonIdToSoundIdMap).get(view.getId()));
        }
    }
}
