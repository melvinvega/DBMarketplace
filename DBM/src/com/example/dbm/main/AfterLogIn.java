package com.example.dbm.main;

import com.example.dbm.R;
import com.example.dbm.R.layout;
import com.example.dbm.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AfterLogIn extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_after_log_in);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.after_log_in, menu);
		return true;
	}

}