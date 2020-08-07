package id.co.mdd.challengetwoapp.music;

import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Environment;
import android.view.View;
import android.widget.ImageView;

import id.co.mdd.challengetwoapp.R;

public class MainMusicActivity extends AppCompatActivity {

    ImageView imgClip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_music);
//        imgClip = findViewById(R.id.ivClip);

    }


//    public void loadBitMap(){
//        final String dir = getExternalFilesDir(Environment);
//    }
}