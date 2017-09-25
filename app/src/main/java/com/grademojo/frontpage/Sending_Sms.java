package com.grademojo.frontpage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sending_Sms extends Activity {

    EditText mobile_no,message;
    Button send_sms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sendind__sms);




        mobile_no =(EditText)findViewById(R.id.editText1);
        message=(EditText)findViewById(R.id.editText2);
        send_sms =(Button)findViewById(R.id.button1);

        //Performing action on button click
        send_sms.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {



                String no = mobile_no.getText().toString();
                String msg= message.getText().toString();


                //Getting intent and PendingIntent instance
                Intent intent=new Intent(getApplicationContext(),Sending_Sms.class);
                PendingIntent pi=PendingIntent.getActivity(getApplicationContext(), 0, intent,0);




                //Get the SmsManager instance and call the sendTextMessage method to send message
                SmsManager sms=SmsManager.getDefault();
                sms.sendTextMessage(no, null, msg, pi,null);



                Toast.makeText(getApplicationContext(), "Message Sent successfully!",
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_sendind__sms, menu);
        return true;
    }

}