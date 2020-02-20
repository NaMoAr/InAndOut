package edu.miracosta.cs134.inandout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class OrderActivity extends AppCompatActivity {

    private EditText DoubleDoubleEditText;
    private EditText cheeseBurgerEditText;
    private EditText frenchFriesEditText;
    private EditText shakesEditText;
    private EditText smallEditText;
    private EditText mediumEditText;
    private EditText largeEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
DoubleDoubleEditText = findViewById(R.id.DoubleDoubleEditText);
cheeseBurgerEditText = findViewById(R.id.cheeseBurgerEditText);
frenchFriesEditText = findViewById(R.id.frenchFriesEditText);
shakesEditText = findViewById(R.id.shakesEditText);
smallEditText = findViewById(R.id.smallEditText);
mediumEditText = findViewById(R.id.mediumEditText);
largeEditText = findViewById(R.id.largeEditText);

    }

    public void generateReceipt(View v) {
        int doubledouble;
        int cheeseBurger;
        int frenchFries;
        int shake;
        int small;
        int medium;
        int large;

        if (DoubleDoubleEditText.getText().toString().matches(""))
    doubledouble = 0;
        else
    doubledouble = Integer.parseInt(DoubleDoubleEditText.getText().toString());
        if(cheeseBurgerEditText.getText().toString().matches(""))
            cheeseBurger = 0;
        else
            cheeseBurger = Integer.parseInt(cheeseBurgerEditText.getText().toString());
        if(frenchFriesEditText.getText().toString().matches(""))
            frenchFries = 0;
        else
            frenchFries = Integer.parseInt(frenchFriesEditText.getText().toString());
        if(shakesEditText.getText().toString().matches(""))
            shake = 0;
        else
            shake = Integer.parseInt(shakesEditText.getText().toString());
        if(smallEditText.getText().toString().matches(""))
            small = 0 ;
        else
            small = Integer.parseInt(smallEditText.getText().toString());
        if(mediumEditText.getText().toString().matches(""))
            medium = 0 ;
        else
            medium = Integer.parseInt(mediumEditText.getText().toString());
        if(largeEditText.getText().toString().matches(""))
            large = 0 ;
        else
            large = Integer.parseInt(largeEditText.getText().toString());



        Intent intent= new Intent(this, SummaryActivity.class);
        intent.putExtra("DoubleDouble", doubledouble);
        intent.putExtra("CheeseBurger", cheeseBurger);
        intent.putExtra("FrenchFries", frenchFries);
        intent.putExtra("Shake", shake);
        intent.putExtra("Small", small);
        intent.putExtra("Medium", medium);
        intent.putExtra("Large", large);

        startActivity(intent);

    }



}
