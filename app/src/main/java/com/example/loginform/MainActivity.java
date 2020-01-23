package com.example.loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText _pkname_, _Add_, _CarCar_, _Rent_, _opentime_, _closetime_, _mobile_;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _pkname_ = (EditText)findViewById(R.id.pknameid);
        _Add_ = (EditText)findViewById(R.id.addid);
        _CarCar_ = (EditText)findViewById(R.id.capid);
        _Rent_ = (EditText)findViewById(R.id.rentid);
        _opentime_ = (EditText)findViewById(R.id.otimeid);
        _closetime_ = (EditText)findViewById(R.id.ctimeid);
        _mobile_ = (EditText)findViewById(R.id.mobileid);
    }
}
