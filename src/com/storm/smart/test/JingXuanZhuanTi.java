package com.storm.smart.test;

import android.widget.TextView;

import com.storm.smart.activity.ChoiceTopicActivity;
import com.storm.smart.basictest.BasicTestCase;
import com.storm.smart.R;

public class JingXuanZhuanTi extends BasicTestCase{
	private TextView choiceTopicTextView;
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void test11() throws Exception{
		getSolo().clickOnView(getSolo().getView(R.id.web_page_head_slidememu));
		getSolo().sleep(1000);
		getSolo().clickOnView(getSolo().getView(R.id.slide_menu_topic));
		assertTrue(getSolo().waitForActivity(ChoiceTopicActivity.class,3000));
		choiceTopicTextView = (TextView)getSolo().getView(R.id.topic_list_title);
		assertEquals("精选专题",choiceTopicTextView.getText());
		
	}
}
