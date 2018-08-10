package com.example.sendval;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CallerActivity extends AppCompatActivity {
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //inflation
        setContentView(R.layout.activity_caller);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CallerActivity.this, CalleeActivity.class);
                intent.putExtra("data-number", 10);
                intent.putExtra("data-string", "Android");

                startActivity(intent);
            }
        });
    }
}
