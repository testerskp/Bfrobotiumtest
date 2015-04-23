package com.storm.smart.test;

import com.storm.smart.activity.LocalActivity;
import com.storm.smart.basictest.BasicTestCase;
import com.storm.smart.R;

public class TongWu extends BasicTestCase {
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void test14() throws Exception{
		getSolo().clickOnView(getSolo().getView(R.id.web_page_head_slidememu));
		getSolo().sleep(1000);
		getSolo().clickOnView(getSolo().getView(R.id.slide_menu_protocol));
		assertTrue(getSolo().waitForActivity(LocalActivity.class,3000));
		assertTrue(getSolo().searchText("Í¬ÎÝ¿´Æ¬"));
		
	}
}
