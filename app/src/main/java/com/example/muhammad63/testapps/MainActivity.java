package com.example.muhammad63.testapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

import static android.R.attr.value;
import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v)
    {

        if(v.getId() == R.id.Bdisplay)
        {

            Intent i = new Intent(MainActivity.this, Display.class);
            startActivity(i);
        }

    }

}


