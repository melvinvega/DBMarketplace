package com.example.dbm.computers;

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

public class CumputersSubCategory extends Activity {
	
	
	Button DesktopButton, LaptopButton, BackComputerButton;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cumputers_sub_category);
		
		DesktopButton = (Button) findViewById(R.id.desktop);
		LaptopButton = (Button) findViewById(R.id.laptop);
		BackComputerButton = (Button) findViewById(R.id.backcomputers);
		
		
		View.OnClickListener handler1 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(CumputersSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler2 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(CumputersSubCategory.this,ItemList.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler3 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(CumputersSubCategory.this,Categories.class);
				startActivity(intent);
				
			}
		};
		
		
		
		DesktopButton.setOnClickListener(handler1);
		LaptopButton.setOnClickListener(handler2);
		BackComputerButton.setOnClickListener(handler3);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cumputers_sub_category, menu);
		return true;
	}

}
