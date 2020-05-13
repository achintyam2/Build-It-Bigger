package com.android.builditbigger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.jokeprovider.JokeProvider;
import com.android.jokesdisplay.JokeDisplayActivity;
import com.udacity.gradle.builditbigger.backend.MyEndpoint;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyEndpoint myEndpoint =new MyEndpoint();
    }

    public void tellJoke(View view) {
        JokeProvider jokeProvider = new JokeProvider();
        Intent intent = new Intent(this, JokeDisplayActivity.class);
        intent.putExtra("joke",jokeProvider.getJoke());
        startActivity(intent);
    }
}
