package com.example.dbm.shoes;

import com.example.dbm.ItemList;
import com.example.dbm.R;
import com.example.dbm.R.layout;
import com.example.dbm.R.menu;
import com.example.dbm.clothing.ClothingSubCategory;
import com.example.dbm.main.Categories;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ShoesSubCategory extends Activity {
	
	Button MenShoesButton, WomenShoesButton, ChildrenShoesButton;
	Button BackShoesButton;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shoes_sub_category);
		
		
		MenShoesButton = (Button) findViewById(R.id.menshoes);
		WomenShoesButton = (Button) findViewById(R.id.womenshoes);
		ChildrenShoesButton = (Button) findViewById(R.id.childrenshoes);
		BackShoesButton = (Button) findViewById(R.id.backshoes);
		
		View.OnClickListener handler1 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(ShoesSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler2 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(ShoesSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler3 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(ShoesSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler4 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(ShoesSubCategory.this,Categories.class);
				startActivity(intent);
				
			}
		};
		
		
		
		MenShoesButton.setOnClickListener(handler1);
		WomenShoesButton.setOnClickListener(handler2);
		ChildrenShoesButton.setOnClickListener(handler3);
		BackShoesButton.setOnClickListener(handler4);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.shoes_sub_category, menu);
		return true;
	}

}
