package com.example.mysecapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.btna);
        b2=(Button) findViewById(R.id.btns);
        b3=(Button) findViewById(R.id.btnm);
        b4=(Button) findViewById(R.id.btnd);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                add();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                sub();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                mul();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                div();

            }
        });
    }
    public void add(){
        EditText e,a,err;
        e= (EditText) findViewById(R.id.editView);
        a= (EditText) findViewById(R.id.editView2);
        err=(EditText) findViewById(R.id.editView3);
       int c=Integer.parseInt(e.getText().toString());
        int b=Integer.parseInt(a.getText().toString());
        int result =c+b;
        err.setText("total value "+ result);
    }
    public void sub(){
        EditText e,a,err;
        e= (EditText) findViewById(R.id.editView);
        a= (EditText) findViewById(R.id.editView2);
        err=(EditText) findViewById(R.id.editView3);
        int c=Integer.parseInt(e.getText().toString());
        int b=Integer.parseInt(a.getText().toString());
        int result =c-b;
        err.setText("total value "+ result);
    }
    public void mul(){
        EditText e,a,err;
        e= (EditText) findViewById(R.id.editView);
        a= (EditText) findViewById(R.id.editView2);
        err=(EditText) findViewById(R.id.editView3);
        int c=Integer.parseInt(e.getText().toString());
        int b=Integer.parseInt(a.getText().toString());
        int result =c*b;
        err.setText("total value "+ result);
    }
    public void div(){
        EditText e,a,err;
        e= (EditText) findViewById(R.id.editView);
        a= (EditText) findViewById(R.id.editView2);
        err=(EditText) findViewById(R.id.editView3);
        int c=Integer.parseInt(e.getText().toString());
        int b=Integer.parseInt(a.getText().toString());
        int result =c/b;
        err.setText("total value "+ result);
    }

}