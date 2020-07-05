package id.man1.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartNewActivity(View view) {

        EditText name = (EditText) findViewById(R.id.editTextName);
        EditText surName = (EditText) findViewById(R.id.editTextSurName);
        EditText email = (EditText) findViewById(R.id.editTextEmail);

        Intent myIntent = new Intent(this, SecondActivity.class);
        Bundle b = new Bundle();
        b.putString("name", name.getText().toString());
        b.putString("surname", surName.getText().toString());
        b.putString("email", email.getText().toString());
        myIntent.putExtra("personbdl", b);
        startActivity(myIntent);
    }
}
