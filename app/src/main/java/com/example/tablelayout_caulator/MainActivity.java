    package com.example.tablelayout_caulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

    public class MainActivity extends AppCompatActivity {

        EditText edit1, edit2;
        Button btnNum0,btnNum1, btnNum2, btnNum3, btnNum4, btnNum5,btnNum6,btnNum7,btnNum8,btnNum9;
        Button btnAdd,btnMinus,btnStar,btnDivid;
        EditText tResult;

        String num1, num2;
        Integer result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1=(EditText)findViewById(R.id.Edit1);
        edit2=(EditText)findViewById(R.id.Edit2);
        btnNum1=(Button)findViewById(R.id.BtnNum1);
        btnNum2=(Button)findViewById(R.id.BtnNum2);
        btnNum3=(Button)findViewById(R.id.BtnNum3);
        btnNum4=(Button)findViewById(R.id.BtnNum4);
        btnNum5=(Button)findViewById(R.id.BtnNum5);
        btnNum6=(Button)findViewById(R.id.BtnNum6);
        btnNum7=(Button)findViewById(R.id.BtnNum7);
        btnNum8=(Button)findViewById(R.id.BtnNum8);
        btnNum9=(Button)findViewById(R.id.BtnNum9);
        btnNum0=(Button)findViewById(R.id.BtnNum0);
        btnAdd=(Button)findViewById(R.id.BtnAdd);
        btnMinus=(Button)findViewById(R.id.BtnMinus);
        btnStar=(Button)findViewById(R.id.BtnStar);
        btnDivid=(Button)findViewById(R.id.BtnDivid);
        tResult=(EditText)findViewById(R.id.TResult);

        setTitle("테이블레이아웃 계산기");

        btnAdd.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1){
                num1 = edit1.getText().toString();
                num2=edit2.getText().toString();

                result=Integer.parseInt(num1)+Integer.parseInt(num2);

                tResult.setText("계산 결과: " + result.toString());
                return false;
            }
        });

        btnMinus.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1){
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                result=Integer.parseInt(num1)+Integer.parseInt(num2);
                tResult.setText("계산 결과: " + result.toString());
                return false;
            }
        });

        btnStar.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1){
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                result=Integer.parseInt(num1)+Integer.parseInt(num2);
                tResult.setText("계산 결과: "+ result.toString());
                return false;
            }
        });

        btnDivid.setOnTouchListener(new View.OnTouchListener(){
            public boolean onTouch(View arg0, MotionEvent arg1){
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                result=Integer.parseInt(num1)+Integer.parseInt(num2);
                tResult.setText("계산 결과: " + result.toString());
                return false;
            }
        });
    }
}