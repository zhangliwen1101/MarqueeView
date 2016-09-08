package com.jack.paomadeng;

import java.util.ArrayList;
import java.util.List;

import com.jack.paomadeng.view.MarqueeView;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class text3 extends Activity{

	private ViewFlipper viewflipper;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text3);
		viewflipper=(ViewFlipper) findViewById(R.id.viewflipper1);
		viewflipper.setAutoStart(true);
		 MarqueeView mMarquee1 = (MarqueeView) findViewById(R.id.mv_bar1);
	       
		  List<String> items = new ArrayList<>();
	        items.add("这是第1个");
	        items.add("这是第2个");
	        items.add("这是很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长很长的第3个");
	        items.add("这是第4个");
	        items.add("这是第5个");
	        items.add("这是第6个");
	        items.add("这是第7个");
	        mMarquee1.startWithList(items);
	        mMarquee1.setOnItemClickListener(new MarqueeView.OnItemClickListener() {
	            @Override
	            public void onItemClick(int position, TextView textView) {
	                Toast.makeText(text3.this, textView.getText().toString(), Toast.LENGTH_SHORT).show();
	            }
	        });
	}
	  
}
