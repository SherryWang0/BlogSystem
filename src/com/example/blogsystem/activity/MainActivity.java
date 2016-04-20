package com.example.blogsystem.activity;

import com.example.blogsystem.R;
import com.example.blogsystem.utils.TabAdapter;
import com.viewpagerindicator.TabPageIndicator;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Window;

public class MainActivity extends FragmentActivity
{
	private TabPageIndicator tpi;
	private ViewPager viewPager;
	private TabAdapter tabAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main_layout);
		tpi = (TabPageIndicator)findViewById(R.id.indicator);
		viewPager = (ViewPager)findViewById(R.id.view_pager);
		tabAdapter = new TabAdapter(getSupportFragmentManager());
		viewPager.setAdapter(tabAdapter);
		tpi.setViewPager(viewPager, 0);
	}
}