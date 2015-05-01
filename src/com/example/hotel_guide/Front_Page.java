package com.example.hotel_guide;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Front_Page extends Activity {
TextView tv1,tv2,tv3;
//MainActivity ma;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_front__page);
		tv1=(TextView)findViewById(R.id.textView1);
		tv2=(TextView)findViewById(R.id.textView2);
		tv3=(TextView)findViewById(R.id.textView3);
		
		tv1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
		        String url="http://www.trivago.in/";
		        Intent i= new Intent(Intent.ACTION_VIEW);
		        i.setData(Uri.parse(url));
		        startActivity(i);
				
			}
		});
		tv2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg2) {
				
				Intent in=new Intent(Front_Page.this, SearchOption.class);
				startActivity(in);
				
				
			}});
		
		tv3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg1) {
		        String url="https://www.google.co.in/maps/@27.1948882,77.9834304,16z";
		        Intent i= new Intent(Intent.ACTION_VIEW);
		        i.setData(Uri.parse(url));
		        startActivity(i);
				
				
			}
		});
	}



}
