package com.example.ahmed.frag3_example;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ahmed on 11/01/17.
 */

public class Fragment2 extends Fragment {

    Button b1;
    EditText e1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment1_layout, container, false);

        b1= (Button) view.findViewById(R.id.button);
        e1= (EditText)view.findViewById(R.id.editText3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String number = e1.getText().toString();

                Intent intent =new Intent(Intent.ACTION_VIEW) ;

                intent.setData(Uri.parse("tel:" + number)) ;

                startActivity(intent);
            }
        });

        return view;


    }
}
