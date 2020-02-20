package edu.miracosta.cs134.inandout;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;
import java.util.Locale;

import edu.miracosta.cs134.inandout.model.Order;

public class SummaryActivity extends AppCompatActivity {
    private Order myOrder;
    private TextView orderTotalTextView;
    private TextView itemsOrderTextView;
    private TextView subtotalTextView;
    private TextView taxTextView;
    private NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.getDefault());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        myOrder = new Order();
        Intent intent = getIntent();
        int doubledouble = intent.getIntExtra("DoubleDouble", 0);
        int cheeseBurger = intent.getIntExtra("CheeseBurger", 0);
        int frenchFries = intent.getIntExtra("FrenchFries", 0);
        int shake = intent.getIntExtra("Shake", 0);
        int small = intent.getIntExtra("Small", 0);
        int medium = intent.getIntExtra("Medium", 0);
        int large =intent.getIntExtra("Large", 0);


        myOrder.setCheeseburger(cheeseBurger);
        myOrder.setDOubleDouble(doubledouble);
        myOrder.setFrenchFries(frenchFries);
        myOrder.setShakes(shake);
        myOrder.setSmallDrinks(small);
        myOrder.setMediumDrinks(medium);
        myOrder.setLargeDrinks(large);

orderTotalTextView = findViewById(R.id.orderTotalTextView);
orderTotalTextView.setText(currency.format(myOrder.calculateTotal()));
itemsOrderTextView = findViewById((R.id.itemsOrderTextView));
itemsOrderTextView.setText(myOrder.getNumberItemsOrdered()+"");
subtotalTextView = findViewById(R.id.subtotalTextView);
subtotalTextView.setText(currency.format(myOrder.calculateSubtotal()));
taxTextView = findViewById(R.id.taxTextView);
taxTextView.setText(currency.format(myOrder.calculateTax()));




    }
    public void returnToOrder(View v){
        //Done with SummaryActivity, so "finish" it
        finish();
    }


}
