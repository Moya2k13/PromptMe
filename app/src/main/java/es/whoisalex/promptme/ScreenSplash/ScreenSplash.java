package es.whoisalex.promptme.ScreenSplash;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;

import es.whoisalex.promptme.Activitys.Camera2Activity;
import es.whoisalex.promptme.Activitys.ListViewActivity;
import es.whoisalex.promptme.Activitys.MainActivity;
import es.whoisalex.promptme.R;

public class ScreenSplash extends Activity {

    private static final long TIME = 2500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_screensplash);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(),ListViewActivity.class);
                startActivity(i);

            }
        };
        Timer timer = new Timer();
        timer.schedule(task, TIME);
    }

    @Override
    public void onBackPressed() {}
}