package com.abhi.ds;

public class Event {

	Long startTime;
	Long endTime;
	
	public Event(Long startTime,Long endTime){
		this.startTime=startTime;
		this.endTime=endTime;
	}
	
	public Long getEndTime(){
		return endTime;
	}
	
	public Long getStartTime(){
		return startTime;
	} 

}
