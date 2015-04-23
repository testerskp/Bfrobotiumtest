package com.storm.smart.test;

import android.widget.TextView;

import com.storm.smart.activity.ConfigActivity;
import com.storm.smart.basictest.BasicTestCase;
import com.storm.smart.R;

public class Setting extends BasicTestCase {
	private TextView titleTextView;
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void test16() throws Exception{
		getSolo().clickOnView(getSolo().getView(R.id.web_page_head_slidememu));
		getSolo().sleep(1000);
		getSolo().clickOnView(getSolo().getView(R.id.slide_menu_setting));
		assertTrue(getSolo().waitForActivity(ConfigActivity.class,3000));
		assertTrue(getSolo().searchText("本地播放设置"));
	}
}
