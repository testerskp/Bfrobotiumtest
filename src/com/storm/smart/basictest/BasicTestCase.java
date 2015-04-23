package com.storm.smart.basictest;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;

import com.storm.smart.LogoActivity;
import com.storm.smart.R;
import com.storm.smart.activity.GuideActivity;
import com.storm.smart.activity.MainActivity;

abstract public class BasicTestCase extends ActivityInstrumentationTestCase2<LogoActivity>{
	
	private Solo solo;
	public BasicTestCase(){
		super(LogoActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
		solo = new Solo(getInstrumentation(),getActivity());
		if(solo.waitForActivity(GuideActivity.class,5000)){
			solo.sleep(1000);
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
	}
	
	@Override
	protected void tearDown() throws Exception{
		solo.finishOpenedActivities();
		super.tearDown();
	}
	
	public Solo getSolo(){
		return solo;
	}
	
}
