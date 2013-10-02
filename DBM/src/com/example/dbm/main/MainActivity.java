package com.example.dbm.main;

import com.example.dbm.R;
import com.example.dbm.user.LogInInformation;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	Button LogInButton,CreateAccountButton, BackButton;

	ImageButton buyButton,sellButton,userButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		LogInButton 		 = (Button) findViewById(R.id.LogInButton);
		CreateAccountButton  = (Button) findViewById(R.id.CreateAccountButton);
		BackButton			 = (Button)findViewById(R.id.LogInButton);
		
		buyButton			 = (ImageButton) findViewById(R.id.BuyButton);
		sellButton			 = (ImageButton) findViewById(R.id.SellButton);
		userButton 		     = (ImageButton) findViewById(R.id.UserIconButton);
		
	
	

		LogInButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent l = new Intent(getApplicationContext(), LogInInformation.class);
				startActivity(l);
				
			}
		});

		CreateAccountButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});
		
		BackButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				//setContentView(R.layout.activity_main);
			}
		});
		

		buyButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Categories.class);
				startActivity(i);
			}
		});

		sellButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Categories.class);
				startActivity(i);
			}
		});

		userButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});
		
		

	}




	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
