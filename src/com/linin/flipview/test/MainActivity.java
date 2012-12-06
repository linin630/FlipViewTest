package com.linin.flipview.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity implements OnItemClickListener {
	
	private ListView list;
	private List<Map<String,Object>> items;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initItems();
		list = (ListView) findViewById(R.id.list_main);
		list.setOnItemClickListener(this);
		list.setAdapter(new SimpleAdapter(this, items, android.R.layout.simple_expandable_list_item_1, new String[]{"title"}, new int[]{android.R.id.text1}));
	}
	
	private void initItems(){
		items = new ArrayList<Map<String,Object>>();
		addItem("flipView的简单使用", FlipView1.class);
		addItem("flipView自定义布局", FlipView2.class);
		addItem("flipView监听器", FlipView3.class);
		addItem("flipView下拉效果", FlipView4.class);
	}
	private void addItem(String title,Class<?> cls){
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("title", title);
		map.put("class", cls);
		items.add(map);
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		@SuppressWarnings("unchecked")
		Map<String, Object> map = (Map<String, Object>) parent.getItemAtPosition(position);
		startActivity(new Intent(this,(Class<?>) map.get("class")));
	}

}
