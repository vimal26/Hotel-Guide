package com.example.hotel_guide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Ramdhavaranasi  extends Five_Star implements OnClickListener {
	ImageView im1,im2,im3,im4,im5,im6,im7,im8;
	Button txt;
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.ramdhavaranasi);
	im1=(ImageView)findViewById(R.id.image);
	im2=(ImageView)findViewById(R.id.imageView1);
	im3=(ImageView)findViewById(R.id.imageView2);
	im4=(ImageView)findViewById(R.id.imageView3);
	im5=(ImageView)findViewById(R.id.imageView4);
	im6=(ImageView)findViewById(R.id.imageView5);
	im7=(ImageView)findViewById(R.id.imageView6);



	txt=(Button)findViewById(R.id.tv);
	
	im1.setOnClickListener(this);
	im2.setOnClickListener(this);
	im3.setOnClickListener(this);
	im4.setOnClickListener(this);
	im5.setOnClickListener(this);
	im6.setOnClickListener(this);
	im7.setOnClickListener(this);

	txt.setOnClickListener(this);
}
	 public void onClick(View arg0) {
			switch(arg0.getId()){
			case R.id.imageView1:
				im1.setImageResource(R.drawable.ramdhabed);
				break;
			case R.id.imageView2:
				im1.setImageResource(R.drawable.ramdhadin);
				break;
			case R.id.imageView3:
				im1.setImageResource(R.drawable.ramdhadinn);
				break;
			case R.id.imageView4:
				im1.setImageResource(R.drawable.ramdhahall);
				break;
			case R.id.imageView5:
				im1.setImageResource(R.drawable.ramdhalobby);
				break;
			case R.id.imageView6:
				im1.setImageResource(R.drawable.ramdhapool);
				break;
			case R.id.tv:
		        Intent i= new Intent(Intent.ACTION_VIEW);
		        i.setData(Uri.parse("http://www.ramada.com/hotels/india/varanasi/ramada-plaza-jhv-varanasi/hotel-overview"));
		        startActivity(i);
		        break;
		        
			}
			
		}


		}
