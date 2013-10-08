package com.example.dbm.main;

import com.example.dbm.R;
import com.example.dbm.R.layout;
import com.example.dbm.R.menu;
import com.example.dbm.sales.Sales;
import com.example.dbm.user.CreateAccount;
import com.example.dbm.user.LogInInformation;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Administrator extends Activity {
	
	Button CreateAccountAdmi, SalesInfo, AdmiLogOut;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_administrator);
		
		CreateAccountAdmi = (Button) findViewById(R.id.admicreate);
		SalesInfo = (Button) findViewById(R.id.admisales);
		AdmiLogOut = (Button) findViewById(R.id.admilogout);
		
		
		View.OnClickListener handler = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(Administrator.this,CreateAccount.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler2 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(Administrator.this,Sales.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler3 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(Administrator.this,MainActivity.class);
				startActivity(intent);
				
			}
		};
		
		CreateAccountAdmi.setOnClickListener(handler);
		SalesInfo.setOnClickListener(handler2);
		AdmiLogOut.setOnClickListener(handler3);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.administrator, menu);
		return true;
	}

}
