package com.example.hellorestmaven.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserGateway userGateway;

    public Users getAllUsersWithEvenID() {
        Users users = userGateway.getAllUsers();
        List<UserModel> tmp = new ArrayList<>();
        for(UserModel user : users.getUsers()) {
            if(user.getId()%2 == 0) {
                tmp.add(user);
            }
        }
        users.setUsers(tmp);
        return users;
    }

}
