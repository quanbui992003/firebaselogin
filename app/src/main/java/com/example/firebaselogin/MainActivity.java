package com.example.firebaselogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle();
        String getdata=getIntent().getStringExtra("phonenumber");
        TextView textView=findViewById(R.id.txt_text);
        textView.setText(getdata);
    }
        private void setTitle(){
        if(getSupportActionBar()!=null){
            getSupportActionBar().setTitle("MainActivity");
        }
}

}