package com.example.wuziqi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Intent intent = new Intent(MainActivity.this,MusicServer.class);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		startService(intent);

	}


	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.meun_main, menu);
		return true;
	}

    public void Onemoregame(View view){

		onCreate(null);

    }

	public void Quit(View view) {
		finish();
	}



	protected void onStop(){
		Intent intent = new Intent(MainActivity.this,MusicServer.class);
		stopService(intent);
		super.onStop();

	}

	public void Aboutme(MenuItem item) {
		Intent intent=new Intent(MainActivity.this,Aboutme.class);
		startActivity(intent);
	}
}
