package net.noisebridge.dreamteam.setaide;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by kjs on 1/7/18.
 */

public class PictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);

        File img = (File) getIntent().getSerializableExtra("IMG");
        Bitmap bitmap = BitmapFactory.decodeFile(img.getPath());

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        Bitmap mScaledBitmap = Bitmap.createScaledBitmap(bitmap, size.x, size.y, true);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageBitmap(mScaledBitmap);
    }

}
