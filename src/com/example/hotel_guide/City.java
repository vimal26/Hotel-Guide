package com.example.hotel_guide;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class City extends SearchOption implements OnClickListener{
	RadioButton r0,r1,r2,r3,r4,r5,r6,r7,r8,r9;
	Button b,b1;

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.popup);
		r0=(RadioButton)findViewById(R.id.radio0);
		r1=(RadioButton)findViewById(R.id.radio1);
		r2=(RadioButton)findViewById(R.id.radio2);
		r3=(RadioButton)findViewById(R.id.radio3);
		r4=(RadioButton)findViewById(R.id.radio4);
		r5=(RadioButton)findViewById(R.id.radio5);
		r6=(RadioButton)findViewById(R.id.radio6);
		r7=(RadioButton)findViewById(R.id.radio7);
		r8=(RadioButton)findViewById(R.id.radio8);
		r9=(RadioButton)findViewById(R.id.radio9);
		
		r0.setOnClickListener(this);
		r1.setOnClickListener(this);
		r2.setOnClickListener(this);
		r3.setOnClickListener(this);
		r4.setOnClickListener(this);
		r5.setOnClickListener(this);
		r6.setOnClickListener(this);
		r7.setOnClickListener(this);
		r8.setOnClickListener(this);
		r9.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View ar) {
		if(r0.isChecked()){
			Intent intent=new Intent(this,F_S.class);
			startActivity(intent);
			
			}
			if(r1.isChecked()){
			Intent intent=new Intent(this,City2.class);
			startActivity(intent);
			
			}
			if(r2.isChecked()){
				Intent intent=new Intent(this,City3.class);
				startActivity(intent);
			
			}
			if(r3.isChecked()){
				Intent intent=new Intent(this,City4.class);
				startActivity(intent);
			
			}
			if(r4.isChecked()){
				Intent intent=new Intent(this,City5.class);
				startActivity(intent);
			
			}
			if(r5.isChecked()){
				Intent intent=new Intent(this,City6.class);
				startActivity(intent);
		
			}
			if(r6.isChecked()){
				Intent intent=new Intent(this,City7.class);
				startActivity(intent);
			
			}
			if(r7.isChecked()){
				Intent intent=new Intent(this,City8.class);
				startActivity(intent);
			
			}
			if(r8.isChecked()){
				Intent intent=new Intent(this,City9.class);
				startActivity(intent);
			
			}
			if(r9.isChecked()){
				Intent intent=new Intent(this,City10.class);
				startActivity(intent);
						}
	}
}