package net.noisebridge.dreamteam.setaide;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.hardware.camera2.CameraAccessException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
    }

    public void openCamera(View view) throws CameraAccessException {
        Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);
    }

}
