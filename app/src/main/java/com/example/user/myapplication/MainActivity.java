package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity implements OnClickListener{
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
        TextView historyTV=findViewById(R.id.historyTV);
        String a=numA.getText().toString();
        String b=numB.getText().toString();
        String operations=null;
        String equals=" = ";
        String result=null;


        switch(operation){
            case 0 :
                result=getResult(a,b,0);
                resultTV.setText(result);
                operations=" + ";
                break;
            case 1 :
                result=getResult(a,b,1);
                resultTV.setText(result);
                break;
            case 2 :
                result=getResult(a,b,2);
                resultTV.setText(result);
                break;
            case 3 :
                result=getResult(a,b,3);
                resultTV.setText(result);
                break;
        }

        String history=a+operations+b+equals+result;
        historyTV.setText(history);
    }

    public String getResult(String numA, String numB, int operation){

        double a = stringTodouble(numA);
        double b = stringTodouble(numB);

        Math math = new Math();
        String toReturn=null;
        switch(operation){
            case 0 :
                toReturn= String.valueOf(math.sum(a,b));
                break;
            case 1 :
                toReturn= String.valueOf(math.subs(a,b));
                break;
            case 2 :
                toReturn= String.valueOf(math.multyp(a,b));
                break;//
            case 3 :
                toReturn= String.valueOf(math.devide(a,b));
                break;
        }
        return  toReturn;
    }


    public void makeToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    public double stringTodouble(String string){
        Scanner scanner = new Scanner(string);
        return scanner.nextDouble();
    }


}//class
