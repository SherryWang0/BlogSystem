package com.example.blogsystem.activity;

import com.example.blogsystem.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

public class WelcomeActivity extends Activity
{
	private TextView my;
	private TextView blog;
	private TextView by;
	private Handler handler = new Handler();
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.welcome_layout);
		my = (TextView)findViewById(R.id.my);
		blog = (TextView)findViewById(R.id.blog);
		by = (TextView)findViewById(R.id.by);
		AlphaAnimation aa = new AlphaAnimation(0, 1);
		aa.setDuration(4000);
		aa.setFillAfter(true);
		my.setAnimation(aa);
		blog.setAnimation(aa);
		by.setAnimation(aa);
		handler.postDelayed(new Runnable()
		{
			@Override
			public void run()
			{
				Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
				startActivity(intent);
				finish();
			}
		}, 4000);
	}
}
