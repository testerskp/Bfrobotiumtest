package com.storm.smart.test;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import com.storm.smart.LogoActivity;
import com.storm.smart.activity.GuideActivity;
import com.storm.smart.activity.MainActivity;
import com.storm.smart.R;

public class MainTest extends ActivityInstrumentationTestCase2<LogoActivity>{
	private Solo solo;
	private TextView view;
	public MainTest(){
		super(LogoActivity.class);
	}
	@Override
	protected void setUp() throws Exception{
		super.setUp();
		solo = new Solo(getInstrumentation(),getActivity());
		if(solo.waitForActivity(GuideActivity.class,5000)){
			solo.scrollToSide(Solo.RIGHT,0.7f);		//左划
			solo.scrollToSide(Solo.RIGHT,0.7f);
			solo.scrollToSide(Solo.RIGHT,0.7f);
			try{
				if(solo.waitForView(R.id.app_bind_item_checkBox)){
						solo.clickOnCheckBox(0);
						solo.clickOnButton("进入暴风影音");			
				}else{
					solo.clickOnButton("进入暴风影音");
					}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		assertTrue(solo.waitForActivity(MainActivity.class,2000));
		if(solo.waitForView(R.id.main_voice_search_cancel)){
			solo.clickOnView(solo.getView(R.id.main_voice_search_cancel));
		}
			
	}
	public void test1() throws Exception{		
		solo.sleep(1500);
		view = (TextView)solo.getView(R.id.tab_title);
		assertEquals("推荐",view.getText());		
	}
	@Override
	protected void tearDown() throws Exception{
		solo.finishOpenedActivities();
		super.tearDown();

	}
}
