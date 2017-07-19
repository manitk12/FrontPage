package com.grademojo.frontpage;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CardView studentCardView ,teacherCardview ,parentcardView;

    private TextView student ,teacher ,parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentCardView = (CardView) findViewById(R.id.cardStudent);
        teacherCardview = (CardView) findViewById(R.id.cardTeacher);
        parentcardView = (CardView) findViewById(R.id.cardParent);

        student =(TextView) findViewById(R.id.student1);
        teacher =(TextView) findViewById(R.id.teacher1);
        parent =(TextView) findViewById(R.id.parent1);


        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentCardView.setCardBackgroundColor(Color.parseColor("#FF4081"));
                teacherCardview.setCardBackgroundColor(Color.parseColor("#ffffff"));
                parentcardView.setCardBackgroundColor(Color.parseColor("#ffffff"));

            }
        });


        studentCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentCardView.setCardBackgroundColor(Color.parseColor("#FF4081"));
                teacherCardview.setCardBackgroundColor(Color.parseColor("#ffffff"));
                parentcardView.setCardBackgroundColor(Color.parseColor("#ffffff"));

            }
        });

        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teacherCardview.setCardBackgroundColor(Color.parseColor("#FF4081"));
                studentCardView.setCardBackgroundColor(Color.parseColor("#ffffff"));
                parentcardView.setCardBackgroundColor(Color.parseColor("#ffffff"));

            }
        });


        teacherCardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                teacherCardview.setCardBackgroundColor(Color.parseColor("#FF4081"));
                studentCardView.setCardBackgroundColor(Color.parseColor("#ffffff"));
                parentcardView.setCardBackgroundColor(Color.parseColor("#ffffff"));

            }
        });


        parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parentcardView.setCardBackgroundColor(Color.parseColor("#FF4081"));
                teacherCardview.setCardBackgroundColor(Color.parseColor("#ffffff"));
                studentCardView.setCardBackgroundColor(Color.parseColor("#ffffff"));

            }
        });


        parentcardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                parentcardView.setCardBackgroundColor(Color.parseColor("#FF4081"));
                teacherCardview.setCardBackgroundColor(Color.parseColor("#ffffff"));
                studentCardView.setCardBackgroundColor(Color.parseColor("#ffffff"));

            }
        });
    }
}
