package com.example.dbm.sports;

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

public class SportsSubCategory extends Activity {
	
	Button BaseballButton, BasketballButton, SoccerButton;
	Button TennisButton, BackSportsButton;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sports_sub_category);
		
		BaseballButton = (Button) findViewById(R.id.baseball);
		BasketballButton = (Button) findViewById(R.id.basketball);
		SoccerButton = (Button) findViewById(R.id.soccer);
		TennisButton = (Button) findViewById(R.id.tennis);
		BackSportsButton = (Button) findViewById(R.id.backsports);
		
		View.OnClickListener handler1 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(SportsSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler2 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(SportsSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler3 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(SportsSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler4 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(SportsSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler5 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(SportsSubCategory.this,Categories.class);
				startActivity(intent);
				
			}
		};
		
		
		
		BasketballButton.setOnClickListener(handler1);
		BaseballButton.setOnClickListener(handler2);
		SoccerButton.setOnClickListener(handler3);
		TennisButton.setOnClickListener(handler4);
		BackSportsButton.setOnClickListener(handler5);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sports_sub_category, menu);
		return true;
	}

}
