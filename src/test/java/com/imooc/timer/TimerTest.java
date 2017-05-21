package com.imooc.timer;

import java.util.Calendar;
import java.util.Timer;

/**
 * 测试定时打印任务
 */
public class TimerTest {
	public static void main(String[] args) throws InterruptedException {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.SECOND, 10);
		Timer timer = new Timer();
		PrintTimerTask task1 = new PrintTimerTask();
		PrintTimerTask task2 = new PrintTimerTask();
		task1.setName("thread 1");
		task2.setName("thread 2");
		timer.schedule(task1, 2000L, 1000L);
		timer.schedule(task2, 1000L,1000L);
		System.out.println(timer.purge());
		task2.cancel();
		System.out.println(timer.purge());
//		timer.cancel();
//		System.out.println(timer.purge());
	}
}
