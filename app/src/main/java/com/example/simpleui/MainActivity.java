package com.example.simpleui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Send;

        final EditText prenom = findViewById(R.id.firstName);
        final EditText nom = findViewById(R.id.lastName);


        Send = (Button) findViewById(R.id.button4);

        Send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = prenom.getText().toString();
                String lastName = nom.getText().toString();
                Toast toast = Toast.makeText(getApplicationContext(), "Congratulations " + firstName + lastName, Toast.LENGTH_SHORT);
                toast.show();

            }
        });

    }
}
