package com.example.dbm.user;

import com.example.dbm.R;
import com.example.dbm.main.AfterLogIn;
import com.example.dbm.main.MainActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class LogInInformation extends Activity {

	Button LogInButton;
	Intent intent;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_log_in_information);
		
		LogInButton = (Button) findViewById(R.id.logConfirm);
		
		
		View.OnClickListener handler = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(LogInInformation.this,AfterLogIn.class);
				startActivity(intent);
				
			}
		};
		
		LogInButton.setOnClickListener(handler);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.log_in_information, menu);
		return true;
	}

}
