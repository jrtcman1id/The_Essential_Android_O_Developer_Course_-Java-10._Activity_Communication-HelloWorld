package id.man1.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String surName = i.getStringExtra("surname");
        String email = i.getStringExtra("email");

        TextView tvName = (TextView) findViewById(R.id.textViewName);
        TextView tvSurName = (TextView) findViewById(R.id.textViewSurName);
        TextView tvEmail = (TextView) findViewById(R.id.textViewEmail);

        tvName.setText(name);
        tvSurName.setText(surName);
        tvEmail.setText(email);
;    }
}
