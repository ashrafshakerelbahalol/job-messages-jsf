package com;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JobDoa  {

     private EntityManagerFactory emf =Persistence.createEntityManagerFactory("jobPU");
     private EntityManager entityManager= emf.createEntityManager();

    public void addJob(Job job) {
        entityManager.getTransaction().begin();
        entityManager.persist(job);
        entityManager.getTransaction().commit();
    }

    public Job getJobById(Long id) {
        return entityManager.find(Job.class, id);
    }

    public List<Job> getAllJobs() {
        return entityManager.createQuery("SELECT j FROM Job j", Job.class).getResultList();
    }

    public void updateJob(Job job) {
        entityManager.getTransaction().begin();
          Job job1= getJobById(job.getId());
          job1.setMessage(job.getMessage());
          job1.setName(job.getName());
        entityManager.getTransaction().commit();
    }

    public void deleteJob(Long id) {
        Job job = getJobById(id);
        if (job != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(job);
            entityManager.getTransaction().commit();

        }
    }
}