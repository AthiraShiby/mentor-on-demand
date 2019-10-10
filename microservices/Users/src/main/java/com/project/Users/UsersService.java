package com.project.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public List<Users> getUsers() {
        List<Users> users = new ArrayList<>();
        usersRepository.findAll().forEach(users::add);
        return users;
    }

    public Users getUsers(Long id) {
        return usersRepository.findById(id).orElse(null);
    }

    public void addUsers(Users s) {
        usersRepository.save(s);
    }

    public void updateUsers(Users s) {
        usersRepository.save(s);
    }

    public void deleteUsers(Long id) {
        usersRepository.deleteById(id);
    }

    public Users getUserName(String userName) {
        return usersRepository.searchUserName(userName);
    }

    public void blockUser(String userName) {usersRepository.blockUser(userName);}

}
