package com.abhi.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.abhi.algos.MeetingScheduler;
import com.abhi.ds.Event;

public class TestMeetingScheduler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Event> events=new ArrayList<>();
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY,20);
		cal.set(Calendar.MINUTE,00);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);
		
		Long startTime1=cal.getTimeInMillis();
		
		cal.set(Calendar.HOUR_OF_DAY,22);
		cal.set(Calendar.MINUTE,30);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);
		
		Long endTime1=cal.getTimeInMillis();
		
		Event event=new Event(startTime1, endTime1);
		
		events.add(event);
		
		
		cal.set(Calendar.HOUR_OF_DAY,16);
		cal.set(Calendar.MINUTE,00);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);
		
		Long startTime=cal.getTimeInMillis();
		
		cal.set(Calendar.HOUR_OF_DAY,16);
		cal.set(Calendar.MINUTE,30);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);
		
		Long endTime=cal.getTimeInMillis();
		
		
		
		Event event1=new Event(startTime,endTime);
		
		events.add(event1);

		cal.set(Calendar.HOUR_OF_DAY,16);
		cal.set(Calendar.MINUTE,15);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);
		
		 startTime=cal.getTimeInMillis();
		
		cal.set(Calendar.HOUR_OF_DAY,17);
		cal.set(Calendar.MINUTE,30);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);
		
		endTime=cal.getTimeInMillis();
		
	Event event2=new Event(startTime,endTime);
		
		events.add(event2);
		
		
		cal.set(Calendar.HOUR_OF_DAY,18);
		cal.set(Calendar.MINUTE,15);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);
		
		 startTime=cal.getTimeInMillis();
		
		cal.set(Calendar.HOUR_OF_DAY,18);
		cal.set(Calendar.MINUTE,30);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);
		
		endTime=cal.getTimeInMillis();
		
		Event event3= new Event(startTime, endTime);
		events.add(event3);
		
		MeetingScheduler scheduler=new MeetingScheduler();
		System.out.println(scheduler.getNumberOfRooms(events));

	}

}
