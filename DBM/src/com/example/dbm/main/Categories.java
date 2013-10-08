package com.example.dbm.main;

import com.example.dbm.R;
import com.example.dbm.books.BooksSubCategory;
import com.example.dbm.clothing.ClothingSubCategory;
import com.example.dbm.computers.CumputersSubCategory;
import com.example.dbm.electronics.ElectronicsSubCategory;
import com.example.dbm.shoes.ShoesSubCategory;
import com.example.dbm.sports.SportsSubCategory;
import com.example.dbm.user.CreateAccount;
import com.example.dbm.user.LogInInformation;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Categories extends Activity {

	Button back;
	ImageButton BooksButton, ElectronicButton,ComputerButton;
	ImageButton ClothesButton, ShoesButton, SportButton;
	Intent intent;
	EditText search;


	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_categories);

		search = (EditText) findViewById(R.id.SearchBar);
		BooksButton = (ImageButton)findViewById(R.id.Books);
		back = (Button) findViewById(R.id.BackButton);
		ElectronicButton = (ImageButton) findViewById(R.id.electronic);
		ComputerButton = (ImageButton) findViewById(R.id.computer);
		ClothesButton = (ImageButton) findViewById(R.id.clothe);
		ShoesButton = (ImageButton) findViewById(R.id.shoes);
		SportButton = (ImageButton) findViewById(R.id.sport);
		
		
		search.setOnKeyListener(new OnKeyListener() {
			
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				
				switch (keyCode)
	            {
	                case KeyEvent.KEYCODE_DPAD_CENTER:
	                case KeyEvent.KEYCODE_ENTER:
	                    //Add search method
	                    return true;
	                default:
	                    break;
	            }
				return false;
			}
		});
		
		View.OnClickListener handler1 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(Categories.this,BooksSubCategory.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler2 = new View.OnClickListener() {
			public void onClick(View v){
				finish();
			}
		};
		
		View.OnClickListener handler3 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(Categories.this,ElectronicsSubCategory.class);
				startActivity(intent);
			}
		};
		
		View.OnClickListener handler4 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(Categories.this,CumputersSubCategory.class);
				startActivity(intent);
			}
		};
		
		View.OnClickListener handler5 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(Categories.this,ClothingSubCategory.class);
				startActivity(intent);
			}
		};
		
		View.OnClickListener handler6 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(Categories.this,ShoesSubCategory.class);
				startActivity(intent);
			}
		};
		
		View.OnClickListener handler7 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(Categories.this,SportsSubCategory.class);
				startActivity(intent);
			}
		};
		
		
		
		BooksButton.setOnClickListener(handler1);
		back.setOnClickListener(handler2);
		ElectronicButton.setOnClickListener(handler3);
		ComputerButton.setOnClickListener(handler4);
		ClothesButton.setOnClickListener(handler5);
		ShoesButton.setOnClickListener(handler6);
		SportButton.setOnClickListener(handler7);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.categories, menu);
		return true;
	}

}
