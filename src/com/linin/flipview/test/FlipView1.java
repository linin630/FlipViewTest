package com.linin.flipview.test;

import com.aphidmobile.flip.FlipViewController;

import android.R.color;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class FlipView1 extends Activity{
	
	private FlipViewController flipView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		flipView = new FlipViewController(this);
		flipView.setAdapter(new BaseAdapter() {
			
			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				TextView text = null;
				if(convertView == null){
					text = new TextView(parent.getContext());
					text.setText(position+"");
					text.setTextSize(360);
					text.setGravity(Gravity.CENTER);
					text.setBackgroundColor(Color.WHITE);//color.whiteÊÇÍ¸Ã÷°×
				}else{
					text = (TextView) convertView;
					text.setText(position+"");
				}
				return text;
			}
			
			@Override
			public long getItemId(int position) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Object getItem(int position) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return 10;
			}
		});
		setContentView(flipView);
	}
}
