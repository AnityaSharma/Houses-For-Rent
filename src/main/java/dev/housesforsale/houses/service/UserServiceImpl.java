package dev.housesforsale.houses.service;

import dev.housesforsale.houses.models.User;
import dev.housesforsale.houses.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserRepository repo;

    @Override
    public Integer saveUser(User user){

        return repo.save(user).getId();
    }
}
