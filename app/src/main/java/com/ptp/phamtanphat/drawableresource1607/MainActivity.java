package com.ptp.phamtanphat.drawableresource1607;

import android.graphics.drawable.ClipDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageviewClip);

        final ClipDrawable clipDrawable = (ClipDrawable) img.getDrawable();

        img.setImageLevel(1000);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clipDrawable.setLevel(clipDrawable.getLevel() + 100);
            }
        });
    }
}
