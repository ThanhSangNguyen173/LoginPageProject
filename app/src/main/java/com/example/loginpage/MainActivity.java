package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt1, bt2;
    EditText tk, mk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.login);
        bt2 = findViewById(R.id.dky);
        tk = findViewById(R.id.tk);
        mk = findViewById(R.id.mk);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = tk.getText().toString().trim();
                String str2 = mk.getText().toString().trim();
                if (str1.isEmpty() || str2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent2 = new Intent(MainActivity.this, viewflipper.class);
                    startActivity(intent2);
                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DkyPage.class);
                startActivity(intent);
            }
        });
    }
}
