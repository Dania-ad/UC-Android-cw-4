package com.example.cw4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView studentpic = findViewById(R.id.imageView);
        TextView studentname = findViewById(R.id.textView);
        TextView studentage = findViewById(R.id.textView2);
        Button nextst = findViewById(R.id.button);


        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student("Dania",14,12,R.drawable.st1);
        Student student2 = new Student("Ali",13,10,R.drawable.st2);
        Student student3 = new Student("Sara",15,11,R.drawable.st3);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        studentpic.setImageResource(students.get(0).getStudentImg());
        studentname.setText(students.get(0).getStudentName());
        studentage.setText(students.get(0).getStudentAge()+"");

        context = this;



        nextst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                counter++;
                if(counter==students.size()) {
                    counter = 0;
                    Toast.makeText(context,"End of List",Toast.LENGTH_SHORT).show();

                }
                studentpic.setImageResource(students.get(counter).getStudentImg());
                studentname.setText(students.get(counter).getStudentName());
                studentage.setText(students.get(counter).getStudentAge()+"");

            }
        });

    }
}