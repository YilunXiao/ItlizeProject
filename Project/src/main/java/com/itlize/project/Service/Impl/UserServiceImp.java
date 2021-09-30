package com.itlize.project.Service.Impl;

import com.itlize.project.Entity.User;
import com.itlize.project.Repository.UserRepository;
import com.itlize.project.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer Id) {
        return repository.getById(Id);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }
}
