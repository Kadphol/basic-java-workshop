package com.example.hellorestmaven.employee;

import java.util.Objects;

public class EmployeeResponse{
    private int id;
    private String fname;
    private String lname;

    public EmployeeResponse(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    public EmployeeResponse() { }

    public void setFname(String fname){ this.fname = fname; }

    public String getFname(){
        return fname;
    }

    public void setLname(String lname){
        this.lname = lname;
    }

    public String getLname(){
        return lname;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "EmployeeResponse{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeResponse response = (EmployeeResponse) o;
        return id == response.id &&
                Objects.equals(fname, response.fname) &&
                Objects.equals(lname, response.lname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fname, lname);
    }
}
