package de.crispysoft.marathon;

import android.os.Bundle;
import org.apache.cordova.DroidGap;

/**
 * By: Alexey Matveev
 * Date: 24.07.13
 * Time: 21:21
 */
public class MainActivity extends DroidGap {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/fries/demo/index.html");
    }

}
