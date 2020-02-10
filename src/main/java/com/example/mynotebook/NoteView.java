package com.example.mynotebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NoteView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_view);

        TextView textview2 = (TextView)findViewById(R.id.textView2);

        Bundle extra = getIntent().getExtras();
        if(extra != null){
            String note = extra.getString("messageKey");
            textview2.setText(note);
        }
    }
}
