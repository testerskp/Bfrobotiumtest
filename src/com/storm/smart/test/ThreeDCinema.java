package com.storm.smart.test;

import android.widget.TextView;

import com.storm.smart.activity.CinemaActivity;
import com.storm.smart.basictest.BasicTestCase;
import com.storm.smart.R;

public class ThreeDCinema extends BasicTestCase {
	private TextView cinemaTextView;
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void test12() throws Exception{
		getSolo().clickOnView(getSolo().getView(R.id.web_page_head_slidememu));
		getSolo().sleep(1000);
		getSolo().clickOnView(getSolo().getView(R.id.slide_menu_3d_movie));
		assertTrue(getSolo().waitForActivity(CinemaActivity.class,3000));
		cinemaTextView = (TextView)getSolo().getView(R.id.activity_3d_cinema_title);
		assertEquals("3DӰԺ",cinemaTextView.getText());
	}
}
