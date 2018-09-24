package com.example.user.myapplication;

import android.bluetooth.BluetoothClass;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    public static final int SUM = 0;
    public static final int SUBSTRACT = 1;
    public static final int MULTIPLY = 2;
    public static final int DEVIDE = 3;

    TextView resultTV;
    EditText numA;
    EditText numB ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numA = findViewById(R.id.numA);
        numB = findViewById(R.id.numB);
        resultTV = findViewById(R.id.resultTV);
        numA.setText("0");
        numB.setText("0");

        Button sumBtn = findViewById(R.id.sumBtn);
        Button subsBtn = findViewById(R.id.subsBtn);
        Button multyplBtn = findViewById(R.id.multyplBtn);
        Button devideBtn = findViewById(R.id.devideBtn);
        Button clearBtn = findViewById(R.id.clearBtn);

        sumBtn.setOnClickListener(this);
        subsBtn.setOnClickListener(this);
        multyplBtn.setOnClickListener(this);
        devideBtn.setOnClickListener(this);
        clearBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.sumBtn:
                setResultTV(0);
                break;
            case R.id.subsBtn:
                setResultTV(1);
                break;
            case R.id.multyplBtn:
                setResultTV(2);
                break;
            case R.id.devideBtn:
                setResultTV(3);
                break;
            case R.id.clearBtn:
                numA.setText(null);
                numB.setText(null);
                resultTV.setText(null);
                break;
        }
    }


    public void setResultTV(int operation){
        Math math = new Math();
        TextView historyTV=findViewById(R.id.historyTV);
        String a=numA.getText().toString();
        String b=numB.getText().toString();
        String operations=null;
        String equals=" = ";
        String result=null;

        switch(operation){
            case 0 :
                result=math.getResult(a,b,SUM);
                resultTV.setText(result);
                operations=" + ";
                break;
            case 1 :
                result=math.getResult(a,b,SUBSTRACT);
                resultTV.setText(result);
                break;
            case 2 :
                result=math.getResult(a,b,MULTIPLY);
                resultTV.setText(result);
                break;
            case 3 :
                result=math.getResult(a,b,DEVIDE);
                resultTV.setText(result);
                break;
        }

        String history=a+operations+b+equals+result;
        historyTV.setText(history);
    }




    public void makeToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }




}//class
