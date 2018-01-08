package net.noisebridge.dreamteam.setaide;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by kjs on 1/7/18.
 */

public class PictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        File img = (File) getIntent().getSerializableExtra("IMG");
        Bitmap bitmap = BitmapFactory.decodeFile(img.getPath());
        getIntent().removeExtra("IMG");

        setContentView(R.layout.activity_picture);

        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageBitmap(bitmap);
    }
}
