package com.example.hellorestmaven.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Users {

    private List<UserModel> users;

    public List<UserModel> getUsers() {
        return users;
    }

    public void setUsers(List<UserModel> users) {
        this.users = users;
    }
}
