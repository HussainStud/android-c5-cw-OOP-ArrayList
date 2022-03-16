package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /**
     *  عرفوا مصفوفة بإسم students
     *  define an arraylist named students
     */

    ArrayList<Student> studentList = new ArrayList<>(4);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.studentListView);

        Student s1 = new Student("عبدالله", 20, 86, R.drawable.boy);
        Student s2 = new Student("ماجد", 22, 12, R.drawable.boy1);
        Student s3 = new Student("يوسف", 21, 44, R.drawable.boy2);
        Student s4 = new Student("رهف", 124, 100, R.drawable.girl);

       studentList.add(s1);
       studentList.add(s2);
       studentList.add(s3);
       studentList.add(s4);

       StudentAdapter studentAdapter = new StudentAdapter(this,0,studentList);


        listView.setAdapter(studentAdapter);
    }
}