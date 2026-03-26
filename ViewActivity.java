package com.example.appaudioramses;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ViewActivity extends AppCompatActivity {

    Button play1, play2, play3, play4, play5, play6,share1, share2, share3, share4, share5, share6,blue1, blue2, blue3, blue4, blue5, blue6;
    MediaPlayer mp1, mp2, mp3, mp4, mp5, mp6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        setContentView(R.layout.activity_view);
        play1 = (Button)findViewById(R.id.play1);
        play2 = (Button)findViewById(R.id.play2);
        play3 = (Button)findViewById(R.id.play3);
        play4 = (Button)findViewById(R.id.play4);
        play5 = (Button)findViewById(R.id.play5);
        play6 = (Button)findViewById(R.id.play6);
        share1 = (Button)findViewById(R.id.share1);
        share2 = (Button)findViewById(R.id.share2);
        share3 = (Button)findViewById(R.id.share3);
        share4 = (Button)findViewById(R.id.share4);
        share5 = (Button)findViewById(R.id.share5);
        share6 = (Button)findViewById(R.id.share6);
        blue1 = (Button)findViewById(R.id.blue1);
        blue2 = (Button)findViewById(R.id.blue2);
        blue3 = (Button)findViewById(R.id.blue3);
        blue4 = (Button)findViewById(R.id.blue4);
        blue5 = (Button)findViewById(R.id.blue5);
        blue6 = (Button)findViewById(R.id.blue6);
        mp1 = MediaPlayer.create(this, R.raw.iphone_notificacion);
        mp2 = MediaPlayer.create(this, R.raw.mario_coin);
        mp3 = MediaPlayer.create(this, R.raw.pacman_dies);
        mp4 = MediaPlayer.create(this, R.raw.ringtones_nokia_iphone);
        mp5 = MediaPlayer.create(this, R.raw.ringtones_super_mario_bros);
        mp6 = MediaPlayer.create(this, R.raw.tono_mensaje_3);

        play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // isPlaying() verifica si está sonando para poder pausarlo
                if(mp1.isPlaying()){
                    mp1.pause();
                    Toast.makeText(ViewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                } else {
                    mp1.start();
                    Toast.makeText(ViewActivity.this, "Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // isPlaying() verifica si está sonando para poder pausarlo
                if(mp2.isPlaying()){
                    mp2.pause();
                    Toast.makeText(ViewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                } else {
                    mp2.start();
                    Toast.makeText(ViewActivity.this, "Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        play3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // isPlaying() verifica si está sonando para poder pausarlo
                if(mp3.isPlaying()){
                    mp3.pause();
                    Toast.makeText(ViewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                } else {
                    mp3.start();
                    Toast.makeText(ViewActivity.this, "Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        play4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // isPlaying() verifica si está sonando para poder pausarlo
                if(mp4.isPlaying()){
                    mp4.pause();
                    Toast.makeText(ViewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                } else {
                    mp4.start();
                    Toast.makeText(ViewActivity.this, "Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        play5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // isPlaying() verifica si está sonando para poder pausarlo
                if(mp5.isPlaying()){
                    mp5.pause();
                    Toast.makeText(ViewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                } else {
                    mp5.start();
                    Toast.makeText(ViewActivity.this, "Play", Toast.LENGTH_SHORT).show();
                }
            }
        });

        play6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // isPlaying() verifica si está sonando para poder pausarlo
                if(mp6.isPlaying()){
                    mp6.pause();
                    Toast.makeText(ViewActivity.this, "Pausa", Toast.LENGTH_SHORT).show();
                } else {
                    mp6.start();
                    Toast.makeText(ViewActivity.this, "Play", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
