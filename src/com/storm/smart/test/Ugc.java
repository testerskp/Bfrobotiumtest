package com.storm.smart.test;

import android.widget.TextView;

import com.storm.smart.activity.TenMinutesActivity;
import com.storm.smart.basictest.BasicTestCase;
import com.storm.smart.R;

public class Ugc extends BasicTestCase{
	private TextView tenminView;
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void test9() throws Exception{
		getSolo().clickOnView(getSolo().getView(R.id.web_page_head_slidememu));
		getSolo().sleep(1000);
		getSolo().clickOnView(getSolo().getView(R.id.slide_menu_ugc));
		assertTrue(getSolo().waitForActivity(TenMinutesActivity.class,3000));
		tenminView = (TextView)getSolo().getView(R.id.ten_minutes_top_tips);
		assertEquals(" Æ∑÷÷”",tenminView.getText());
	}
}
