package com.storm.smart.test;

import org.json.JSONException;

import com.robotium.solo.Solo;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.storm.smart.LogoActivity;
import com.storm.smart.R;
import com.storm.smart.activity.GuideActivity;
import com.storm.smart.activity.MainActivity;
import com.storm.smart.activity.SearchResultActivity;
import com.storm.tools.HttpGet;

public class SearchTest extends ActivityInstrumentationTestCase2<LogoActivity> {
	private Solo solo;
	private Button searchButton;
	private EditText searchEditText;
	private String defaultSearchKey;
	private String defkey = null;
	public SearchTest(){
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
	public void test2() throws Exception{
		solo.clickOnView(solo.getView(R.id.web_page_head_search));
		solo.sleep(1000);
		assertTrue(solo.waitForActivity(SearchResultActivity.class,6000));
		searchEditText = (EditText)solo.getCurrentActivity().findViewById(R.id.search_textinput);
//		searchEditText = (EditText)solo.getView(R.id.search_textinput);
//		defaultSearchKey = searchEditText.getText().toString();
		defaultSearchKey = searchEditText.getHint().toString();
		Log.d("search","msg" + defaultSearchKey);
		System.out.println("msg" + defaultSearchKey);
//		solo.clickOnView(solo.getView(R.id.search_search));
		String s = HttpGet.sendGet("http://192.168.90.43/search_keyword.php", "platf=android&limit=30");
		try{
			defkey = HttpGet.jsonArr(HttpGet.jsonOb(s, "result"), "default");
		}catch(JSONException e){
			e.printStackTrace();
		}	
		assertEquals(defkey,defaultSearchKey);	
	}
	@Override
	protected void tearDown() throws Exception{
		super.tearDown();
		solo.finishOpenedActivities();
	}

}
