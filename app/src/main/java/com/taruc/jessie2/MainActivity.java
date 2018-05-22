package com.taruc.jessie2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button buttonsend;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonsend = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
    }

    public void sendMessage(View v){

        //get message from editText
        String message = editText.getText().toString();

        //use intent to communicate with another activity
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key",message);
        startActivity(intent);
    }
}
