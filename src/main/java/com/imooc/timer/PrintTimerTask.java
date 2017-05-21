package com.imooc.timer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

/**
 * 定时打印功能
 *
 */
public class PrintTimerTask extends TimerTask{

	private static final DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private String name;
	Calendar calendar=Calendar.getInstance();
	int count=0;
	@Override
	public void run() {
		System.out.println(this.getName()+" current time is "+format.format(calendar.getTime()));
		count++;
		if(count>2&&"thread 1".equals(this.getName())){
			this.cancel();
			System.out.println("task canceled");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
