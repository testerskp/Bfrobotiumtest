package com.storm.smart.test;

import android.widget.TextView;

import com.storm.smart.R;
import com.storm.smart.basictest.BasicTestCase;

public class GameBtu extends BasicTestCase{
	private TextView tabView;
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void test5() throws Exception{
		getSolo().clickOnView(getSolo().getView(R.id.web_page_head_recommend));
		getSolo().sleep(2000);
		tabView = (TextView)getSolo().getView(R.id.title_content_tv);
		assertEquals("暴风游戏中心",tabView.getText());
	}
}
