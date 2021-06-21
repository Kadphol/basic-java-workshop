package com.example.hellorestmaven.employee;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeRequest {
    @JsonProperty("first_name")
    private String fName;

    private String lName;

    public EmployeeRequest(String fName, String LName) {
        this.fName = fName;
        this.lName = LName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
