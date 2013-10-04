package com.example.dbm.user;

import com.example.dbm.R;
import com.example.dbm.main.AfterLogIn;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class UserInformation extends Activity {
	
	Button Confirm, Edit;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_information);
		
		Confirm = (Button) findViewById(R.id.confirm);
		Edit = (Button) findViewById(R.id.edit);


		View.OnClickListener handler1 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(UserInformation.this,AfterLogIn.class);
				startActivity(intent);

			}
		};
		
		View.OnClickListener handler2 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(UserInformation.this,EditUserInformation.class);
				startActivity(intent);

			}
		};

		Confirm.setOnClickListener(handler1);
		Edit.setOnClickListener(handler2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.user_information, menu);
		return true;
	}

}
