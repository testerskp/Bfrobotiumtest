package com.storm.smart.test;

import com.storm.smart.activity.LocalActivity;
import com.storm.smart.basictest.BasicTestCase;
import com.storm.smart.R;

public class LocalBtu extends BasicTestCase{
	
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void test4() throws Exception{
		getSolo().clickOnView(getSolo().getView(R.id.web_page_head_local));
		assertTrue(getSolo().waitForActivity(LocalActivity.class,3000));
		assertTrue(getSolo().searchText("±¾µØ»º´æ"));
		
	}
}
