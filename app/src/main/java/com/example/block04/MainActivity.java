package com.example.block04;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    MediaPlayer gigachadMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gigachadMusic  = MediaPlayer.create(this, R.raw.gigachad_meme_sound_effect);
        Switch switch_loop = (Switch) findViewById(R.id.switch_loop);
        switch_loop.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                gigachadMusic.setLooping(b);
            }
        });

    }

    public void playMusic(View view){
        gigachadMusic.start();
    }
    public void pauseMusic(View view){
        if(gigachadMusic.isPlaying())
            gigachadMusic.pause();
    }
}