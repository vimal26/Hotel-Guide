package com.example.hotel_guide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SearchOption extends Front_Page implements OnClickListener {
	Button b1,b2,b3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.searchoption);
		b1=(Button)findViewById(R.id.button1);
		b1.setOnClickListener(this);
		b2=(Button)findViewById(R.id.button2);
		b2.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View a) {
		switch(a.getId()){
	case R.id.button1:
		Intent i=new Intent(this,City.class);
		startActivity(i);
		break;
	case R.id.button2:
		Intent in=new Intent(this,MainActivity.class);
		startActivity(in);
		break;
	
	}
		
	}

}
