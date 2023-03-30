package com.example.schrodingerscat;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ImageView imageView;


    private float x;
    private float y;
    private String sDown;
    private String sMove;
    private String sUp;

    private final float xCat = 500;
    private final float yCat = 500;
    private final float deltaCat = 50;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView7);

        imageView.setOnTouchListener(listener);




    }

    private View.OnTouchListener listener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {

            y = motionEvent.getY();
            x = motionEvent.getX();

            if (x < (xCat + deltaCat) && x > (xCat - deltaCat) && y < (yCat + deltaCat) && y > (yCat - deltaCat)) {
                imageView.setImageResource(R.drawable.meow);
            Toast toast =Toast.makeText(getApplicationContext(), "Вы нашли кота!", Toast.LENGTH_SHORT);
            toast.show();
                
            }
            else {
                imageView.setImageResource((R.drawable.yellow));
            }

            return true;
        }
    };



}