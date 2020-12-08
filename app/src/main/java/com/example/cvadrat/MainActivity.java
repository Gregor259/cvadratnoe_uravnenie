package com.example.cvadrat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textt, textt2;
    Button sum;
    EditText ed1, ed2, ed3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum = findViewById(R.id.button);
        textt = findViewById(R.id.textView);

        ed1 = findViewById(R.id.editText);
        ed2 = findViewById(R.id.editText2);
        ed3 = findViewById(R.id.editTextText3);
        sum.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        String t1 = ed1.getText().toString();
        String t2 = ed2.getText().toString();
        String t3 = ed3.getText().toString();
        double a = Double.parseDouble(t1);
        double b = Double.parseDouble(t2);
        double c = Double.parseDouble(t3);
        if (a == 0){
            textt.setText("error");
        }
        double D = b*b - 4*a*c;
        if (D < 0){
            textt.setText("error");
        }
        double x1 = ((-b+Math.sqrt(D))/(2*a));
        double x2 = ((-b-Math.sqrt(D))/(2*a));
        if (D == 0){
            textt.setText(String.valueOf(x1));
        }
        else if (D > 0){
            textt.setText(String.format("%.2f %.2f",x1, x2));
        }
    }
}
