package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText angka_pertama,angka_kedua,hasil;
    private Button tambah,kurang,kali,bagi;
    private int a,b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        angka_pertama = (EditText) findViewById(R.id.angka_pertama);
        angka_kedua = (EditText) findViewById(R.id.angka_kedua);
        hasil = (EditText) findViewById(R.id.hasil);

        tambah = (Button) findViewById(R.id.tambah);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.valueOf(angka_pertama.getText().toString());
                b = Integer.valueOf(angka_kedua.getText().toString());

                hasil.setText(fungtion_tambah(a,b));

            }

        });
        kurang = (Button) findViewById(R.id.kurang);
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.valueOf(angka_pertama.getText().toString());
                b = Integer.valueOf(angka_kedua.getText().toString());

                hasil.setText(fungtion_kurang(a,b));
            }

        });
        kali = (Button) findViewById(R.id.kali);
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.valueOf(angka_pertama.getText().toString());
                b = Integer.valueOf(angka_kedua.getText().toString());

                hasil.setText(fungtion_kali(a,b));


            }
        });
        bagi = (Button) findViewById(R.id.bagi);
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.valueOf(angka_pertama.getText().toString());
                b = Integer.valueOf(angka_kedua.getText().toString());

                hasil.setText(fungtion_bagi(a,b));
            }
        });

    }

    String fungtion_tambah(int angka1, int angka2) {
        int hasil_kalkulasi = angka1 + angka2;
        return String.valueOf(hasil_kalkulasi);
    }
    String fungtion_kurang(int angka1, int angka2) {
        int hasil_kalkulasi = angka1 - angka2;
        return String.valueOf(hasil_kalkulasi);
    }
    String fungtion_kali(int angka1, int angka2) {
        int hasil_kalkulasi = angka1 * angka2;
        return String.valueOf(hasil_kalkulasi);
    }
    String fungtion_bagi(int angka1, int angka2) {
        int hasil_kalkulasi = angka1 / angka2;
        return String.valueOf(hasil_kalkulasi);
    }


}
