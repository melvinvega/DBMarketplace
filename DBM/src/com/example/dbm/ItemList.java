package com.example.dbm;

import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class ItemList extends Activity {

	private ExpandableListView mExpandableList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_item_list);
	 
	mExpandableList = (ExpandableListView)findViewById(R.id.lvExp);
	 
	final ArrayList<Item> arrayParents = new ArrayList<Item>();
	ArrayList<String> arrayChildren = new ArrayList<String>();
	arrayChildren.add("Child");
	 
	//here we set the parents and the children
	for (int i = 0; i < 5; i++){
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
	mExpandableList.setAdapter(new ExpandableListAdapter(this,arrayParents));
	}
	}
