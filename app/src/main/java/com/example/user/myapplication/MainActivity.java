package com.example.user.myapplication;

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
    TextView historyTV;

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
        historyTV=findViewById(R.id.historyTV);
        String a=numA.getText().toString();
        String b=numB.getText().toString();
        String operations=null;
        String equals=" = ";
        String result=null;

        switch(operation){
            case 0 :
                result=math.getResult(a,b,SUM);
                if(result.equals("olololol")){
                    olololol();
                }
                else{
                    resultTV.setText(result);
                }
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

    public void olololol(){
        TextView tv1 = findViewById(R.id.resultTV);
        Button x1 = findViewById(R.id.sumBtn);
        Button x2 = findViewById(R.id.clearBtn);
        Button x3 = findViewById(R.id.devideBtn);
        Button x4 = findViewById(R.id.multyplBtn);

        Button x5 = findViewById(R.id.button9);
        Button x6 = findViewById(R.id.button7);
        Button x7 = findViewById(R.id.button6);
        Button x8 = findViewById(R.id.button10);
        Button x9 = findViewById(R.id.button11);
        Button x10 = findViewById(R.id.button11);
        Button x11 = findViewById(R.id.button17);
        Button x12 = findViewById(R.id.button15);

        tv1.setText("☺\uD83C\uDF83  \uD835\uDD3Bａή\uD835\uDCD2ε ยｐ, ƒᵃ\uD835\uDCFBÃ\uD835\uDC1D\uD835\uDCD4\uD835\uDCDDŽα\n" +
                "ｌＡ ρỖ\uD835\uDCECα ᵈє \uD835\uDC0B\uD835\uDCD0 ℂσ\uD835\uDCB8\uD835\uDCD0  \uD83D\uDC2F♬");

        historyTV=findViewById(R.id.historyTV);
        historyTV.setText("(っ◔◡◔)っ ♥ Dance Faradenza");

        x1.setText("♀");
        x2.setText("☼");
        x3.setText("‼");
        x4.setText("◄");

        x5.setText("♂");
        x6.setText("▬");
        x7.setText("♫");
        x8.setText("J");
        x9.setText("☻");
        x10.setText("☺");
        x11.setText("♦");
        x12.setText("¶");


    }




}//class
