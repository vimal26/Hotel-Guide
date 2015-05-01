package com.example.hotel_guide;

import java.util.ArrayList;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends SearchOption implements OnClickListener,OnItemClickListener{
	ListView listStudents;
	SQLiteConnector sqlConnect;
	Button b1,b2;
	EditText mtxt;
	ArrayAdapter<String> adapter;
	AlertDialog alert = null;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listStudents = (ListView) findViewById(R.id.listView1);
		listStudents.setOnItemClickListener(this);
		sqlConnect=new SQLiteConnector(this);
		b1=(Button)findViewById(R.id.button1);
		b1.setOnClickListener(this);
		//b2=(Button)findViewById(R.id.button2);
		//b2.setOnClickListener(this);
		sqlConnect = new SQLiteConnector(this);
		//mtxt = (EditText) findViewById(R.id.editText1);
		
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, sqlConnect.getAllRecord());
		listStudents.setAdapter(adapter);
		
		/*mtxt.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				//sqlConnect.getResult(mtxt);
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
			}

			@Override
			public void afterTextChanged(Editable s) {
				//if (0 != mtxt.getText().length()) {
					//String spnId = mtxt.getText().toString();
					//sqlConnect.getResult(spnId);
				//}else {
					//setData();
				//}
			}
		});


		//setData();
		
	}


	protected void setSearchResult(String spnId) {
		adapter = new ArrayAdapter<String>(this,
				 android.R.layout.simple_list_item_1, sqlConnect.getAllRecord());
		ArrayList<String> mAllData=new ArrayList<String>(sqlConnect.getAllRecord());
		for (String temp : mAllData) {
			if (temp.toLowerCase().contains(spnId.toLowerCase())) {
				//sqlConnect.addItem(temp);
				
			}
		}
		listStudents.setAdapter(adapter);
		
		
	}*/

	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		//case R.id.button2:
			//sqlConnect.getResult(mtxt);
			//break;
		case R.id.button1:
		Intent i=new Intent(this,Front_Page.class);
		startActivity(i);
		break;
		}
	}

	/*public void setData() {
		ArrayList<String> mAllData=new ArrayList<String>(sqlConnect.getAllRecord());
		sqlConnect=new SQLiteConnector(this);
		listStudents.setOnItemClickListener(this);
		listStudents.setAdapter(adapter);
		
	}*/

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, sqlConnect.getOneRecord());
		String str = adapter.getItem(arg2);
		if (null == alert)
			alert = new AlertDialog.Builder(this).create();

		if (alert.isShowing()) {
			return;
		}

		alert.setTitle("HOTEL'S INFORMATION");
		alert.setMessage(str);
		alert.setButton3("Ok", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.dismiss();
			}
		});
		alert.show();
		
		
	}

}
