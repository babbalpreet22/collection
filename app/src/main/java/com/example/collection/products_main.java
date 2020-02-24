package com.example.collection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;


public class products_main extends AppCompatActivity {
    ListView lst;
    String[] productname={"Handbag","Clutch","CrossBody","Hobo", "Messenger", "Bachpack","Doctor", "Envelope"};
    String[] productdescription={"Lightweight in weight","Small in size","Comfortable To carry", "Hard leather", "Thin in shape", "Spacious and long-lasting", "Light in weight", "Very Comfortable"};
    String[] productprice={"Price: $70","Price: $50","Price: $90", "Price: 40", "Price: 60","Price: 120", "Price: 120", "Price: 60"};
    Button proceed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products_main);

        lst=(ListView)findViewById(R.id.listView1);
        customListview customListview=new customListview(this,productname, productdescription, productprice, proceed);
        lst.setAdapter(customListview);
    }
}
