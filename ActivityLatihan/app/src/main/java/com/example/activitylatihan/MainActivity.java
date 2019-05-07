package com.example.activitylatihan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int stok = 1;
    int harga = 1000;

    Button btnTambah, btnKurang, btnMasukan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTambah = findViewById(R.id.btn_plus);
        btnKurang = findViewById(R.id.btn_minus);
        btnMasukan = findViewById(R.id.tambah_btn);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stok++;
                display();
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stok--;
                display();
            }
        });

        btnMasukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayPrice(harga * stok);
            }
        });
    }

    public void display(){
        TextView tvQty = findViewById(R.id.quantity_text_view);
        tvQty.setText(Integer.toString(stok));
    }

    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.tv_harga);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}
