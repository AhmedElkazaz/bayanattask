package com.example.display;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText eName=(EditText)findViewById(R.id.eName);
		final EditText eAge=(EditText)findViewById(R.id.eAge);
		final TextView tName=(TextView)findViewById(R.id.tName);
		final TextView tAge=(TextView)findViewById(R.id.tAge);
		tName.setVisibility(View.INVISIBLE);
		tAge.setVisibility(View.INVISIBLE);
		Button welcome=(Button)findViewById(R.id.result);
		welcome.setOnClickListener(new View.OnClickListener(){
			
			@Override
			public void onClick(View v) {
				
				String Name,Age;
				Name=eName.getText().toString();
				Age=eAge.getText().toString();
				tName.setText(getResources().getString(R.string.tName) +Name+"<"+getResources().getString(R.string.tName2));
				tAge.setText(getResources().getString(R.string.tAge) +Age+" " +getResources().getString(R.string.years)+"<"+getResources().getString(R.string.tAge2));
				tName.setVisibility(View.VISIBLE);
				tAge.setVisibility(View.VISIBLE);
				
				
				// TODO Auto-generated method stub
				
			}
		});;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
