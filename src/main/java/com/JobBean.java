package com;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import java.io.Serializable;
import java.util.List;

@ManagedBean(name= "jobBean")
public class JobBean implements Serializable  {

 
     JobDoa jobDAO = new JobDoa();

    private Job job = new Job();
    private List<Job> jobs;

    @PostConstruct
    public void init() {
        jobs = jobDAO.getAllJobs();
    }

    public void addJob() {
    	job.setId(null);
        jobDAO.addJob(job);
        job = new Job(); // Reset the form
        jobs = jobDAO.getAllJobs(); // Refresh the list
    }

    public void updateJob() {
        jobDAO.updateJob(job);
        job = new Job(); // Reset the form
        jobs = jobDAO.getAllJobs(); // Refresh the list
    }

    public void deleteJob(Long id) {
    	System.out.println("hello");
        jobDAO.deleteJob(id);
        jobs = jobDAO.getAllJobs(); // Refresh the list
    }

    // Getters and Setters
    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}