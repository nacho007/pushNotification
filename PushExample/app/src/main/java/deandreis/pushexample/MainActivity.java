package deandreis.pushexample;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import static deandreis.pushexample.MyApplication.session;

public class MainActivity extends ActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        session = new Object();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                navigate();
            }
        }, 3000);
    }

    public void onA(View v) {
        navigate();
    }

    private void navigate() {
        Intent intent = new Intent(this, ActivityA.class);
        startActivity(intent);
        finish();
    }

}
