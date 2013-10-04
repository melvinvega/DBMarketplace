package com.example.dbm.main;

import com.example.dbm.R;
import com.example.dbm.R.layout;
import com.example.dbm.R.menu;
import com.example.dbm.user.CreateAccount;
import com.example.dbm.user.LogInInformation;
import com.example.dbm.user.UserBidsInfo;
import com.example.dbm.user.UserCart;
import com.example.dbm.user.UserInformation;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AfterLogIn extends Activity {
	
	ImageButton Buy2, Sell2, Cart, Bids,Profile; 
	Button LogOut;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_after_log_in);
		
		Buy2		 = (ImageButton) findViewById(R.id.buy2);
		Sell2  = (ImageButton) findViewById(R.id.sell2);
		Cart			 = (ImageButton) findViewById(R.id.cart);
		Bids			 = (ImageButton) findViewById(R.id.bids);
		LogOut = (Button) findViewById(R.id.logout2);
		Profile = (ImageButton) findViewById(R.id.profile);
		
		
		View.OnClickListener handler1 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(AfterLogIn.this,Categories.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler2 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(AfterLogIn.this,Categories.class);
				startActivity(intent);
			}
		};
		
		View.OnClickListener handler3 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(AfterLogIn.this,UserCart.class);
				startActivity(intent);
			}
		};
		
		View.OnClickListener handler4 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(AfterLogIn.this,UserBidsInfo.class);
				startActivity(intent);
			}
		};
		
		View.OnClickListener handler5 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(AfterLogIn.this,MainActivity.class);
				startActivity(intent);
			}
		};
		
		View.OnClickListener handler6 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(AfterLogIn.this,UserInformation.class);
				startActivity(intent);
			}
		};
		
		
		
		Buy2.setOnClickListener(handler1);
		Sell2.setOnClickListener(handler2);
		Cart.setOnClickListener(handler3);
		Bids.setOnClickListener(handler4);
		LogOut.setOnClickListener(handler5);
		Profile.setOnClickListener(handler6);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.after_log_in, menu);
		return true;
	}

}
