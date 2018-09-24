package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    TextView resultTV;
    EditText numA;
    EditText numB ;
    Spinner operationsSpinner ;
    int selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operationsSpinner = findViewById(R.id.operationsSpinner);

        numA = findViewById(R.id.numA);
        numB = findViewById(R.id.numB);
        resultTV = findViewById(R.id.resultTV);

        numA.setText("0");
        numB.setText("0");

        // Create an ArrayAdapter using the string array and a default spinner layout (Pay attention to the the stationsName array in the Strings which contains spinner items. You can find its code below)
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.OperationsSpinnerStrings, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        operationsSpinner.setAdapter(adapter);
        selected = operationsSpinner.getSelectedItemPosition();

        operationsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                selected=position;
                setResultTV (selected);
            } // to close the onItemSelected


            public void onNothingSelected(AdapterView<?> parent)
            {
            }
        });
    }
    public void onClear (View view){
        numA.setText(null);
        numB.setText(null);
        resultTV.setText(null);
    }


    public void setResultTV(int position){


        double a = stringTodouble(numA.getText().toString());
        double b = stringTodouble(numB.getText().toString());

        Math math = new Math();

        switch(position){
            case 0 :
                resultTV.setText(null);
                resultTV.setText(String.valueOf(math.sum(a,b)));
                break;
            case 1 :
                resultTV.setText(null);
                resultTV.setText(String.valueOf(math.subs(a,b)));
                break;
            case 2 :
                resultTV.setText(null);
                resultTV.setText(String.valueOf(math.multyp(a,b)));
                break;
            case 3 :
                resultTV.setText(null);
                resultTV.setText(String.valueOf(math.devide(a,b)));
                break;
        }
    }

    public void makeToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    public double stringTodouble(String string){
        Scanner scanner = new Scanner(string);
        return scanner.nextDouble();
    }
}//class
