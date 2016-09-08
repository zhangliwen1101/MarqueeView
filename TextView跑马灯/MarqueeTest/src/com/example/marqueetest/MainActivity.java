package com.example.marqueetest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class MainActivity extends Activity {
  ListView mListView ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mListView=(ListView)findViewById(R.id.listView1);
		String from[] ={"a","b"};
	
		int to [] ={android.R.id.text1,android.R.id.text2};
		SimpleAdapter  adapter= new SimpleAdapter(this, getData(), R.layout.item, from, to);
		mListView.setAdapter(adapter);
	}

	
	
	private ArrayList<HashMap<String,String>> getData(){
		ArrayList<HashMap<String,String>> list=new ArrayList<HashMap<String,String>>();
		HashMap<String,String> h1= new HashMap<String, String>();
		h1.put("a", "android:marqueeRepeatLimit在ellipsize指定marquee的情况下，设置重复滚动的次数，当设置为 marquee_forever时表示无限次");
		h1.put("b", "android:focusableInTouchMode：是否在触摸模式下获得焦点。android:focusable控件是否能够获取焦点");
		list.add(h1);
		
		HashMap<String,String> h2= new HashMap<String, String>();
		h2.put("a", "其实现只需在xml中对textview的ellipsize属性做相应的设置即可。android:ellipsize=marquee 跑马灯显示");
		h2.put("b", "android:ellipsize=start 省略号在开头 android:ellipsize=middle省略号在中间        android:ellipsize=end省略号在结尾   ");
		list.add(h2);
		
	
		HashMap<String,String> h3= new HashMap<String, String>();
		h3.put("a", "Android系统中TextView实现跑马灯效果，必须具备以下几个条件");
		h3.put("b", "1、android:ellipsize=marquee TextView必须单行显示，即内容必须超出TextView大小3、TextView要获得焦点才能滚动   ");
		list.add(h3);
		
		return list;
	}

}
