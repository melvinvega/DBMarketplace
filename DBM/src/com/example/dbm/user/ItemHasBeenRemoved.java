package com.example.dbm.user;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dbm.R;


public class ItemHasBeenRemoved extends Activity {
	
		EditText BidAmmount;
		Button okButton;
		Intent intent;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.item_has_been_removed);
			okButton =  (Button) findViewById(R.id.ok_button);
			
			okButton.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					intent = new Intent(ItemHasBeenRemoved.this,UserCart.class);
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

