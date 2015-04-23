package com.storm.smart.test;

import com.robotium.solo.Solo;
import com.storm.smart.R;
import com.storm.smart.basictest.BasicTestCase;

public class MoreChannel extends BasicTestCase {
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void test6() throws Exception{
		getSolo().clickOnView(getSolo().getView(R.id.webactivity_show_more_channel));
		getSolo().sleep(2000);
		assertTrue(getSolo().searchText("自定义我的频道"));
	}
}
