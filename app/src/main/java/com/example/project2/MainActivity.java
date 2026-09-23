package com.example.project2;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        radioButton2=findViewById(R.id.radioButton2);
        radioButton3=findViewById(R.id.radioButton3);
        radioButton5=findViewById(R.id.radioButton5);
    }

    public void showText(View view) {
        String nophone=editText.getText().toString();
        String pilih="";
        if (radioButton2.isChecked()){
            pilih="Telp Rumah";
        } else if (radioButton3.isChecked()) {
            pilih="Mobile";
        } else if (radioButton5.isChecked()) {
            pilih="Telp Kantor";

        }
        Toast.makeText(this, pilih+": " + nophone, Toast.LENGTH_SHORT).show();
    }
}