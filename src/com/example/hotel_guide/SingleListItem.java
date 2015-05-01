package com.example.hotel_guide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SingleListItem extends Activity{
	ListView listStudents;
	SQLiteConnector sqlConnect;
	ArrayAdapter<String> adapter;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.singlelist);
		listStudents = (ListView) findViewById(R.id.listView1);
		sqlConnect=new SQLiteConnector(this);
		
		Intent i = getIntent();
		 String product = i.getStringExtra("product");
		
		 ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
					android.R.layout.simple_list_item_1, sqlConnect.getByCity(product));
			listStudents.setAdapter(adapter);
		 
	}
}
