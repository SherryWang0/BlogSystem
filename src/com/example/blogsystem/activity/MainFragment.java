package com.example.blogsystem.activity;

import com.example.blogsystem.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment
{
	private int type;
	public MainFragment(int type)
	{
		this.type = type;
	}
	@Override
	public void onActivityCreated(Bundle savedInstanceState)
	{
		super.onActivityCreated(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View view = null;
		if(type == 0)
			view = inflater.inflate(R.layout.send_message_layout, null);
		else if(type == 1)
			view = inflater.inflate(R.layout.relationship_layout, null);
		else if(type == 2)
			view = inflater.inflate(R.layout.search_layout, null);
		else if(type == 3)
			view = inflater.inflate(R.layout.my_layout, null);
		return view;
	}
}
