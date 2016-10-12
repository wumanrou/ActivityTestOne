package com.example.activitytestone;

import com.example.activitytextone.R;

import activity.MainActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends Activity {

	private static final String TAG="WelcomeActivity";
	
	Button btnWelcome;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		
		Log.i(TAG,"����WelcomeActivity");
		
		btnWelcome=(Button) this.findViewById(R.id.btnwelcome);
		btnWelcome.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				//ͨ��Intentʵ��Activity���л�
				Intent intent=new Intent(WelcomeActivity.this,MainActivity.class);				
				startActivity(intent);
				Log.d(TAG,"����Activity�л���----MainActivity");
			}
		});
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}

}

