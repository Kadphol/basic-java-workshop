package com.example.hellorestmaven.user;

import org.apache.catalina.User;
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
                    new Company("Deckow-Crist" , "Proactive didactic contingency" , "synergize scalable supply-chains")),
            new UserResponse(3, "Clementine Bauch", "Samantha", "Nathan@yesenia.net",
                    new Address("Douglas Extension", "Suite 847", "McKenziehaven", "59590-4157", new Geo("-68.6102", "-47.0653")),
                    "1-463-123-4447","ramiro.info",
                    new Company("Romaguera-Jacobson", "Face to face bifurcated interface", "e-enable strategic applications")),
            new UserResponse(4, "Chelsey Dietrich", "Kamren", "Lucio_Hettinger@annie.ca",
                    new Address("Skiles Walks", "Suite 351", "Roscoeview", "33263", new Geo("-31.8129", "62.5342")),
                    "(254)954-1289", "demarco.info",
                    new Company("Keebler LLC", "User-centric fault-tolerant solution", "revolutionize end-to-end systems")),
    ));

    @GetMapping("/users")
    public List<UserResponse> getAllUsers() {
        return users;
    }

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
