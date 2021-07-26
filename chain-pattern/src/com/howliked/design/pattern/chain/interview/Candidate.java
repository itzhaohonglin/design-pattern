package com.howliked.design.pattern.chain.interview;

/**
 * 候选人
 */
public class Candidate {

    private String name;
    private String phone;
    private String jobDescribe;

    public Candidate(String name, String phone, String jobDescribe) {
        this.name = name;
        this.phone = phone;
        this.jobDescribe = jobDescribe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJobDescribe() {
        return jobDescribe;
    }

    public void setJobDescribe(String jobDescribe) {
        this.jobDescribe = jobDescribe;
    }
}
