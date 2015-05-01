package com.example.hotel_guide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Three6 extends City6 implements OnClickListener{
	ImageView im1,im2,im3,im4,im5;
	Button b;
	Intent intent;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three6); 
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
    		setContentView(R.layout.city6);
    		break;
    	case R.id.imageView1:
    		intent=new Intent(Three6.this,Maple.class);
    		startActivity(intent);

    		break;
    	case R.id.imageView2:
    		intent=new Intent(Three6.this,Tulip.class);
    		startActivity(intent);
    		
    		break;
    	case R.id.imageView3:
    		intent=new Intent(Three6.this,Manglam.class);
    		startActivity(intent);
    		
    		break;
    	case R.id.imageView4:
    		intent=new Intent(Three6.this,Comfortinn.class);
    		startActivity(intent);
    		
    		break;
    	case R.id.imageView5:
    		intent=new Intent(Three6.this,Deepavadh.class);
    		startActivity(intent);
    		
    		break;

    	}	
    }

}


