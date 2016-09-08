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
	        items.add("���ǵ�1��");
	        items.add("���ǵ�2��");
	        items.add("���Ǻܳ��ܳ��ܳ��ܳ��ܳ��ܳ��ܳ��ܳ��ܳ��ܳ��ܳ��ܳ��ܳ��ܳ��ܳ��ܳ��ĵ�3��");
	        items.add("���ǵ�4��");
	        items.add("���ǵ�5��");
	        items.add("���ǵ�6��");
	        items.add("���ǵ�7��");
	        mMarquee1.startWithList(items);
	        mMarquee1.setOnItemClickListener(new MarqueeView.OnItemClickListener() {
	            @Override
	            public void onItemClick(int position, TextView textView) {
	                Toast.makeText(text3.this, textView.getText().toString(), Toast.LENGTH_SHORT).show();
	            }
	        });
	}
	  
}
