package com.example.dbm.sales;

import java.util.ArrayList;

import com.example.dbm.BidAmmount;
import com.example.dbm.ExpandableListAdapter;
import com.example.dbm.Item;
import com.example.dbm.ItemList;
import com.example.dbm.R;
import com.example.dbm.R.layout;
import com.example.dbm.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ExpandableListView;

public class TotalSales extends Activity {

	private ExpandableListView mExpandableList;
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.expandable_list);

		mExpandableList = (ExpandableListView)findViewById(R.id.lvExp);

		final ArrayList<Item> arrayParents = new ArrayList<Item>();
		ArrayList<String> arrayChildren = new ArrayList<String>();
		arrayChildren.add("Child");

		//here we set the parents and the children
		for (int i = 0; i < 5; i++)
		{
			//for each "i" create a new Parent object to set the title and the children
			arrayChildren.add("array " + i);
			Item parent = new Item();
			parent.setTitle("Parent " + i);
			parent.setArrayChildren(arrayChildren);

			//in this array we add the Parent object. We will use the arrayParents at the setAdapter
			arrayParents.add(parent);
		}
		arrayChildren.add("");

		//sets the adapter that provides data to the list.
		mExpandableList.setAdapter(new ExpandableListAdapter(this,arrayParents,0));

	}




	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.total_sales, menu);
		return true;
	}


}