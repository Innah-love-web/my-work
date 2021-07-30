package com.example.basicpart1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edittext1;
    private EditText edittext2;
    private Button button;
    private TextView textview1;
    private TextView textview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext1 = (EditText) findViewById(R.id.edittext1);
        edittext2 = (EditText) findViewById(R.id.edittext2);
        button = (Button) findViewById(R.id.button);
        textview1 = (TextView) findViewById(R.id.textview1);
        textview2 = (TextView) findViewById(R.id.textview2);


    }

    public void SendInfo(View view) {

        String user = edittext1.getText().toString();
        String password = edittext2.getText().toString();

        textview1.setText(user);
        textview2.setText(password);

    }
}