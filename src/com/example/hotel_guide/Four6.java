package com.example.hotel_guide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Four6 extends City6 implements OnClickListener{
	ImageView im1,im2,im3;
	Button b;
	Intent intent;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four6); 
        im1=(ImageView)findViewById(R.id.imageView1);
        im2=(ImageView)findViewById(R.id.imageView2);
        im3=(ImageView)findViewById(R.id.imageView3);

        b=(Button)findViewById(R.id.button1);
        
        im1.setOnClickListener(this);
        im2.setOnClickListener(this);
        im3.setOnClickListener(this);
        b.setOnClickListener(this);
    }
    public void onClick(View v)
    {

    	switch(v.getId()){
    	case R.id.button1:
    		setContentView(R.layout.city6);
    		break;
    	case R.id.imageView1:
    		intent=new Intent(Four6.this,Hotelindia.class);
    		startActivity(intent);

    		break;
    	case R.id.imageView2:
    		intent=new Intent(Four6.this,Dayalparadise.class);
    		startActivity(intent);

    		break;
    	case R.id.imageView3:
    		intent=new Intent(Four6.this,Grandjbr.class);
    		startActivity(intent);

    		break;

    	}	
    }

}


