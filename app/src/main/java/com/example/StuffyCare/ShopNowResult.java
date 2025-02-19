package com.example.StuffyCare;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import com.example.StuffyCare.Dialog.CustomDialogClassAccessories;
import com.example.StuffyCare.Dialog.CustomDialogClassFood;
import com.example.StuffyCare.Dialog.CustomDialogClassGrooming;
import com.example.StuffyCare.Dialog.CustomDialogClassPet;
import com.example.StuffyCare.adapter.RecyclerViewAdapterResult;
import com.example.StuffyCare.items.Products;

public class ShopNowResult extends AppCompatActivity {

    private TextView mTextView;
    private ArrayList<Products> ProductsList;
    private RecyclerView productRecyclerView;
    private RecyclerViewAdapterResult mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_now_result);

        //SearchView Implementation
        ImageButton search = findViewById(R.id.searchViewResult);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShopNowResult.this, SearchView.class);
                startActivity(intent);
            }
        });


        ImageButton cart = findViewById(R.id.cart_result);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShopNowResult.this, Cart.class);
                startActivity(intent);
            }
        });


        ProductsList = new ArrayList<>();
        for (int i = 24; i < 34; i++) {
            Products products = new Products();
            products.setName("Dog healthy food , large, " + i + "Inch");
            if (i % 2 == 0)
                products.setImage(R.drawable.dog_food);
            else if (i % 3 == 0)
                products.setImage(R.drawable.dog_food2);
            else
                products.setImage(R.drawable.dog_food3);
            ProductsList.add(products);
        }
        buildRecyclerView();
        initiateFilters();

    }


    public void buildRecyclerView() {
        productRecyclerView = findViewById(R.id.recyclerView_shop_now_result);
        productRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mAdapter = new RecyclerViewAdapterResult(ProductsList);
        productRecyclerView.setLayoutManager(mLayoutManager);
        productRecyclerView.setAdapter(mAdapter);

    }


    public void initiateFilters() {
        Button button_pet = findViewById(R.id.button_pet);
        Button button_food = findViewById(R.id.button_food);
        Button button_accessories = findViewById(R.id.button_accessories);
        Button button_grooming = findViewById(R.id.button_grooming);

        button_pet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialogClassPet cdd = new CustomDialogClassPet(ShopNowResult.this);
                cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cdd.show();
            }
        });

        button_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialogClassFood cdd = new CustomDialogClassFood(ShopNowResult.this);
                cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cdd.show();
            }
        });
        button_accessories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialogClassAccessories cdd = new CustomDialogClassAccessories(ShopNowResult.this);
                cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cdd.show();
            }
        });
        button_grooming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialogClassGrooming cdd = new CustomDialogClassGrooming(ShopNowResult.this);
                cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cdd.show();
            }
        });
    }


}
