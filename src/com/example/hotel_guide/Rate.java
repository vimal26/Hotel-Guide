package com.example.hotel_guide;


import android.app.AlertDialog;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class Rate extends Rates implements OnClickListener{
	ListView listStudents;
	SQLiteConnector sqlConnect;

	ArrayAdapter<String> adapter;
	AlertDialog alert = null;
	TextView tv1,tv2,tv3;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rate);
		sqlConnect=new SQLiteConnector(this);
		tv1=(TextView)findViewById(R.id.textView2);
		tv2=(TextView)findViewById(R.id.textView3);
		tv3=(TextView)findViewById(R.id.textView4);
		tv1.setOnClickListener(this);
		tv2.setOnClickListener(this);
		tv3.setOnClickListener(this);
	}
	@Override
	public void onClick(View a) {
		switch(a.getId()){
		case R.id.textView2:
			ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
					android.R.layout.simple_list_item_1, sqlConnect.getRate());
			
		}
	}

}
