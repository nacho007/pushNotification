package deandreis.pushexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by ignaciodeandreisdenis on 22/8/17.
 */

public class ActivityA extends ActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

    public void onMain(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    public void onB(View v) {
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
    }

    @Override
    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);

    }

}
