package com.example.portfolio6;

/*
    Brady GOldsworthy z1816747
                and
    Justin Dupre z1835941

    Portfolio 6
 */

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends Activity {

    private static final String SA_TAG = "SecondActivityLifecycle";

    private String createMessage, startMessage, resumeMessage, pauseMessage, stopMessage, restartMessage, destroyMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        createMessage = (String) getResources().getText(R.string.createMsg2);
        startMessage = (String) getResources().getText(R.string.startMsg2);
        resumeMessage = (String) getResources().getText(R.string.resumeMsg2);
        pauseMessage = (String) getResources().getText(R.string.pauseMsg2);
        stopMessage = (String) getResources().getText(R.string.stopMsg2);
        restartMessage = (String) getResources().getText(R.string.restartMsg2);
        destroyMessage = (String) getResources().getText(R.string.destroyMsg2);

        Log.d(SA_TAG, createMessage);

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(SA_TAG, startMessage);

    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(SA_TAG, resumeMessage);
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(SA_TAG, pauseMessage);

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(SA_TAG, stopMessage);
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(SA_TAG, restartMessage);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(SA_TAG, destroyMessage);
    }

    public void goBack(View v) {
        finish();
    }

}
