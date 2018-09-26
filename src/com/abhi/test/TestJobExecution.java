package com.abhi.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class TestJobExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//40, 50, 60, 10, 30, 20
		Job job0=new Job("0",40);
		Job job1=new Job("1",50);
		Job job2=new Job("2",60);
		Job job3=new Job("3",10);
		Job job4=new Job("4",30);
		Job job5=new Job("5",20);

		/**
		 * g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

		 */


		job2.addDependentJobs(job5);
		job0.addDependentJobs(job5);
		job0.addDependentJobs(job4);
		job1.addDependentJobs(job4);
		job3.addDependentJobs(job2);
		job1.addDependentJobs(job3);

		List<Job> jobList=new ArrayList<>();
		jobList.add(job0);
		jobList.add(job1);
		jobList.add(job2);
		jobList.add(job3);
		jobList.add(job4);
		jobList.add(job5);

		JobExecutor jobExecutor=new JobExecutor();

		Queue<Job> jobsWithNoInDegree=getJobsWithNoIndegree(jobList);
		executeJobs(jobExecutor,jobsWithNoInDegree);
		

		Queue<Job> jobExecutedOrderList=jobExecutor.getJobExecutionOrder();

		System.out.println("Job Execution Order:");
		while(!jobExecutedOrderList.isEmpty()){
			Job job=jobExecutedOrderList.poll();
			System.out.print(job+" ");
		}

		System.out.println("Total execution time  :"+jobExecutor.getTime());

	}

	private static void executeJobs(JobExecutor jobExecutor, Queue<Job> jobList) {
		
		while(!jobList.isEmpty()){
			Job job=jobList.poll();
			if(!job.isProcessed())
				jobExecutor.executeJob(job,jobList);
		}
	}

	private static Queue<Job> getJobsWithNoIndegree(List<Job> jobList) {

		Queue<Job> jobsWithNoIndegree=new LinkedList<>();		
		for(Job job:jobList){

			if(job.getDependentJobs().size() == 0)
				jobsWithNoIndegree.add(job);			
		}

		return jobsWithNoIndegree;
	}

}

class JobExecutor {

	Queue<Job> jobExecutionOrder=new LinkedList<>();
	Integer totalTime=0;

	public void executeJob(Job job,Queue<Job> jobList) {

		job.setProcessed(true);
		jobExecutionOrder.add(job);
		
		for(Job dependentJob:job.getDependentJobs()){

			
			if(!dependentJob.isProcessed())
				jobList.add(dependentJob);{
			System.out.println(jobList);
		}
		}
		
		totalTime=totalTime+job.getTime();
		

	}


	public Queue<Job> getJobExecutionOrder(){
		return this.jobExecutionOrder;
	}

	public Integer getTime(){
		return totalTime;
	}


}


class Job {

	private String jobNumber;
	private Integer time;
	private boolean isProcessed;
	private List<Job> dependentJobs;

	Job(String jobNumber,Integer time){
		this.jobNumber=jobNumber;
		this.time=time; 
		this.dependentJobs=new ArrayList<>();
	}

	public boolean isProcessed() {
		return isProcessed;
	}
	public void setProcessed(boolean isProcessed) {
		this.isProcessed = isProcessed;
	}

	public void addDependentJobs(Job job){
		this.dependentJobs.add(job);
	}


	public List<Job> getDependentJobs() {
		return dependentJobs;
	}



	public Integer getTime() {
		return time;
	}

	@Override
	public String toString() {
		return jobNumber;
	}



}
