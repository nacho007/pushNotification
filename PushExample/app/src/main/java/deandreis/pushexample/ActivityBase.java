package deandreis.pushexample;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import static deandreis.pushexample.MyFirebaseMessagingService.id;

/**
 * Created by ignaciodeandreisdenis on 23/8/17.
 */

public class ActivityBase extends AppCompatActivity {

    static String BROADCAST = "BROADCAST";

    private BroadcastReceiver broadcastReceiver;

    @Override
    protected void onStart() {
        super.onStart();
//        Log.e(getClass().getSimpleName().toString(), "onStart");

        IntentFilter filter = new IntentFilter();
        filter.addAction(BROADCAST);

        broadcastReceiver = new BroadcastReceiver() {

            @Override
            public void onReceive(Context context, Intent intent) {

                try {

                    Log.e("BROADCAST", "onReceive");

                    String ns = Context.NOTIFICATION_SERVICE;
                    NotificationManager nMgr = (NotificationManager) getSystemService(ns);
                    nMgr.cancel(id);

                    if (intent.getAction() == BROADCAST) {

                        Bundle bundle = intent.getExtras();


                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };

        registerReceiver(broadcastReceiver, filter);
    }


    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(broadcastReceiver);
//        Log.e(getClass().getSimpleName().toString(), "onStop");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
//        Log.e(getClass().getSimpleName().toString(), "onSaveInstanceState");
        // call superclass to save any view hierarchy
        super.onSaveInstanceState(outState);
    }

}
