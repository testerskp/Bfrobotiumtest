package com.storm.smart.test;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.storm.smart.R;
import com.storm.smart.activity.UserSystemActivity;
import com.storm.smart.basictest.BasicTestCase;

public class MyCollaction extends BasicTestCase {
	private TextView tabView;
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void test8() throws Exception{
		getSolo().clickOnView(getSolo().getView(R.id.web_page_head_slidememu));
		getSolo().sleep(1000);
		getSolo().clickOnView(getSolo().getView(R.id.slide_menu_collaction));
//		assertTrue(getSolo().waitForActivity(UserSystemActivity.class,3000));
//		getSolo().sleep(1000);
		assertTrue(getSolo().waitForView(TextView.class,0,2000));
		//通过父view，逐层找到相同id的子view
		HorizontalScrollView horizontalScrollView = getSolo().getCurrentViews(HorizontalScrollView.class).get(0); 
		LinearLayout ll = (LinearLayout)horizontalScrollView.getChildAt(0);
		RelativeLayout rl = (RelativeLayout)ll.getChildAt(1);
		tabView = (TextView)rl.findViewById(R.id.tab_title);
		assertEquals("我的收藏",tabView.getText());		
	}
}
