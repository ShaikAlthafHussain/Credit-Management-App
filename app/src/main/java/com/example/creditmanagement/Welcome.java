package com.example.creditmanagement;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;


public class Welcome extends AppCompatActivity {

        private Button Users;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_welcome);
            Users=(Button)findViewById(R.id.users);

            Users.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Welcome.this,MainActivity.class);
                    startActivity(intent);
                }
            });

        }
    }
