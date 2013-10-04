package com.example.dbm.user;

import com.example.dbm.R;
import com.example.dbm.R.layout;
import com.example.dbm.R.menu;
import com.example.dbm.main.AfterLogIn;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class CreateAccount extends Activity {


	Button create;
	Intent intent;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_account);

		create = (Button) findViewById(R.id.confirm);


		View.OnClickListener handler = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(CreateAccount.this,UserInformation.class);
				startActivity(intent);

			}
		};

		create.setOnClickListener(handler);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.create_account, menu);
		return true;
	}

}
