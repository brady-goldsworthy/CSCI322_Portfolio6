package com.example.portfolio6;

/*
    Brady GOldsworthy z1816747
                and
    Justin Dupre z1835941

    Portfolio 6
 */

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static final String MA_TAG = "Lifecycle";

    private String createMessage, startMessage, resumeMessage, pauseMessage, stopMessage, restartMessage, destroyMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createMessage = (String) getResources().getText(R.string.createMsg);
        startMessage = (String) getResources().getText(R.string.startMsg);
        resumeMessage = (String) getResources().getText(R.string.resumeMsg);
        pauseMessage = (String) getResources().getText(R.string.pauseMsg);
        stopMessage = (String) getResources().getText(R.string.stopMsg);
        restartMessage = (String) getResources().getText(R.string.restartMsg);
        destroyMessage = (String) getResources().getText(R.string.destroyMsg);

        Toast.makeText(getApplicationContext(), createMessage, Toast.LENGTH_SHORT).show();

        Log.d(MA_TAG, createMessage);
    }

    @Override
    protected void onStart() {
    super.onStart();

    Toast.makeText(getApplicationContext(), startMessage, Toast.LENGTH_SHORT).show();
        Log.d(MA_TAG, startMessage);

    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(getApplicationContext(), resumeMessage, Toast.LENGTH_SHORT).show();
        Log.d(MA_TAG, resumeMessage);
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(getApplicationContext(), pauseMessage, Toast.LENGTH_SHORT).show();
        Log.d(MA_TAG, pauseMessage);

    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(getApplicationContext(), stopMessage, Toast.LENGTH_SHORT).show();
        Log.d(MA_TAG, stopMessage);
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(getApplicationContext(), restartMessage, Toast.LENGTH_SHORT).show();
        Log.d(MA_TAG, restartMessage);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(getApplicationContext(), destroyMessage, Toast.LENGTH_SHORT).show();
        Log.d(MA_TAG, destroyMessage);
    }

    public void openActivity(View v) {
        Intent openIntent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(openIntent);
    }
}
