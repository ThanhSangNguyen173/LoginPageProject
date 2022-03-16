package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class tabhost extends AppCompatActivity {
    TabHost mytab;
    Button dk2,dk3;
    EditText edtdk2,edtdk3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabhost_page);
        addtabhost();
        anhxa();

        dk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strdk2 = edtdk2.getText().toString().trim();
                if (strdk2.isEmpty()){
                    Toast.makeText(tabhost.this, "Vui lòng điền email của bạn!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(tabhost.this, "Đăng ký thành công!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        dk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strdk3 = edtdk3.getText().toString().trim();
                if (strdk3.isEmpty()){
                    Toast.makeText(tabhost.this, "Vui lòng điền email của bạn!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(tabhost.this, "Đăng ký thành công!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void anhxa() {
        dk2 = findViewById(R.id.dk2);
        dk3 = findViewById(R.id.dk3);
        edtdk2 = findViewById(R.id.edtdk2);
        edtdk3 = findViewById(R.id.edtdk3);
    }

    private void addtabhost() {
        mytab = findViewById(R.id.mytab);
        mytab.setup();
        TabHost.TabSpec spec1,spec2,spec3;

        spec1 = mytab.newTabSpec("t1");
        spec1.setContent(R.id.tab1);
        spec1.setIndicator("",getResources().getDrawable(R.drawable.boxyz));
        mytab.addTab(spec1);

        spec2 = mytab.newTabSpec("t2");
        spec2.setContent(R.id.tab2);
        spec2.setIndicator("",getResources().getDrawable(R.drawable.ios2));
        mytab.addTab(spec2);

        spec3 = mytab.newTabSpec("t3");
        spec3.setContent(R.id.tab3);
        spec3.setIndicator("",getResources().getDrawable(R.drawable.android));
        mytab.addTab(spec3);
    }
}