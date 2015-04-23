package com.storm.smart.test;

import android.widget.LinearLayout;
import android.widget.TextView;

import com.storm.smart.activity.CooperateActivity;
import com.storm.smart.basictest.BasicTestCase;
import com.storm.smart.R;

public class SoftChoice extends BasicTestCase {
	private TextView softTextView;
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void test13() throws Exception{
		getSolo().clickOnView(getSolo().getView(R.id.web_page_head_slidememu));
		getSolo().sleep(1000);
		getSolo().clickOnView(getSolo().getView(R.id.slide_menu_soft));
		assertTrue(getSolo().waitForActivity(CooperateActivity.class,3000));
		LinearLayout ll = (LinearLayout)getSolo().getView(R.id.activity_cooperate_root);
		LinearLayout lll = (LinearLayout)ll.getChildAt(0);
		softTextView = (TextView)lll.getChildAt(1);
		assertEquals("Èí¼þ¾«Ñ¡",softTextView.getText());
		
		
	}
}
