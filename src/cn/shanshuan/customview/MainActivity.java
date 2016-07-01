package cn.shanshuan.customview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	customView customView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		customView=(cn.shanshuan.customview.customView) findViewById(R.id.v);
		customView.setData(getData());
	}
	public ArrayList<HashMap<String, String>> getData(){
		HashMap<String, String> map1=new HashMap<String, String>();
		map1.put("time", "9");
		map1.put("price", "1000");
		HashMap<String, String> map2=new HashMap<String, String>();
		map2.put("time", "10");
		map2.put("price", "2500");
		HashMap<String, String> map3=new HashMap<String, String>();
		map3.put("time", "11");
		map3.put("price", "3500");
		HashMap<String, String> map4=new HashMap<String, String>();
		map4.put("time", "13");
		map4.put("price", "5000");
		ArrayList<HashMap<String, String>> list=new ArrayList<HashMap<String,String>>();
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		return list;
	}
}
