package com.jack.paomadeng;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class text2 extends Activity {
	
	private MarqueeText text2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text2);
		text2=(MarqueeText) findViewById(R.id.test);
	}
	public void start(View view){
		text2.startScroll();
	}
	
	public void stop(View v){
		text2.stopScroll();
		}
		public void startFor0(View v){
			text2.startFor0();
		}		
}
