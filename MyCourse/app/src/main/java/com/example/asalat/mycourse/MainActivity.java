package com.example.asalat.mycourse;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Semester1, Semester2, Semester3,Modules,Reminder,Reminder2, Semester4,Semester5,Semester6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Semester1 = findViewById(R.id.button5);
        Semester1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSemester1Activity();
            }
        });

        Semester2 = findViewById(R.id.button6);
        Semester2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSemester2Activity();
            }
        });

        Semester3 = findViewById(R.id.button7);
        Semester3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSemester3Activity();
            }
        });

        Modules = findViewById(R.id.button2);
        Modules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openModulesActivity();
            }
        });

        Reminder = findViewById(R.id.button);
        Reminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReminderActivity();
            }
        });

        Semester4 = findViewById(R.id.button8);
        Semester4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSemester4Activity();
            }
        });

        Semester5 = findViewById(R.id.button9);
        Semester5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSemester5Activity();
            }
        });

        Semester6 = findViewById(R.id.button10);
        Semester6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSemester6Activity();
            }
        });
    }
    public void openSemester1Activity(){
        Intent intent = new Intent(this, Semester1Activity.class);
        startActivity(intent);
    }

    public void openSemester2Activity(){
        Intent intent = new Intent(this, Semester2Activity.class);
        startActivity(intent);
    }

    public void openSemester3Activity(){
        Intent intent = new Intent(this, Semester3Activity.class);
        startActivity(intent);
    }

    public void openModulesActivity(){
        Intent intent = new Intent(this, ModulesActivity.class);
        startActivity(intent);
    }

    public void openReminderActivity(){
        Intent intent = new Intent(this, ReminderActivity.class);
        startActivity(intent);
    }


    public void openSemester4Activity(){
        Intent intent = new Intent(this, Semester4Activity.class);
        startActivity(intent);
    }

    public void openSemester5Activity(){
        Intent intent = new Intent(this, Semester5Activity.class);
        startActivity(intent);
    }

    public void openSemester6Activity(){
        Intent intent = new Intent(this, Semester6Activity.class);
        startActivity(intent);
    }
}
