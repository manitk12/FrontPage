package com.grademojo.frontpage;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Login_Screen extends AppCompatActivity {

    private  float SCREEN_DENSITY;





    private CardView Teacher_Card_View ,Student_Card_View , Parent_Card_View;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__screen);


        Teacher_Card_View = (CardView) findViewById(R.id.cardTeacher);
        Student_Card_View = (CardView) findViewById(R.id.cardStudent);
        Parent_Card_View = (CardView) findViewById(R.id.cardParent);



        SCREEN_DENSITY = getScreenDensityScale(this);





        Teacher_Card_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Teacher_Card_View.setScaleX(2);
//                Teacher_Card_View.setScaleX(2);

                ViewGroup.LayoutParams teacher = Teacher_Card_View.getLayoutParams();
                ViewGroup.LayoutParams student = Student_Card_View.getLayoutParams();
                ViewGroup.LayoutParams parent = Parent_Card_View.getLayoutParams();


                Teacher_Card_View.setRadius(convertDpToPx(40,SCREEN_DENSITY));
                Student_Card_View.setRadius(convertDpToPx(30,SCREEN_DENSITY));
                Parent_Card_View.setRadius(convertDpToPx(30,SCREEN_DENSITY));




                teacher.height = convertDpToPx(80,SCREEN_DENSITY);
                teacher.width = convertDpToPx(80, SCREEN_DENSITY);
                Teacher_Card_View.setLayoutParams(teacher);

                student.height = convertDpToPx(60,SCREEN_DENSITY);
                student.width = convertDpToPx(60, SCREEN_DENSITY);
                Student_Card_View.setLayoutParams(student);

                parent.height = convertDpToPx(60,SCREEN_DENSITY);
                parent.width = convertDpToPx(60, SCREEN_DENSITY);
                Parent_Card_View.setLayoutParams(parent);


//                Log.d("@@@@","hello");
//                Log.d("@@@@" ,"height is" + Teacher_Card_View.getLayoutParams().height );
//                Log.d("@@@@" ,"width is" + Teacher_Card_View.getLayoutParams().width );
//
//                Teacher_Card_View.getLayoutParams().height = convertDpToPx(85, SCREEN_DENSITY);
//                Teacher_Card_View.getLayoutParams().width = convertDpToPx(85, SCREEN_DENSITY);
//
//                String a = "hii";
//                String b= "hello";
//                String c= a+b;


            }
        });


        Student_Card_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Teacher_Card_View.setScaleX(2);
//                Teacher_Card_View.setScaleX(2);

                ViewGroup.LayoutParams teacher = Teacher_Card_View.getLayoutParams();
                ViewGroup.LayoutParams student = Student_Card_View.getLayoutParams();
                ViewGroup.LayoutParams parent = Parent_Card_View.getLayoutParams();


                Teacher_Card_View.setRadius(convertDpToPx(30,SCREEN_DENSITY));
                Student_Card_View.setRadius(convertDpToPx(40,SCREEN_DENSITY));
                Parent_Card_View.setRadius(convertDpToPx(30,SCREEN_DENSITY));




                teacher.height = convertDpToPx(60,SCREEN_DENSITY);
                teacher.width = convertDpToPx(60, SCREEN_DENSITY);
                Teacher_Card_View.setLayoutParams(teacher);

                student.height = convertDpToPx(80,SCREEN_DENSITY);
                student.width = convertDpToPx(80, SCREEN_DENSITY);
                Student_Card_View.setLayoutParams(student);

                parent.height = convertDpToPx(60,SCREEN_DENSITY);
                parent.width = convertDpToPx(60, SCREEN_DENSITY);
                Parent_Card_View.setLayoutParams(parent);




            }
        });




        Parent_Card_View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Teacher_Card_View.setScaleX(2);
//                Teacher_Card_View.setScaleX(2);

                ViewGroup.LayoutParams teacher = Teacher_Card_View.getLayoutParams();
                ViewGroup.LayoutParams student = Student_Card_View.getLayoutParams();
                ViewGroup.LayoutParams parent = Parent_Card_View.getLayoutParams();

                Teacher_Card_View.setRadius(convertDpToPx(30,SCREEN_DENSITY));
                Student_Card_View.setRadius(convertDpToPx(30,SCREEN_DENSITY));
                Parent_Card_View.setRadius(convertDpToPx(40,SCREEN_DENSITY));



                teacher.height = convertDpToPx(60,SCREEN_DENSITY);
                teacher.width = convertDpToPx(60, SCREEN_DENSITY);
                Teacher_Card_View.setLayoutParams(teacher);

                student.height = convertDpToPx(60,SCREEN_DENSITY);
                student.width = convertDpToPx(60, SCREEN_DENSITY);
                Student_Card_View.setLayoutParams(student);

                parent.height = convertDpToPx(80,SCREEN_DENSITY);
                parent.width = convertDpToPx(80, SCREEN_DENSITY);
                Parent_Card_View.setLayoutParams(parent);




            }
        });





    }


    private float getScreenDensityScale(Context context){
        return context.getResources().getDisplayMetrics().density;
    }


    // Using Math.ceil so that any "decimal pixel height" (which is not making sense even when I am writing it
    // is not lost due to truncation to int
    private int convertDpToPx(float dp, final float densityScale){
        return (int) Math.ceil(dp * densityScale + 0.5f);
    }



}
