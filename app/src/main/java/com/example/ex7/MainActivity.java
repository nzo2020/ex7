package com.example.ex7;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
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
        btn.setImageResource(R.drawable.pictureeee);



    }



    public void clicked(View view) {
        Random rnd = new Random();
        rndNumber= rnd.nextInt(3)+1;
        if (rndNumber==1){
            iv.setImageResource(R.drawable.gossip_girl);
            btn.setImageResource(R.drawable.picturee);

        }
        if (rndNumber==2){
            iv.setImageResource(R.drawable.lucifer);
            btn.setImageResource(R.drawable.pictureeeeee);

        }
        if (rndNumber==3){
            iv.setImageResource(R.drawable.galis);
            btn.setImageResource(R.drawable.pictureeeeeee);

        }
    }
}
