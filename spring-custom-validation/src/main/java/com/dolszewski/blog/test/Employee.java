package com.dolszewski.blog.test;



public class Employee {

  @ReasonableTenure
  private int tenure;

  private String jobRole;

  private double salary;

  public Employee(int tenure, String jobRole, double salary) {
    this.tenure = tenure;
    this.jobRole = jobRole;
    this.salary = salary;
  }

  public int getTenure() {
    return tenure;
  }

  public void setTenure(int tenure) {
    this.tenure = tenure;
  }

  public String getJobRole() {
    return jobRole;
  }

  public void setJobRole(String jobRole) {
    this.jobRole = jobRole;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}
