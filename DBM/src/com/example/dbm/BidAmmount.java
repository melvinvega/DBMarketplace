package com.example.dbm;

import com.example.dbm.main.MainActivity;
import com.example.dbm.user.LogInInformation;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BidAmmount extends Activity {

	Intent intent;
	EditText BidAmmount;
	Button submit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bid_ammount);
		
	submit.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			intent = new Intent(BidAmmount.this,ItemList.class);
			startActivity(intent);
			
		}
	});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bid_ammount, menu);
		return true;
	}

}
