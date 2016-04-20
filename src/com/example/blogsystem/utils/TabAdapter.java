package com.example.blogsystem.utils;

import com.example.blogsystem.activity.MainFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter
{
	private String[] title = {"博客", "关系", "搜索", "我"};
	
	public TabAdapter(FragmentManager fm)
	{
		super(fm);
	}

	@Override
	public Fragment getItem(int arg0)
	{
		MainFragment mf = new MainFragment(arg0);
		return mf;
	}

	@Override
	public int getCount()
	{
		return title.length;
	}
	@Override
	public CharSequence getPageTitle(int position)
	{
		return title[position%title.length];
	}
}
