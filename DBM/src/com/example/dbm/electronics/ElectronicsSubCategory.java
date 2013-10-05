package com.example.dbm.electronics;

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

public class ElectronicsSubCategory extends Activity {
	
	Button Mp3PlayersButton, TabletsButton, PhonesButton;
	Button ConsolesButton, BackElectronicsButton;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_electronics_sub_category);
		
		Mp3PlayersButton = (Button) findViewById(R.id.mp3);
		TabletsButton = (Button) findViewById(R.id.tablets);
		PhonesButton = (Button) findViewById(R.id.phones);
		ConsolesButton = (Button) findViewById(R.id.videogames);
		BackElectronicsButton = (Button) findViewById(R.id.backelectronics);
		
		View.OnClickListener handler1 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(ElectronicsSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler2 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(ElectronicsSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler3 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(ElectronicsSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler4 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(ElectronicsSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler5 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(ElectronicsSubCategory.this,Categories.class);
				startActivity(intent);
				
			}
		};
		
		
		
		Mp3PlayersButton.setOnClickListener(handler1);
		TabletsButton.setOnClickListener(handler2);
		PhonesButton.setOnClickListener(handler3);
		ConsolesButton.setOnClickListener(handler4);
		BackElectronicsButton.setOnClickListener(handler5);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.electronics_sub_category, menu);
		return true;
	}

}
