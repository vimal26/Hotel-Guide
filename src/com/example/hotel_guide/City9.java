package com.example.hotel_guide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;

public class City9 extends City implements OnClickListener{
	RadioButton rb1,rb2,rb3;
	Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city9);
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
    		if(rb1.isChecked()){
        		Intent intent=new Intent(City9.this,Five9.class);
        		startActivity(intent);
    		}
    		if(rb2.isChecked()){
        		Intent intent=new Intent(City9.this,Four9.class);
        		startActivity(intent);
    		}
    		if(rb3.isChecked()){
        		Intent intent=new Intent(City9.this,Three9.class);
        		startActivity(intent);
    		}
    		switch(v.getId()){
    		case R.id.button1:
    			setContentView(R.layout.popup);
    			break;
    		}
}
}