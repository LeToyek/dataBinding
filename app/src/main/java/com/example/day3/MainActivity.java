package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.day3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkboxFrench,checkboxSpanish,checkboxJapanese;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this),null,false);
        setContentView(binding.getRoot());
        binding.setOnChange(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this,"212",Toast.LENGTH_SHORT).show();
                binding.setDurga("DurgaSir");
            }
        });
    }

}