package com.example.hotel_guide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class F_S extends City implements OnClickListener{
RadioButton rb1,rb2,rb3;
Button b;
ImageView im1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city1);
        rb1=(RadioButton)findViewById(R.id.rd1);
        rb2=(RadioButton)findViewById(R.id.rd2);
        rb3=(RadioButton)findViewById(R.id.rd3);
        b=(Button)findViewById(R.id.button1);

        rb1.setOnClickListener(this);
        rb2.setOnClickListener(this);
        rb3.setOnClickListener(this);
        b.setOnClickListener(this);
  
}
    public void onClick(View v)
    {
    	switch(v.getId()){
		case R.id.button1:
			Intent i=new Intent(F_S.this,City.class);
			startActivity(i);
			//setContentView(R.layout.popup);
			break;
		}
    		if(rb1.isChecked()){
    		Intent intent=new Intent(F_S.this,Five_Star.class);
    		startActivity(intent);
    		}
    		if(rb2.isChecked()){
    	   		Intent intent=new Intent(F_S.this,Four_Star.class);
        		startActivity(intent);
    		}
    		if(rb3.isChecked()){
    	   		Intent intent=new Intent(F_S.this,Threee_Star.class);
        		startActivity(intent);
    		}
    		
    		
}
}