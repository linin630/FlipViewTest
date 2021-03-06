package com.linin.flipview.test;

import com.aphidmobile.flip.FlipViewController;
import com.aphidmobile.flip.FlipViewController.ViewFlipListener;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class FlipView3 extends FlipView2 implements ViewFlipListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		flipView = new FlipViewController(this);
		flipView.setOnViewFlipListener(this);
		flipView.setAdapter(new myAdapter(this, 3));
		setContentView(flipView);
	}

	@Override
	public void onViewFlipped(View view, int position) {
		Toast.makeText(this, "current:"+position, Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean top(float angle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean bottom(float angle) {
		// TODO Auto-generated method stub
		return false;
	}
}