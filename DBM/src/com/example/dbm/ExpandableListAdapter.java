package com.example.dbm;


import java.util.ArrayList;

import com.example.dbm.main.MainActivity;
import com.example.dbm.user.ItemHasBeenRemoved;
import com.example.dbm.user.LogInInformation;



import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.Toast;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class ExpandableListAdapter extends BaseExpandableListAdapter implements ExpandableListView.OnGroupClickListener, ExpandableListView.OnChildClickListener {

	private LayoutInflater inflater;
	private ArrayList<Item> mParent;
	Context context1;
	Intent intent;
	int key;

	public ExpandableListAdapter(Context context, ArrayList<Item> parent,int inkey){
		mParent = parent;
		inflater = LayoutInflater.from(context);
		context1 = context;
		key = inkey;
	}

	@Override
	//counts the number of group/parent items so the list knows how many times calls getGroupView() method
	public int getGroupCount() {
		return mParent.size();
	}

	@Override
	//counts the number of children items so the list knows how many times calls getChildView() method
	public int getChildrenCount(int i) {
		return mParent.get(i).getArrayChildren().size();
	}

	@Override
	//gets the title of each parent/group
	public Object getGroup(int i) {
		return mParent.get(i).getTitle();
	}

	@Override
	//gets the name of each item
	public Object getChild(int i, int i1) {
		return mParent.get(i).getArrayChildren().get(i1);
	}

	@Override
	public long getGroupId(int i) {
		return i;
	}

	@Override
	public long getChildId(int i, int i1) {
		return i1;
	}

	@Override
	public boolean hasStableIds() {
		return true;
	}

	@Override
	//in this method you must set the text to see the parent/group on the list
	public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {

		if (view == null) {view = inflater.inflate(R.layout.list_group, viewGroup,false);}

		TextView textView = (TextView) view.findViewById(R.id.lblListHeader);
		//"i" is the position of the parent/group in the list
		textView.setText(getGroup(i).toString());

		//return the entire view
		return view;
	}

	@Override
	//in this method you must set the text to see the children on the list
	public View getChildView(final int parent_position, int child_position, boolean b, View view, ViewGroup viewGroup) {

		final String childText = (String) getChild(parent_position, child_position);	

		switch (key) {

		//ItemList
		case 0:
			if(child_position == 6)
			{
				view = inflater.inflate(R.layout.list_item_last, null);

				Button bid = (Button) view.findViewById(R.id.bid_item);
				bid.setOnClickListener(new OnClickListener() {public void onClick(View v) {
					v.getContext().startActivity(new Intent(context1,BidAmmount.class));
				}});

				Button buy = (Button) view.findViewById(R.id.buy_item);
				buy.setOnClickListener(new OnClickListener() {public void onClick(View v) {
					Toast.makeText(context1,"Item added to cart",Toast.LENGTH_SHORT).show();
				}});
			}

			else {
				view = inflater.inflate(R.layout.list_item, null);
				TextView txtListChild = (TextView) view.findViewById(R.id.text_view_item);
				txtListChild.setText(childText);
			}
			break;


			//BidList	
		case 1:
			view = inflater.inflate(R.layout.list_item, null);
			TextView txtListChild = (TextView) view.findViewById(R.id.text_view_item);
			txtListChild.setText(childText);
			break;

			//ShoppingCart
		case 2:
			
			if(childText == ".")
			{
				view = inflater.inflate(R.layout.list_checkout, null);
				Button checkout = (Button) view.findViewById(R.id.checkout);
				checkout.setOnClickListener(new OnClickListener() {public void onClick(View v) {
					Toast.makeText(context1,"Payment has been Processed",Toast.LENGTH_SHORT).show();
				
				}});
			}
/*
			if(childText == " " )
			{
				view = inflater.inflate(R.layout.list_remove_cart, null);
				Button remove = (Button) view.findViewById(R.id.remove_from_cart);
				remove.setOnClickListener(new OnClickListener() {public void onClick(View v) {
					v.getContext().startActivity(new Intent(context1,ItemHasBeenRemoved.class));
				
				}});
			}
			*/
			else {
				view = inflater.inflate(R.layout.list_item, null);
				TextView txtListChild1 = (TextView) view.findViewById(R.id.text_view_item);
				txtListChild1.setText(childText);
			}
			break;

		default:
			break;
		}

		return view;
	}

	@Override
	public boolean isChildSelectable(int i, int i1) {
		return true;
	}

	@Override
	public boolean onChildClick(ExpandableListView parent, View v,
			int groupPosition, int childPosition, long id) {


		return false;
	}

	@Override
	public boolean onGroupClick(ExpandableListView parent, View v,
			int groupPosition, long id) {
		// TODO Auto-generated method stub
		return false;
	}
}