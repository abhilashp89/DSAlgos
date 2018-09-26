package com.abhi.algos;

import java.util.List;

import com.abhi.ds.Event;

public class MeetingScheduler {
	
	public int getNumberOfRooms(List<Event> events) {
		
		int numOfRooms=0;
		Long latestEndTime=Long.MAX_VALUE;

		for(Event event:events){
				
			  Long startTime=event.getStartTime();
			  Long endTime=event.getEndTime();
			  
			  if(startTime < latestEndTime){
				  numOfRooms++;
				  
				   latestEndTime=endTime;
				   
				   if(endTime > latestEndTime)
					   latestEndTime=endTime;
				  
			  }else{
					  continue;
				  } 
			 }
			  
		  return numOfRooms;
		}
			
		}
	


