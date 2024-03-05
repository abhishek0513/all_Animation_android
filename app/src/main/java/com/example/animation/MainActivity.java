package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtAnim;
    Button btnTrans, btnAlpha, btnScale, btnRotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtAnim  = findViewById(R.id.mainText);
        btnTrans = findViewById(R.id.translate);
        btnAlpha = findViewById(R.id.alpha);
        btnScale = findViewById(R.id.scale);
        btnRotate= findViewById(R.id.rotate);

        btnTrans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation move = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
                txtAnim.startAnimation(move);
            }
        });

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                txtAnim.startAnimation(alpha);
            }
        });


        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation scale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
                txtAnim.startAnimation(scale);
            }
        });


        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);
                txtAnim.startAnimation(rotate);
            }
        });

    }
}