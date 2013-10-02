package com.example.dbm.user;

import com.example.dbm.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class EditUserInformation extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_user_information);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit_user_information, menu);
		return true;
	}

}
