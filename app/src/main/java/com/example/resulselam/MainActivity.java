package com.example.resulselam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;


import com.example.resulselam.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
 private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view =binding.getRoot();
        binding.txtMessage.setText("Hoşgeldin Kullanıcı");
        setContentView(view);

        binding.btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isim =binding.editad.getText().toString();
                binding.txtMessage.setText("Hoşgeldin "+isim);
            }
        });
    }
}