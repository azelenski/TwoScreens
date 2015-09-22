package com.example.ealezel.twoscreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {
    //public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    public final static String EXTRA_MESSAGE1 = "MESSAGE1";
    public final static String EXTRA_MESSAGE2 = "MESSAGE2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        TextView textView = (TextView) findViewById(R.id.OutputTextView);
        TextView textView2 = (TextView) findViewById(R.id.Output2TextView);

        Intent intent = getIntent();
        String message1 = intent.getStringExtra(EXTRA_MESSAGE1);
        String message2 = intent.getStringExtra(EXTRA_MESSAGE2);

        textView.setText(message1);
        textView2.setText(message2);
    }


    public void GoToSecondScreen(View view)
    {

        Intent goFirstIntent = new Intent(this, FirstScreen.class);
        startActivity(goFirstIntent);
    }
}
