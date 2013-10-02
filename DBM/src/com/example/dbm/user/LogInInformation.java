package com.example.dbm.user;

import com.example.dbm.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class LogInInformation extends Activity {

	Button LogInButton;
	
	protected void onCreate(Bundle savedInstanceState) {
		System.out.println("Loginfo");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_log_in_information);
		Intent i = getIntent();
		LogInButton = (Button)findViewById(R.id.logButton2);
		
		LogInButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.log_in_information, menu);
		return true;
	}

}
