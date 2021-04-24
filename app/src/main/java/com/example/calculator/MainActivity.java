package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnKali, btnTambah, btnBagi, btnKurang, btnReset;

    EditText angka1, angka2;
    TextView txtHasil;
    double angka_1, angka_2;
    double hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKali = (Button) findViewById(R.id.kali);
        btnBagi = (Button) findViewById(R.id.bagi);
        btnTambah = (Button) findViewById(R.id.tambah);
        btnKurang = (Button) findViewById(R.id.kurang);
        btnReset = (Button) findViewById(R.id.bersihkan);

        angka1 = (EditText) findViewById(R.id.input1);
        angka2 = (EditText) findViewById(R.id.input2);

        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_1 = Double.parseDouble(angka1.getText().toString());
                angka_2 = Double.parseDouble(angka2.getText().toString());

                hasil = angka_1*angka_2;
                txtHasil.setText(Double.toString(hasil));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_1 = Double.parseDouble(angka1.getText().toString());
                angka_2 = Double.parseDouble(angka2.getText().toString());

                hasil = angka_1/angka_2;
                txtHasil.setText(Double.toString(hasil));
            }
        });

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_1 = Double.parseDouble(angka1.getText().toString());
                angka_2 = Double.parseDouble(angka2.getText().toString());

                 hasil = angka_1+angka_2;
                txtHasil.setText(Double.toString(hasil));
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_1 = Double.parseDouble(angka1.getText().toString());
                angka_2 = Double.parseDouble(angka2.getText().toString());

                hasil = angka_1-angka_2;
                txtHasil.setText(Double.toString(hasil));
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka1.setText("");
                angka2.setText("");
                txtHasil.setText("0");
                angka1.requestFocus();
            }
        });

    }
}
