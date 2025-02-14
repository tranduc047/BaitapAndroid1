package com.example.bai1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView canh,ketqua,ketqua1;
    private Button btnTinh,btnWeb;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        canh = findViewById(R.id.canh);
        btnTinh = findViewById(R.id.btnTinh);
        ketqua = findViewById(R.id.ketqua);
        ketqua1 = findViewById(R.id.ketqua1);
        btnWeb = findViewById(R.id.btnWeb);

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TinhToan toan = new TinhToan();
                toan.setCanh(Integer.parseInt(canh.getText().toString()));
                ketqua.setText("Chu vi: "+ toan.tinhChuVi());
                ketqua1.setText("Diện tích: "+ toan.tinhDienTich());
            }
        });
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebActivity.class);
                startActivity(intent);
            }
        });
    }
}