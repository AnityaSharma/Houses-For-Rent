package dev.housesforsale.houses.controller;

import dev.housesforsale.houses.models.User;
import dev.housesforsale.houses.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserRestController {

    @Autowired
    private IUserService userService;

    @PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveUser(@RequestBody User user){

        Integer i=userService.saveUser(user);
        System.out.println("Sh");
        String body="User "+i+"Saved";
        return ResponseEntity.ok(body);
    }


}
