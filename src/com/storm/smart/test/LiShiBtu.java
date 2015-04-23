package com.storm.smart.test;

import android.widget.TextView;

import com.storm.smart.activity.UserSystemActivity;
import com.storm.smart.basictest.BasicTestCase;
import com.storm.smart.R;

public class LiShiBtu extends BasicTestCase{
	private TextView tabviwe;
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void test3() throws Exception{
		getSolo().clickOnView(getSolo().getView(R.id.web_page_head_history));
		assertTrue(getSolo().waitForActivity(UserSystemActivity.class,3000));
		tabviwe = (TextView)getSolo().getView(R.id.tab_title);
		assertEquals("≤•∑≈¿˙ ∑",tabviwe.getText());
		
	}
}
