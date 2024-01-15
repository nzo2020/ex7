package com.example.ex7;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    ImageButton btn;


    ImageView iv;

    int rndNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        iv = findViewById(R.id.iv);


    }



    public void clicked(View view) {
        Random rnd = new Random();
        rndNumber= rnd.nextInt(3)+1;
        btn.setImageResource(R.drawable.picturee);
        if (rndNumber==1){
            iv.setImageResource(R.drawable.pic);
        }
        if (rndNumber==2){
            iv.setImageResource(R.drawable.pictu);
        }
        if (rndNumber==3){
            iv.setImageResource(R.drawable.pictur);
        }
    }
}
