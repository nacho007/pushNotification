package deandreis.pushexample;

import android.app.Application;

/**
 * Created by ignaciodeandreisdenis on 23/8/17.
 */

public class MyApplication extends Application {

    public static boolean activityVisible = false;
    public static Object session = null;

    @Override
    public void onCreate() {
        super.onCreate();
        activityVisible = true;
    }

}
