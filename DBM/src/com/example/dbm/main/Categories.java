package com.example.dbm.main;

import com.example.dbm.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Categories extends Activity {

	Button back;
	ImageButton BooksButton;


	protected void onCreate(Bundle savedInstanceState) {
		System.out.println("Memeti a Categories java");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_categories);

		BooksButton = (ImageButton)findViewById(R.id.Books);

		back = (Button) findViewById(R.id.BackButton);

		BooksButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				setContentView(R.layout.activity_main);

			}
		});

		back.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.categories, menu);
		return true;
	}

}
