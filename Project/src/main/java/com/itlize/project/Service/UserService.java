package com.itlize.project.Service;

import com.itlize.project.Entity.User;
import java.util.List;

public interface UserService {
    public User findById(Integer Id);

    List<User> findAll();

    public User save(User user);
}
