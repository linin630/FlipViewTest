package com.linin.flipview.test;

import com.aphidmobile.flip.FlipViewController.ViewFlipListener;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FlipView4 extends FlipView1 implements ViewFlipListener{
	
	TextView refresh;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.flipview);
		ViewGroup frame = (ViewGroup) findViewById(R.id.framelayout);
		frame.addView(flipView);
		flipView.setOnViewFlipListener(this);
		refresh = (TextView) findViewById(R.id.text_refresh);
	}

	@Override
	public void onViewFlipped(View view, int position) {
		refresh.setVisibility(View.INVISIBLE);
	}

	@Override
	public boolean top(float angle) {
		refresh.setVisibility(View.VISIBLE);
		if(angle>180-45){
			refresh.setText("↓下拉刷新");
		}else{
			refresh.setText("↑松开刷新");
			return false;//返回false则调用一次结束，等松开手后才能再调用top方法
		}
		return true;//返回true则无限调用
	}

	@Override
	public boolean bottom(float angle) {
		return false;
	}
}
