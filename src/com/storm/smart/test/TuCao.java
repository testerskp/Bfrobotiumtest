package com.storm.smart.test;

import android.widget.TextView;

import com.storm.smart.activity.BarrageTopicActivity;
import com.storm.smart.basictest.BasicTestCase;
import com.storm.smart.R;

public class TuCao extends BasicTestCase{
	private TextView tucaoTextView;
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void test10() throws Exception{
		getSolo().clickOnView(getSolo().getView(R.id.web_page_head_slidememu));
		getSolo().sleep(1000);
		getSolo().clickOnView(getSolo().getView(R.id.slide_menu_barrage));
		assertTrue(getSolo().waitForActivity(BarrageTopicActivity.class,3000));
		tucaoTextView = (TextView)getSolo().getView(R.id.web_topic_title);
		assertEquals("Õ¬≤€”–“‚Àº",tucaoTextView.getText());
		
	}
}
