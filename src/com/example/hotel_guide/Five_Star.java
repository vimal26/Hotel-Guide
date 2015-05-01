package com.example.hotel_guide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Five_Star extends F_S implements OnClickListener{
	ImageView im1,im2,im3,im4;
	Button b1,b2,b3,b4,b5,b6;
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.five_star); 
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        im1=(ImageView)findViewById(R.id.imageView1);
        im2=(ImageView)findViewById(R.id.imageView2);
        im3=(ImageView)findViewById(R.id.imageView3);
        im4=(ImageView)findViewById(R.id.imageView4);

        b6=(Button)findViewById(R.id.button6);

        b6.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        //b5.setOnClickListener(this);
        b4.setOnClickListener(this);
    }
    public void onClick(View v)
    {

    	switch(v.getId()){
    	case R.id.button6:
    		Intent intent=new Intent(Five_Star.this,F_S.class);
    		startActivity(intent);
    		break;
    	case R.id.button1:
    		Intent inten=new Intent(Five_Star.this,Tajnadesar.class);
    		startActivity(inten);
    		break;
    	case R.id.button2:
    		Intent inte=new Intent(Five_Star.this,Radissonvaranasi.class);
    		startActivity(inte);
    		break;
    	
    	case R.id.button3:
    		intent=new Intent(Five_Star.this,Ramdhavaranasi.class);
    		startActivity(intent);
    		break;
    	case R.id.button4:
    		intent=new Intent(Five_Star.this,Hotelclclarksvaransi.class);
    		startActivity(intent);
    		break;

    	}	
    }

}


