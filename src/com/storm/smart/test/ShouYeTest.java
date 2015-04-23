package com.storm.smart.test;

import android.widget.TextView;

import com.robotium.solo.Solo;
import com.storm.smart.basictest.BasicTestCase;
import com.storm.smart.R;

public class ShouYeTest extends BasicTestCase{
	private TextView tabview;
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void test1() throws Exception{
		getSolo().sleep(1500);
		tabview = (TextView)getSolo().getView(R.id.tab_title);
		assertEquals("ÍÆ¼ö",tabview.getText());
	}
}
