package com.storm.smart.test;

import org.json.JSONException;

import android.util.Log;
import android.widget.EditText;

import com.storm.smart.R;
import com.storm.smart.activity.SearchResultActivity;
import com.storm.smart.basictest.BasicTestCase;
import com.storm.tools.HttpGet;

public class SreachBtu extends BasicTestCase{
	private EditText searchEditText;
	private String defaultSearchKey;
	private String defkey;
	
	
	@Override
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void test2() throws Exception{
		getSolo().clickOnView(getSolo().getView(R.id.web_page_head_search));
		getSolo().sleep(1000);
		assertTrue(getSolo().waitForActivity(SearchResultActivity.class,6000));
		searchEditText = (EditText)getSolo().getCurrentActivity().findViewById(R.id.search_textinput);
		defaultSearchKey = searchEditText.getHint().toString();
		Log.d("search","msg" + defaultSearchKey);
		String s = HttpGet.sendGet("http://search.shouji.baofeng.com/search_keyword.php", "platf=android&limit=30");
		try{
			defkey = HttpGet.jsonArr(HttpGet.jsonOb(s, "result"), "default");
		}catch(JSONException e){
			e.printStackTrace();
		}
		Log.d("search",defkey);
		assertEquals(defkey,defaultSearchKey);	
	}
	

}
