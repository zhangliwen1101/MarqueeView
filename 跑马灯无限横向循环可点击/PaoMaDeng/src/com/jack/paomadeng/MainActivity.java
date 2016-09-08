package com.jack.paomadeng;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	private Button button1;
	private Intent intennt;
	private TextView textview1;
	private final static String TAG="MainActivity";
	private ast wat;
	private Button button2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textview1=(TextView) findViewById(R.id.text1);
		button2=(Button) findViewById(R.id.button2);
		button2.setOnClickListener(this);
		wat=new ast();
		textview1.addTextChangedListener(wat);
		button1=(Button) findViewById(R.id.button1);
		button1.setOnClickListener(this);
		new Thread( new Runnable() {
			public void run() {
				
			}
		}).start();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			intennt=new Intent(MainActivity.this, text2.class);
			startActivity(intennt);
			break;
		case R.id.button2:
			intennt=new Intent(MainActivity.this, text3.class);
			startActivity(intennt);
			break;
		default:
			break;
		}
	}
	private class ast implements TextWatcher{

		@Override
		public void beforeTextChanged(CharSequence s, int start, int count, int after) {
			// TODO Auto-generated method stub
			Log.i(TAG, "beforeTextChanged s的值: "+s +" start: "+start+" after: "+ after);
		}

		@Override
		public void onTextChanged(CharSequence s, int start, int before, int count) {
			// TODO Auto-generated method stub
			Log.i(TAG, "onTextChanged s的值: "+s );
		}

		@Override
		public void afterTextChanged(Editable s) {
			// TODO Auto-generated method stub
			Log.i(TAG, "afterTextChanged s的值: "+s );
		}
		
	}
}
