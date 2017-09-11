package na.brexitsoundboard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerClickListenerForPerson(R.id.imageButtonBoris, BorisActivity.class);
        registerClickListenerForPerson(R.id.imageButtonDavid, DavidActivity.class);
        registerClickListenerForPerson(R.id.imageButtonLiam, LiamActivity.class);
        registerClickListenerForPerson(R.id.imageButtonTheresa, TheresaActivity.class);
        registerClickListenerSugguestionBox();
    }

    private void registerClickListenerForPerson(final int imageButtonViewId, final Class<?> activityClass) {
        final ImageButton imageButton = (ImageButton) findViewById(imageButtonViewId);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), activityClass);
                view.getContext().startActivity(Intent);
            }
        });
    }

    private void registerClickListenerSugguestionBox() {
        final ImageButton buttonSugguestionBox = (ImageButton) findViewById(R.id.imageButtonSugguestionBox);
        buttonSugguestionBox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfHLj5AkDLyb8fFAHtAl5AdJ1FrKE9gK5uxEnTt0J9sIOa2qQ/viewform?c=0&w=1"))
                );
            }
        });
    }
}
