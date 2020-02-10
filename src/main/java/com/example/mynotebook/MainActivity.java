package com.example.mynotebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String messageKey = "MESSAGE_KEY";
    private String message ="";
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
    }
    public void savePressed(View view){
        message = editText.getText().toString();
        Log.i("all","saved: " + message);
    }
    public void getNoteView(View view){
        Intent intent = new Intent(this,NoteView.class);
        intent.putExtra("messageKey",message);
        startActivity(intent);
    }


}
