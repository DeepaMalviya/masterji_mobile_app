package com.example.dummyapplication.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.dummyapplication.R;

public class ProductDetailsActivity extends AppCompatActivity {
    LinearLayout linearBottom, linearSub;
    ImageView imageDownArrow, mainImage, imageOne, imageTwo, imageThree, imageFour;
    CardView card_view;
    int i = 0;
    RadioButton radio;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        mainImage = findViewById(R.id.mainImage);
        radio = findViewById(R.id.radio);
        int selectedId = radioGroup.getCheckedRadioButtonId();
        radio = (RadioButton) findViewById(selectedId);
        if(selectedId==-1){
           // Toast.makeText(ProductDetailsActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show();
        }
        else{

            //Toast.makeText(ProductDetailsActivity.this,radio.getText(), Toast.LENGTH_SHORT).show();
        }
        imageOne = findViewById(R.id.imageOne);
        imageTwo = findViewById(R.id.imageTwo);
        imageThree = findViewById(R.id.imageThree);
        imageFour = findViewById(R.id.imageFour);
        imageThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainImage.setImageResource(R.drawable.jodhpuri);
            }
        });
        imageFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainImage.setImageResource(R.drawable.men_kurta);
            }
        });
        imageTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainImage.setImageResource(R.drawable.men_blazor);
            }
        });
        imageOne.setImageResource(R.drawable.men_plainsherwani);
        imageTwo.setImageResource(R.drawable.men_blazor);
        imageFour.setImageResource(R.drawable.men_kurta);
        imageThree.setImageResource(R.drawable.jodhpuri);

        imageOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainImage.setImageResource(R.drawable.men_plainsherwani);
            }
        });
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
