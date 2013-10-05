package com.example.dbm.clothing;

import com.example.dbm.ItemList;
import com.example.dbm.R;
import com.example.dbm.R.layout;
import com.example.dbm.R.menu;
import com.example.dbm.books.BooksSubCategory;
import com.example.dbm.main.Categories;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ClothingSubCategory extends Activity {
	
	
	Button MenButton, WomenButton, ChildrenClotheButton;
	Button BackClotheButton;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clothing_sub_category);
		
		MenButton = (Button) findViewById(R.id.men);
		WomenButton = (Button) findViewById(R.id.women);
		ChildrenClotheButton = (Button) findViewById(R.id.childrenclothe);
		BackClotheButton = (Button) findViewById(R.id.backclothe);
		
		View.OnClickListener handler1 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(ClothingSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler2 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(ClothingSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler3 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(ClothingSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler4 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(ClothingSubCategory.this,Categories.class);
				startActivity(intent);
				
			}
		};
		
		
		
		MenButton.setOnClickListener(handler1);
		WomenButton.setOnClickListener(handler2);
		ChildrenClotheButton.setOnClickListener(handler3);
		BackClotheButton.setOnClickListener(handler4);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.clothing_sub_category, menu);
		return true;
	}

}
