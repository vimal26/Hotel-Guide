package com.example.hotel_guide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Threee_Star extends F_S implements OnClickListener{
	Button b1,b2,b3,b4,b5,b6;
	ImageView im1,im2,im3,im4,im5;
	Intent intent;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_star);  
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        im1=(ImageView)findViewById(R.id.imageView1);
        im2=(ImageView)findViewById(R.id.imageView2);
        im3=(ImageView)findViewById(R.id.imageView3);
        im4=(ImageView)findViewById(R.id.imageView4);
        im5=(ImageView)findViewById(R.id.imageView5);

        b6.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b5.setOnClickListener(this);
        b4.setOnClickListener(this);
    }
    public void onClick(View v)
    {

    	switch(v.getId()){
    	case R.id.button6:
    		setContentView(R.layout.city1);
    		break;
    	case R.id.button1:
    		
    		setContentView(R.layout.hotelidealvaranasi);
    		break;
    	case R.id.button2:
    		setContentView(R.layout.hotelcresentvaranasi);
    		break;
    	case R.id.button3:
    		setContentView(R.layout.heritagevaranasi);
    		break;
    	case R.id.button4:
    		setContentView(R.layout.hotelcityvaranasi);
    		break;
    	case R.id.button5:
    		setContentView(R.layout.hotelindiavaranasi);
    		break;

    	}	
    }

}
