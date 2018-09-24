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

    int switcherBeetweenSmallTV=0;
    String valuseForSmallTV="";
    int whichOperation;

    TextView resultTV;
    EditText numA;
    EditText numB ;
    TextView historyTV;

    TextView tvNumA;
    TextView tvOperation;
    TextView tvNumB;
    TextView tvEquals;
    TextView tvResultHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTV = findViewById(R.id.resultTV);

        tvNumA=findViewById(R.id.tvNumA);
        tvNumB=findViewById(R.id.tvNumB);
        tvOperation=findViewById(R.id.tvOperation);
        tvEquals=findViewById(R.id.tvEquals);
        tvResultHistory=findViewById(R.id.tvResultHistory);

        Button sumBtn = findViewById(R.id.sumBtn);
        Button subsBtn = findViewById(R.id.subsBtn);
        Button multyplBtn = findViewById(R.id.multyplBtn);
        Button devideBtn = findViewById(R.id.devideBtn);
        Button clearBtn = findViewById(R.id.clearBtn);

        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button b0 = findViewById(R.id.b0);

        Button bEquals = findViewById(R.id.bEquals);

        sumBtn.setOnClickListener(this);
        subsBtn.setOnClickListener(this);
        multyplBtn.setOnClickListener(this);
        devideBtn.setOnClickListener(this);
        clearBtn.setOnClickListener(this);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);

        bEquals.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.sumBtn:
                whichOperation=SUM;
                switcherBeetweenSmallTV=1;
                setSmallTv("+");
                valuseForSmallTV="";
                switcherBeetweenSmallTV=2;
                break;
            case R.id.subsBtn:
                switcherBeetweenSmallTV=1;
                setSmallTv("+");
                valuseForSmallTV="";
                switcherBeetweenSmallTV=2;
                break;
            case R.id.multyplBtn:
                switcherBeetweenSmallTV=1;
                setSmallTv("+");
                valuseForSmallTV="";
                switcherBeetweenSmallTV=2;
                break;
            case R.id.devideBtn:
                switcherBeetweenSmallTV=1;
                setSmallTv("+");
                valuseForSmallTV="";
                switcherBeetweenSmallTV=2;
                break;
            case R.id.clearBtn:
                valuseForSmallTV="";
                switcherBeetweenSmallTV=0;
                numA.setText(null);
                numB.setText(null);
                resultTV.setText(null);
                whichOperation=0;
                break;
            case R.id.b1:
                setSmallTv("1");
                break;
            case R.id.b2:
                setSmallTv("2");
                break;
            case R.id.b3:
                setSmallTv("3");
                break;
            case R.id.b4:
                setSmallTv("4");
                break;
            case R.id.b5:
                setSmallTv("5");
                break;
            case R.id.b6:
                setSmallTv("6");
                break;
            case R.id.b7:
                setSmallTv("7");
                break;
            case R.id.b8:
                setSmallTv("8");
                break;
            case R.id.b9:
                setSmallTv("9");
                break;
            case R.id.b0:
                setSmallTv("0");
                break;
            case R.id.bEquals:
                calculate();
        }
    }


    public void calculate(){
        makeToast("куку");
        Math math = new Math();
        String a=tvNumA.getText().toString();
        String b=tvNumB.getText().toString();
        tvEquals.setText("=");

        switch(whichOperation){
            case 0 :
                resultTV.setText(math.getResult(a,b,whichOperation));
                tvResultHistory.setText(math.getResult(a,b,whichOperation));
                break;
            case 1 :
                break;
            case 2 :
                break;
            case 3 :
                break;
        }
    }

    public void setSmallTv(String buttonVal){
        //0 for num A
        //1 for Operation
        //2 for num B
        //3 for Equals
        //4 for Result

        switch (switcherBeetweenSmallTV){
            case (0):
                tvNumA.setText(valuseForSmallTV);
                valuseForSmallTV=valuseForSmallTV+buttonVal;
                break;
            case (1):
                tvOperation.setText(buttonVal);
                break;
            case (2):
                tvNumB.setText(valuseForSmallTV);
                valuseForSmallTV=valuseForSmallTV+buttonVal;
                break;
            case (3):
                tvEquals.setText("-");
                valuseForSmallTV=valuseForSmallTV+buttonVal;
                break;
            case (4):
                tvResultHistory.setText(buttonVal);
                break;
        }
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

        Button x5 = findViewById(R.id.b1);
        Button x6 = findViewById(R.id.b9);
        Button x7 = findViewById(R.id.b3);
        Button x8 = findViewById(R.id.b0);
        Button x11 = findViewById(R.id.b5);
        Button x12 = findViewById(R.id.b6);

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
        x11.setText("♦");
        x12.setText("¶");


    }




}//class
