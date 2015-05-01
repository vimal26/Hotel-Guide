package com.example.hotel_guide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Maple extends Three6 implements OnClickListener {
	ImageView im1,im2,im3,im4,im5,im6,im7,im8;
	Button txt;
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
    		setContentView(R.layout.maple);
	im1=(ImageView)findViewById(R.id.image);
	im2=(ImageView)findViewById(R.id.imageView1);
	im3=(ImageView)findViewById(R.id.imageView2);
	im4=(ImageView)findViewById(R.id.imageView3);
	im5=(ImageView)findViewById(R.id.imageView4);
	im6=(ImageView)findViewById(R.id.imageView5);



	txt=(Button)findViewById(R.id.tv);
	
	im1.setOnClickListener(this);
	im2.setOnClickListener(this);
	im3.setOnClickListener(this);
	im4.setOnClickListener(this);
	im5.setOnClickListener(this);
	im6.setOnClickListener(this);
	//im7.setOnClickListener(this);

	txt.setOnClickListener(this);
	
	
}
@Override
public void onClick(View arg0) {
	switch(arg0.getId()){
	case R.id.imageView1:
		im1.setImageResource(R.drawable.maplebar);
		break;
	case R.id.imageView2:
		im1.setImageResource(R.drawable.maplebath);
		break;
	case R.id.imageView3:
		im1.setImageResource(R.drawable.maplebe);
		break;
	case R.id.imageView4:
		im1.setImageResource(R.drawable.maplebed);
		break;
	case R.id.imageView5:
		im1.setImageResource(R.drawable.maplehall);break;
	case R.id.tv:
        Intent i= new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.booking.com/hotel/in/the-maple-leaf.en-gb.html?aid=332539;label=gcad-74715_site-hotelfinder_ucc-IN_ulang-en_ucurr-INR_ver-false;sid=ec10f009ad4e5f5769999762aca84f62;dcid=1;checkin=2013-08-18;checkout=2013-08-19;srfid=7247ac6e200f46f571f10a1279194bfbe956512aX12 "));
        startActivity(i);
        break;
        
	}
	
}


}
