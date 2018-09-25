package com.example.user.myapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements OnClickListener{
    public static final int SUM = 0;
    public static final int SUBSTRACT = 1;
    public static final int MULTIPLY = 2;
    public static final int DEVIDE = 3;

    int switcher=0;
    int opetation=0;

    TextView resultTV;
    TextView tvNumA;
    TextView tvOperation;
    TextView tvNumB;
    TextView tvEquals;
    TextView tvResultHistory;
    TextView historyTV;
    Math math;

    BlankFragment fragment;
    FragmentTransaction transaction; //see fManagement method for way of boject initialisation
    FragmentManager fManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        fManager=getSupportFragmentManager();
        fragment = new BlankFragment();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTV = findViewById(R.id.resultTV);
        historyTV = findViewById(R.id.historyTV);

        math=new Math();

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
            //                          assigment operations buttons
            case R.id.sumBtn:
                bOperations(SUM);
                break;
            case R.id.subsBtn:
                bOperations(SUBSTRACT);
                break;
            case R.id.multyplBtn:
                bOperations(MULTIPLY);
                break;
            case R.id.devideBtn:
                bOperations(DEVIDE);
                break;
            //                             assigment digital buttons
            case R.id.b1:
                bDigitals(1);
                break;
            case R.id.b2:
                bDigitals(2);
                break;
            case R.id.b3:
                bDigitals(3);
                break;
            case R.id.b4:
                bDigitals(4);
                break;
            case R.id.b5:
                bDigitals(5);
                break;
            case R.id.b6:
                bDigitals(6);
                break;
            case R.id.b7:
                bDigitals(7);
                break;
            case R.id.b8:
                bDigitals(8);
                break;
            case R.id.b9:
                bDigitals(9);
                break;
            case R.id.b0:
                bDigitals(0);
                break;
            //                                asiggment: other buttons
            case R.id.bEquals:
                bEquals();
            case R.id.clearBtn:
                clear();
                break;
        }
    }

    public void clear (){
        switcher=0;
        tvOperation.setText(null);
        tvNumA.setText(null);
        tvNumB.setText(null);
        opetation=0;
        tvResultHistory.setText(null);
        historyTV.setText(null);
    }

    public void bOperations(int operation){
        switcher=1;
        switch (operation){
            case(SUM):
                historyTV.append("+");
                opetation=SUM;
                break;
            case(SUBSTRACT):
                historyTV.append("-");
                opetation=SUBSTRACT;
                break;
            case(MULTIPLY):
                historyTV.append("*");
                opetation=MULTIPLY;
                break;
            case(DEVIDE):
                historyTV.append("/");
                opetation=DEVIDE;
                break;
        }
    }

    public void bDigitals(int buttonValue){
        //numA=0
        //nuB=1
        //operations=2
        //TODO empty fields checking

        switch (switcher){
            case (0):
                tvNumA.append(String.valueOf(buttonValue));
                historyTV.append(String.valueOf(buttonValue));
                break;
            case(1):
                tvNumB.append(String.valueOf(buttonValue));
                historyTV.append(String.valueOf(buttonValue));
                break;
        }
    }

    public void bEquals(){
        fManagement();
        try{
            String a=tvNumA.getText().toString();
            String b=tvNumB.getText().toString();
            if((a.equals("0301")&b.equals("1994"))||(a.equals("0701")&b.equals("1992"))){
                olololol();
            }
            else{
                resultTV.setText(math.getResult(a,b,opetation));
            }
        }
        catch(Exception e){
            makeToast("fill all the fields!");
        }


    }

    public void fManagement(){
        transaction=fManager.beginTransaction();
        transaction.replace(R.id.fragmentLayout, fragment);
        transaction.commit();
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
