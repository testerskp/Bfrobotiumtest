package com.storm.smart.test;

import android.widget.TextView;

import com.storm.smart.basictest.BasicTestCase;
import com.storm.smart.R;

public class ChouTi extends BasicTestCase{
	private TextView loginTextView;
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void test7() throws Exception{
		getSolo().clickOnView(getSolo().getView(R.id.web_page_head_slidememu));
		loginTextView = (TextView)getSolo().getView(R.id.slide_menu_login_text);
		assertEquals("µã»÷µÇÂ¼>",loginTextView.getText());
		
	}
}
