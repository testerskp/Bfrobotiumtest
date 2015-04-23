package com.storm.smart.test;

import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.robotium.solo.Solo;
import com.storm.smart.basictest.BasicTestCase;
import com.storm.smart.R;

public class FanKui extends BasicTestCase {
	private TextView tiTextView;
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void test17() throws Exception{
		getSolo().clickOnView(getSolo().getView(R.id.web_page_head_slidememu));
		getSolo().sleep(1000);
		getSolo().clickOnView(getSolo().getView(R.id.slide_menu_feedback));
		getSolo().sleep(1000);
		RelativeLayout rl = (RelativeLayout)getSolo().getView(R.id.umeng_fb_conversation_header);
		tiTextView = (TextView)rl.getChildAt(1);
		Log.d("solo",tiTextView.getText().toString());
		assertEquals("”√ªß∑¥¿°",tiTextView.getText());
	}
}
