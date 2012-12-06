package com.linin.flipview.test;

import com.aphidmobile.flip.FlipViewController;
import com.aphidmobile.flip.FlipViewController.ViewFlipListener;

import android.app.Activity;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean top(float angle) {
		if(angle>180-45){
			refresh.setText("������ˢ��");
		}else{
			refresh.setText("���ɿ�ˢ��");
			return false;//����false�����һ�ν��������ɿ��ֺ�����ٵ���top����
		}
		return true;//����true�����޵���
	}

	@Override
	public boolean bottom(float angle) {
		// TODO Auto-generated method stub
		return false;
	}
}
