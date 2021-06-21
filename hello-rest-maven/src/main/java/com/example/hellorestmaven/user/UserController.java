package com.example.hellorestmaven.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
public class UserController {

    private List<UserResponse> users = new ArrayList<>(asList(
            new UserResponse(1, "Leanne Graham", "Bret", "Sincere@april.biz",
            new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874", new Geo("-37.3159", "81.1496")),
                    "1-770-736-8031 x56442", "hildegard.org",
                    new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets")),
            new UserResponse(2, "Ervin Howell", "Antonette", "Shanna@melissa.tv",
                    new Address("Victor Plains", "Suite 879", "Wisokyburgh", "90566-7771", new Geo("-43.9509", "-34.4618")),
                    "010-692-6593 x09125", "anastasia.net",
                    new Company("Deckow-Crist" , "Proactive didactic contingency" , "synergize scalable supply-chains"))
    ));

    @GetMapping("/users/{id}")
    public UserResponse getUserByID(@PathVariable String id) {
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid id :" + id);
        }
        int finalID = _id;
        return users.stream().filter(user -> finalID == user.getId()).findFirst().orElse(null);
    }
}
