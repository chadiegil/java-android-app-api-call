package com.example.myapplicationdemo;

public class RequestPost {
    public RequestPost(String name, String job) {
        this.name = name;
        this.job = job;
    }

    String name,job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
