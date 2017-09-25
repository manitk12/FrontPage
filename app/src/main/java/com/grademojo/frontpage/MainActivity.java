package com.grademojo.frontpage;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {



    private View mainContainer;




    private CardView studentCardView, teacherCardView, parentCardView;

    private TextView studentTextView, teacherTextView, parentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        studentCardView = (CardView) findViewById(R.id.cardStudent);
        teacherCardView = (CardView) findViewById(R.id.cardTeacher);
        parentCardView = (CardView) findViewById(R.id.cardParent);

        mainContainer = findViewById(R.id.main_container);

        studentTextView =(TextView) findViewById(R.id.student_textview);
        teacherTextView =(TextView) findViewById(R.id.teacher_textview);
        parentTextView =(TextView) findViewById(R.id.parent_textview);







        View.OnClickListener studentListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                studentCardView.setCardBackgroundColor(Color.parseColor("#FF4081"));
                teacherCardView.setCardBackgroundColor(Color.parseColor("#ffffff"));
                parentCardView.setCardBackgroundColor(Color.parseColor("#ffffff"));




                YoYo.with(Techniques.RollIn).duration(1000).playOn(studentCardView);
                YoYo.with(Techniques.RollOut).duration(1000).playOn(teacherCardView);
                YoYo.with(Techniques.RollOut).duration(1000).playOn(parentCardView);








            }
        };


        studentTextView.setOnClickListener(studentListener);
        studentCardView.setOnClickListener(studentListener);


        View.OnClickListener teacherListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   teacherCardView.setCardBackgroundColor(Color.parseColor("#FF4081"));
                studentCardView.setCardBackgroundColor(Color.parseColor("#ffffff"));
                parentCardView.setCardBackgroundColor(Color.parseColor("#ffffff"));


                YoYo.with(Techniques.RollIn).duration(1000).playOn(teacherCardView);
                YoYo.with(Techniques.RollOut).duration(1000).playOn(studentCardView);
                YoYo.with(Techniques.RollOut).duration(1000).playOn(parentCardView);
                teacherCardView.setCardBackgroundColor(Color.parseColor("#121212"));


            }
        };


        teacherTextView.setOnClickListener(teacherListener);
        teacherCardView.setOnClickListener(teacherListener);



        View.OnClickListener parentListener =new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parentCardView.setCardBackgroundColor(Color.parseColor("#FF4081"));
                teacherCardView.setCardBackgroundColor(Color.parseColor("#ffffff"));
                studentCardView.setCardBackgroundColor(Color.parseColor("#ffffff"));



                YoYo.with(Techniques.RollIn).duration(1000).playOn(parentCardView);
                YoYo.with(Techniques.RollOut).duration(1000).playOn(teacherCardView);
                YoYo.with(Techniques.RollOut).duration(1000).playOn(studentCardView);


            }
        };



        parentTextView.setOnClickListener(parentListener);
        parentCardView.setOnClickListener(parentListener);
    }
}
