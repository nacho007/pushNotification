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

    public void onB(View v) {
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
    }

}
