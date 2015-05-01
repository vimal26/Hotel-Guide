package com.example.hotel_guide;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Four7 extends City7 implements OnClickListener{
	ImageView im1,im2,im3,im4,im5;
	Button b;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four7); 
        im1=(ImageView)findViewById(R.id.imageView1);
        im2=(ImageView)findViewById(R.id.imageView2);
        im3=(ImageView)findViewById(R.id.imageView3);
        im4=(ImageView)findViewById(R.id.imageView4);
        im5=(ImageView)findViewById(R.id.imageView5);
        b=(Button)findViewById(R.id.button1);
        
        im1.setOnClickListener(this);
        im2.setOnClickListener(this);
        im3.setOnClickListener(this);
        im4.setOnClickListener(this);
        im5.setOnClickListener(this);
        b.setOnClickListener(this);
    }
    public void onClick(View v)
    {

    	switch(v.getId()){
    	case R.id.button1:
    		setContentView(R.layout.city7);
    		break;
    	case R.id.imageView1:
    		setContentView(R.layout.katriyahotel);
    		break;
    	case R.id.imageView2:
    		setContentView(R.layout.hoteldaspalla);
    		break;
    	case R.id.imageView3:
    		setContentView(R.layout.grandsolitare);
    		break;
    	case R.id.imageView4:
    		setContentView(R.layout.square);
    		break;
    	case R.id.imageView5:
    		setContentView(R.layout.expotel);
    		break;
    	}	
    }

}


