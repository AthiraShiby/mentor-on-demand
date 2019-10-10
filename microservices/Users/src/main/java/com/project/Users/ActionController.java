package com.project.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ActionController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/users")
    public List<Users> getUsers() {
        return usersService.getUsers();
    }

    @RequestMapping("/users/{id}")
    public Users getUsers(@PathVariable Long id) {
        return usersService.getUsers(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public void addUsers(@RequestBody Users s) {
        usersService.addUsers(s);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
    public void updateUsers(@RequestBody Users s) {
        usersService.updateUsers(s);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
    public void deleteUsers(@PathVariable Long id) {
        usersService.deleteUsers(id);
    }

    @RequestMapping("/userName/{userName}")
    public Users getUserName(@PathVariable String userName) {
        return usersService.getUserName(userName);
    }

    @RequestMapping("/block/{userName}")
    public void blockUser(@PathVariable String userName) {usersService.blockUser(userName);}
}
