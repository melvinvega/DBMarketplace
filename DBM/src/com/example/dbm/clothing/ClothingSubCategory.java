package com.example.dbm.clothing;

import com.example.dbm.R;
import com.example.dbm.R.layout;
import com.example.dbm.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ClothingSubCategory extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clothing_sub_category);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.clothing_sub_category, menu);
		return true;
	}

}
