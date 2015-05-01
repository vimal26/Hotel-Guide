package com.example.hotel_guide;

import java.util.ArrayList;
import java.util.List;


import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;


public class SQLiteConnector {
	
	private SQLiteDatabase database;
	private SQLiteHelper sqlHelper;
	private Cursor cursor;
	
	private static final String TABLE_RECORD = "hoteldatabase";
	private static final String CITY_NAME = "cityname";
	
	public SQLiteConnector(Context context) {
		sqlHelper = new SQLiteHelper(context);
	}
	
	// Getting All records
			public List<String> getAllRecord() {
				List<String> studentList = new ArrayList<String>();
				String selectQuery = "SELECT  * FROM " + TABLE_RECORD;

				database = sqlHelper.getReadableDatabase();
				cursor = database.rawQuery("SELECT name,address, facilities, email FROM " +
                        TABLE_RECORD, null);
				if (cursor.moveToFirst()) {
					do {
						 String firstName = cursor.getString(cursor.getColumnIndex("name"));
						 //String email = cursor.getString(cursor.getColumnIndex("email"));
						 //String address = cursor.getString(cursor.getColumnIndex("address"));
						 //String facilities = cursor.getString(cursor.getColumnIndex("facilities"));
		                  
						 studentList.add(" " + firstName /*+"\n" +"FACILITIES: " + facilities +"\n"+ "ADDRESS: " + address + "\n" + "Email:" + email*/);
						 
						
					} while (cursor.moveToNext());
				}
				database.close();
				return studentList;
			}
			public List<String> getOneRecord(){
				List<String> studentList = new ArrayList<String>();
				String selectQuery = "SELECT  * FROM " + TABLE_RECORD;

				database = sqlHelper.getReadableDatabase();
				cursor = database.rawQuery("SELECT name,address, facilities, email FROM " +
                        TABLE_RECORD , null);
				if (cursor.moveToFirst()) {
					do {
						 //String firstName = cursor.getString(cursor.getColumnIndex("name"));
						 String email = cursor.getString(cursor.getColumnIndex("email"));
						 String address = cursor.getString(cursor.getColumnIndex("address"));
						 String facilities = cursor.getString(cursor.getColumnIndex("facilities"));
		                  
						 studentList.add(/*"NAME: " + firstName /*+"\n"*/"FACILITIES: " + facilities +"\n"+ "ADDRESS: " + address + "\n" + "Email:" + email);
						 
						
					} while (cursor.moveToNext());
				}
				database.close();
				return studentList;
			}
			public List<String> getCityRecord(){
				List<String> studentList = new ArrayList<String>();
				String selectQuery = "SELECT  * FROM " + TABLE_RECORD;

				database = sqlHelper.getReadableDatabase();
				cursor = database.rawQuery("SELECT DISTINCT cityname FROM " +
                        TABLE_RECORD , null);
				if (cursor.moveToFirst()) {
					do {
						 //String firstName = cursor.getString(cursor.getColumnIndex("name"));
						 //String email = cursor.getString(cursor.getColumnIndex("email"));
						 //String address = cursor.getString(cursor.getColumnIndex("address"));
						 String city = cursor.getString(cursor.getColumnIndex("cityname"));
		                  
						 studentList.add(/*"NAME: " + firstName /*+"\n"*/" " + city); //+"\n"+ "ADDRESS: " + address + "\n" + "Email:" + email);
						 
						
					} while (cursor.moveToNext());
				}
				database.close();
				return studentList;
			}

			public List<String> getByCity(String product) {
				List<String> studentList = new ArrayList<String>();
				database = sqlHelper.getReadableDatabase();
				String query = "Select * FROM " + TABLE_RECORD + " WHERE cityname" + product;
				cursor = database.rawQuery(query,null );
				if (cursor.moveToFirst()) {
					do {
						 String firstName = cursor.getString(cursor.getColumnIndex("name"));
						 String email = cursor.getString(cursor.getColumnIndex("email"));
						 String address = cursor.getString(cursor.getColumnIndex("address"));
						 String facilities = cursor.getString(cursor.getColumnIndex("facilities"));
		                  
						 studentList.add("NAME: " + firstName +"\n"+"FACILITIES: " + facilities +"\n"+ "ADDRESS: " + address + "\n" + "Email:" + email);
						 
						
					} while (cursor.moveToNext());
				}
				database.close();
				return studentList;
				
				
			}
			public List<String> getRate(){
				List<String> studentList = new ArrayList<String>();
				String selectQuery = "SELECT  * FROM " + TABLE_RECORD;

				database = sqlHelper.getReadableDatabase();
				cursor = database.rawQuery("SELECT name,address, facilities, email FROM " +
                        TABLE_RECORD+"where rate<1000" , null);
				if (cursor.moveToFirst()) {
					do {
						 String firstName = cursor.getString(cursor.getColumnIndex("name"));
						 String email = cursor.getString(cursor.getColumnIndex("email"));
						 String address = cursor.getString(cursor.getColumnIndex("address"));
						 String facilities = cursor.getString(cursor.getColumnIndex("facilities"));
		                  
						 studentList.add("NAME: " + firstName +"\n"+"FACILITIES: " + facilities +"\n"+ "ADDRESS: " + address + "\n" + "Email:" + email);
						 
						
					} while (cursor.moveToNext());
				}
				database.close();
				return studentList;
			}
			
		


			/*public List<String> getResult(EditText mtxt) {
				List<String> studentList = new ArrayList<String>();
				String selectQuery = "SELECT  * FROM TABLE_RECORD where id"+ mtxt;
				database = sqlHelper.getReadableDatabase();
				cursor = database.rawQuery("selectQuery", null);
				if (cursor.moveToFirst()) {
					do {
						 String firstName = cursor.getString(cursor.getColumnIndex("name"));
						 //String email = cursor.getString(cursor.getColumnIndex("email"));
						 //String address = cursor.getString(cursor.getColumnIndex("address"));
						 //String facilities = cursor.getString(cursor.getColumnIndex("facilities"));
		                  
						 studentList.add("NAME: " + firstName +"\n" +"FACILITIES: " + facilities +"\n"+ "ADDRESS: " + address + "\n" + "Email:" + email);
						 
						
					} while (cursor.moveToNext());
				}
				database.close();
				return studentList;
			}*/
	
}
