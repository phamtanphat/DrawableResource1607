package com.ptp.phamtanphat.drawableresource1607;

import android.graphics.drawable.ClipDrawable;
import android.os.Handler;
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
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (clipDrawable.getLevel() >= 10000){
                            img.setImageLevel(1000);
                        }
                        clipDrawable.setLevel(clipDrawable.getLevel() + 1000);
                        handler.postDelayed(this,1000);
                    }
                },1000);

            }
        });
    }
}
