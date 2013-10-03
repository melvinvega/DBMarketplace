package com.example.dbm.main;

import com.example.dbm.R;
import com.example.dbm.user.LogInInformation;
import com.example.dbmarketplace.Log_In_Information;
import com.example.dbmarketplace.MainActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	Button LogInButton,CreateAccountButton, BackButton;
	Intent intent;
	ImageButton buyButton,sellButton,userButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		LogInButton 		 = (Button) findViewById(R.id.LogInButton);
		CreateAccountButton  = (Button) findViewById(R.id.CreateAccountButton);
		buyButton			 = (ImageButton) findViewById(R.id.BuyButton);
		sellButton			 = (ImageButton) findViewById(R.id.SellButton);
		userButton 		     = (ImageButton) findViewById(R.id.UserIconButton);
		
	
		View.OnClickListener handler1 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(MainActivity.this,.class);
				startActivity(intent);
			}
		};
		
		View.OnClickListener handler2 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(LogInInformation.this,LogInInformation.class);
				startActivity(intent);
			}
		};
		
		View.OnClickListener handler1 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(MainActivity.this,Log_In_Information.class);
				startActivity(intent);
			}
		};
		
		View.OnClickListener handler1 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(MainActivity.this,Log_In_Information.class);
				startActivity(intent);
			}
		};
		
		View.OnClickListener handler1 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(MainActivity.this,Log_In_Information.class);
				startActivity(intent);
			}
		};
		
		startButton1.setOnClickListener(handler1);
		startButton1.setOnClickListener(handler1);
		startButton1.setOnClickListener(handler1);
		startButton1.setOnClickListener(handler1);
		startButton1.setOnClickListener(handler1);
		
		

	}




	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
