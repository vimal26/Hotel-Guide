package com.example.hotel_guide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;


public class Rates extends SearchOption implements OnClickListener{
RadioButton rb1,rb2;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rates);
		rb1=(RadioButton)findViewById(R.id.radioButton1);
		rb2=(RadioButton)findViewById(R.id.radioButton2);
		rb2.setOnClickListener(this);
		rb1.setOnClickListener(this);
	}
	 public void onClick(View v)
	    {
		if(rb1.isChecked()){
			Intent i=new Intent(this,Rate.class);
			startActivity(i);
		}
	 if(rb2.isChecked()){
			Intent i=new Intent(this,Rating.class);
			startActivity(i);
		}
		
	}
}

