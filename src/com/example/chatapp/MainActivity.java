package com.example.chatapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final EditText e1 = (EditText) findViewById(R.id.editText1);
        final EditText e2 = (EditText) findViewById(R.id.editText2);
 
        e1.setOnKeyListener(new OnKeyListener() {
			
			@Override
			public boolean onKey(View arg0, int arg1, KeyEvent arg2) {
				// TODO Auto-generated method stub
				String s1=e1.getText().toString().toLowerCase(),o="";

				if(s1.equals("hi")||s1.equals("hello"))
				{
						o="Hello there!";
				}
				else
					if(s1.equals("wassup"))
					{
						o="Nothing much";
					}
					
				
					else if(s1.contains("what")&& s1.contains("name"))
					{
						o="Watson";
					}
					else if(s1.contains("where") && s1.contains("live"))
							{
								o="In your computer";
							}
					else 
						{
							o="";
						}
				
				
				
				e2.setText(o);
				return false;
			}
		});
    }
    
}
