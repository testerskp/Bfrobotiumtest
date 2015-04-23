package com.storm.smart.test;

import android.widget.TextView;

import com.storm.smart.ad.AdWebViewActivity;
import com.storm.smart.basictest.BasicTestCase;
import com.storm.smart.R;

public class LunTan extends BasicTestCase {
	private TextView titleTextView;
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void test15() throws Exception{
		getSolo().clickOnView(getSolo().getView(R.id.web_page_head_slidememu));
		getSolo().sleep(1000);
		getSolo().clickOnView(getSolo().getView(R.id.slide_menu_forum));
		assertTrue(getSolo().waitForActivity(AdWebViewActivity.class,3000));
		titleTextView = (TextView)getSolo().getView(R.id.user_system_add_item_tips);
		assertEquals("ÉçÇø",titleTextView.getText());
	}
}
