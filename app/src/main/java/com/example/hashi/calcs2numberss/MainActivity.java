package com.example.hashi.calcs2numberss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNumber1, etNumber2;
    private Button btnPlus, btnMinus, btnMultiply, btnDivide;
    private TextView tvName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1 = findViewById(R.id.etNumber1);
        etNumber2 = findViewById(R.id.etNumber2);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);

        int numb1 = Integer.parseInt(etNumber1.getText().toString());
        int numb2 = Integer.parseInt(etNumber2.getText().toString());

        btnPlus.setOnClickListener(view -> {
            tvName.setText(String.valueOf(numb1 + numb2));
        });

        btnMinus.setOnClickListener(view -> {
            tvName.setText(String.valueOf(numb1 - numb2));
        });

        btnMultiply.setOnClickListener(view -> {
            tvName.setText(String.valueOf(numb1 * numb2));
        });

        btnDivide.setOnClickListener(view -> {

            tvName.setText(numb1 / numb2);

        });



    }
}
