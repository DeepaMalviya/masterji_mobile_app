package com.example.dummyapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.dummyapplication.R;

public class ProductDetailsActivity extends AppCompatActivity {
    LinearLayout linearBottom, linearSub;
    ImageView imageDownArrow;
    CardView card_view;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        imageDownArrow = findViewById(R.id.imageDownArrow);
        linearBottom = findViewById(R.id.linearBottom);
        linearSub = findViewById(R.id.linearSub);
        card_view = findViewById(R.id.card_view);
        linearBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 1) {
                    linearSub.setVisibility(View.VISIBLE);
                    card_view.setVisibility(View.VISIBLE);
                    imageDownArrow.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
                    i = 0;
                } else {
                    card_view.setVisibility(View.GONE);
                    linearSub.setVisibility(View.GONE);
                    imageDownArrow.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
                    i = 1;
                }
            }
        });
    }
}
