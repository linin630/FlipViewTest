package com.linin.flipview.test;

import com.aphidmobile.flip.FlipViewController;
import com.aphidmobile.flip.FlipViewController.ViewFlipListener;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
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
	public void top() {
		Toast.makeText(this, "top!", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void bottom() {
		Toast.makeText(this, "bottom!", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onAngleChange(float angle,int index) {
//		if(index==0){
//			if(angle<180-30){
//				Log.i("test", "¡ýÏÂÀ­Ë¢ÐÂ");
//			}
//		}
	}
}