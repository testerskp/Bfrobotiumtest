package com.storm.smart.test;

import android.widget.TextView;

import com.storm.smart.basictest.BasicTestCase;
import com.storm.smart.R;

public class GameChannel extends BasicTestCase {
	private TextView tabView;
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void test13() throws Exception{
		getSolo().clickOnView(getSolo().getView(R.id.web_page_head_slidememu));
		getSolo().sleep(1000);
		getSolo().clickOnView(getSolo().getView(R.id.slide_menu_game));
		getSolo().sleep(2000);
		tabView = (TextView)getSolo().getView(R.id.title_content_tv);
		assertEquals("暴风游戏中心",tabView.getText());
	}
}
