package com.example.dbm.user;

import com.example.dbm.R;
import com.example.dbm.main.AfterLogIn;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class EditUserInformation extends Activity {
	
	Button Confirm2, Cancel;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_user_information);
		
		Confirm2 = (Button) findViewById(R.id.confirm2);
		Cancel = (Button) findViewById(R.id.cancel);
		
		
		View.OnClickListener handler1 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(EditUserInformation.this,AfterLogIn.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler2 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(EditUserInformation.this,UserInformation.class);
				startActivity(intent);
				
			}
		};
		
		Confirm2.setOnClickListener(handler1);
		Cancel.setOnClickListener(handler2);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit_user_information, menu);
		return true;
	}

}
