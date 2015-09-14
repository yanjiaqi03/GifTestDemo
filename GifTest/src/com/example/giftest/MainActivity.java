package com.example.giftest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	private MyGifView mGif;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mGif = (MyGifView) findViewById(R.id.gif2);
		mGif.setMovieResource(R.raw.rabbit);
		mGif.setClickable(true);
		mGif.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (mGif.isPaused()) {
					mGif.setPaused(false);
				}else {
					mGif.setPaused(true);
				}
			}
		});
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		mGif.setVisibility(View.GONE);
	}
	@Override
	protected void onResume() {
		super.onResume();
		mGif.setVisibility(View.VISIBLE);
	}
}