package cn.shanshuan.customview;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class customView extends View{
	ArrayList<HashMap<String, String>> list;
	int viewWidth,viewHeight;
	public customView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public customView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public customView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	//负责绘制界面
	@Override
	protected void onDraw(Canvas canvas) {
		Paint paint=new Paint();
		paint.setColor(Color.BLACK);
		Rect rect=new Rect(0, 0, viewWidth, viewHeight);
		canvas.drawRect(rect, paint);
		//画文字
		paint.setColor(Color.WHITE);
		paint.setTextSize(60);
		int gap=(viewWidth-60)/(list.size()-1);
		for (int i = 0; i < list.size(); i++) {
			HashMap<String, String> map=list.get(i);
			String time=map.get("time");
			canvas.drawText(time, i*gap, viewHeight, paint);
		}
	}
	
	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		viewWidth=w;
		viewHeight=h;
	}

	public void setData(ArrayList<HashMap<String, String>> data) {
		list=data;
		
	}
}
