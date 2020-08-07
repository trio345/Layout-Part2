package id.co.mdd.challengetwoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.co.mdd.challengetwoapp.cart.MainCartActivity;
import id.co.mdd.challengetwoapp.music.MainMusicActivity;
import id.co.mdd.challengetwoapp.register.MainRegisterActivity;

public class MainActivity extends AppCompatActivity {
    Button btnCart, btnRegist, btnMusic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCart = findViewById(R.id.btnCartMain);
        btnRegist = findViewById(R.id.btnRegistMain);
        btnMusic = findViewById(R.id.btnMusicMain);

        redirectMainRegist();
        redirectMainCart();
        redirectMainMusic();

    }


    private void redirectMainRegist(){
        btnRegist.setOnClickListener(view -> startActivity(
                new Intent(
                        MainActivity.this,
                        MainRegisterActivity.class
                )
        ));
    }

    private void redirectMainCart(){
        btnCart.setOnClickListener(view -> startActivity(
                new Intent(
                        MainActivity.this,
                        MainCartActivity.class
                )
        ));
    }

    private void redirectMainMusic(){
        btnMusic.setOnClickListener(view -> startActivity(
                new Intent(
                        MainActivity.this,
                        MainMusicActivity.class
                )
        ));
    }



}