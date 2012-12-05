package com.linin.flipview.test;

import com.aphidmobile.flip.FlipViewController;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FlipView2 extends Activity{
	
	public FlipViewController flipView;
	
	protected void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		flipView = new FlipViewController(this,false);
		flipView.setAdapter(new myAdapter(this, 10));
		setContentView(flipView);
	}
}

class myAdapter extends BaseAdapter{
	
	private Context context;
	private int count;
	
	public myAdapter(Context context,int count){
		this.context = context;
		this.count = count;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = convertView;
		if(convertView == null){
			view = LayoutInflater.from(context).inflate(R.layout.item_flip, null);//加载自定义的布局文件
		}
		TextView text = (TextView) view.findViewById(R.id.text_flip);
		text.setText(position+"");
		ImageView image = (ImageView) view.findViewById(R.id.image_flip);
		image.setImageResource(R.drawable.background);//这里可以按position设置不同图片，为了快点就不弄了
		return view;
	}
	
}