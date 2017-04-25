package com.example.a00421.testbitrise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add branch develop

//        Toast.makeText(this, "Push something to branch develop", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Create brnach feature/aboc", Toast.LENGTH_SHORT).show();
    }
}
