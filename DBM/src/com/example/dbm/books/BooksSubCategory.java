package com.example.dbm.books;

import com.example.dbm.ItemList;
import com.example.dbm.R;
import com.example.dbm.R.layout;
import com.example.dbm.R.menu;
import com.example.dbm.main.Categories;
import com.example.dbm.main.MainActivity;
import com.example.dbm.user.LogInInformation;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class BooksSubCategory extends Activity {
	
	Button AdultButton, FictionButton, ChildrenButton;
	Button TechonologyButton, BackBookButton;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_books_sub_category);
		
		AdultButton = (Button) findViewById(R.id.adult);
		FictionButton = (Button) findViewById(R.id.fiction);
		ChildrenButton = (Button) findViewById(R.id.children);
		TechonologyButton = (Button) findViewById(R.id.technology);
		BackBookButton = (Button) findViewById(R.id.backbooks);
		
		View.OnClickListener handler1 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(BooksSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler2 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(BooksSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler3 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(BooksSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler4 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(BooksSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		
		View.OnClickListener handler5 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(BooksSubCategory.this,Categories.class);
				startActivity(intent);
				
			}
		};
		
		AdultButton.setOnClickListener(handler1);
		FictionButton.setOnClickListener(handler2);
		ChildrenButton.setOnClickListener(handler3);
		TechonologyButton.setOnClickListener(handler4);
		BackBookButton.setOnClickListener(handler5);
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.books_sub_category, menu);
		return true;
	}

}
