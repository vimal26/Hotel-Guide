package com.example.hotel_guide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Four3 extends City4 implements OnClickListener{
	Button b1,b2,b3,b4,b5,b6;
	ImageView im1,im2,im3,im4,im5;
	Intent intent;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four3);
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
        
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        
    }

    public void onClick(View v)
    {
    	switch(v.getId()){
    	case R.id.button1:
    		intent=new Intent(Four3.this,Sunnsand.class);
    		startActivity(intent);
    		
    		break;
    	case R.id.button2:
    		intent=new Intent(Four3.this,Fortunein.class);
    		startActivity(intent);
    		
    		break;
    	case R.id.button3:
    		intent=new Intent(Four3.this,Stlaurnsuites.class);
    		startActivity(intent);
    		
    		break;
    	case R.id.button4:
    		intent=new Intent(Four3.this,Cypresshotel.class);
    		startActivity(intent);
    		
    		break;
    	case R.id.button5:
    		intent=new Intent(Four3.this,Fortuneselect.class);
    		startActivity(intent);
    	
    		break;
    	case R.id.button6:
    		setContentView(R.layout.city4);
    		break;
    		
    	}
    }
}



