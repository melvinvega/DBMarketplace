package com.example.dbm.user;

import java.util.ArrayList;

import com.example.dbm.ExpandableListAdapter;
import com.example.dbm.Item;
import com.example.dbm.R;
import com.example.dbm.R.layout;
import com.example.dbm.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.Button;
import android.widget.ExpandableListView;

public class UserBidsInfo extends Activity {
	private ExpandableListView mExpandableList;


	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.expandable_list);

		mExpandableList = (ExpandableListView)findViewById(R.id.lvExp);

		final ArrayList<Item> arrayParents = new ArrayList<Item>();
		ArrayList<String> arrayChildren = new ArrayList<String>();
	

		//here we set the parents and the children
		for (int i = 0; i < 5; i++)
		{
			//for each "i" create a new Parent object to set the title and the children
			arrayChildren.add("array " + i);
			Item parent = new Item();
			parent.setTitle("Bid " + i);
			parent.setArrayChildren(arrayChildren);

			//in this array we add the Parent object. We will use the arrayParents at the setAdapter
			arrayParents.add(parent);
		}

		//sets the adapter that provides data to the list.
		mExpandableList.setAdapter(new ExpandableListAdapter(this,arrayParents,1));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.user_bids_info, menu);
		return true;
	}

}
