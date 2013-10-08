package com.example.dbm.sales;

import com.example.dbm.R;
import com.example.dbm.R.layout;
import com.example.dbm.R.menu;
import com.example.dbm.main.Administrator;
import com.example.dbm.user.CreateAccount;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Sales extends Activity {
	
	Button SalesBack, TotalSalesButton, TotalProductsButton2;
	Button TotalRevenueButton;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sales);
		
		SalesBack = (Button) findViewById(R.id.salesback);
		TotalSalesButton = (Button) findViewById(R.id.totalsales);
		TotalProductsButton2 = (Button) findViewById(R.id.totalproducts);
		TotalRevenueButton = (Button) findViewById(R.id.totalsalesrevenue);
		
		
		
		View.OnClickListener handler = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(Sales.this,Administrator.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler2 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(Sales.this,TotalSales.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler3 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(Sales.this,TotalSalesProduct.class);
				startActivity(intent);
				
			}
		};
		
		View.OnClickListener handler4 = new View.OnClickListener() {
			public void onClick(View v){
				intent = new Intent(Sales.this,TotalSalesRevenue.class);
				startActivity(intent);
				
			}
		};
		
		SalesBack.setOnClickListener(handler);
		TotalSalesButton.setOnClickListener(handler2);
		TotalProductsButton2.setOnClickListener(handler3);
		TotalRevenueButton.setOnClickListener(handler4);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sales, menu);
		return true;
	}

}
