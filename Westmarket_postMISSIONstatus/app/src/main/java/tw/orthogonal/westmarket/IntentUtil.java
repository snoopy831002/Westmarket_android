package tw.orthogonal.westmarket;

import android.app.Activity;
import android.content.Intent;

//import co.coderiver.facebooklogin_sample.ui.AccessTokenActivity;

/**
 * Created by kirkita on 06.10.15.
 */
public class IntentUtil {

    private Activity activity;

    // constructor
    public IntentUtil(Activity activity) {
        this.activity = activity;
    }

    public void showAccessToken() {
        Intent i = new Intent(activity, MainDrawer.class);
        activity.startActivity(i);
    }
}
