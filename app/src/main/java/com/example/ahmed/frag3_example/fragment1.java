package com.example.ahmed.frag3_example;

import android.app.Fragment;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ahmed on 11/01/17.
 */

public class fragment1 extends Fragment {

    Button b1;
    EditText e1;
    EditText e2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment1_layout, container, false);

        b1= (Button) view.findViewById(R.id.button);
        e1= (EditText)view.findViewById(R.id.editText);
        e2= (EditText)view.findViewById(R.id.editText2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = e1.getText().toString();
                String message = e2.getText().toString();

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(number,null ,message, null ,null);
            }
        });

        return view;


    }
}
