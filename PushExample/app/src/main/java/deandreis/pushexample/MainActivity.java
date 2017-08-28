package deandreis.pushexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends ActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onA(View v) {
        navigate();
    }

    private void navigate() {
        Intent intent = new Intent(this, ActivityA.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

}
