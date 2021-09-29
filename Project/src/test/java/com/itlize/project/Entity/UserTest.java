package com.itlize.project.Entity;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTest {

    @Test
    void getId(){
        User user = new User();
        Integer id = 1;
        user.setId(id);
        assert(user.getId()).equals(1);
    }

    @Test
    void setId() {
        User user = new User();
        user.setId(10);
        assert (user.getId()).equals(10);
    }

    @Test
    void getUsername() {
        User user = new User();
        user.setUsername("Gundam");
        assert(user.getUsername()).equals("Gundam");
    }

    @Test
    void setUsername() {
        User user = new User();
        user.setUsername("Gundam-RX-78");
        assert(user.getUsername()).equals("Gundam-RX-78");
    }

    @Test
    void getPassword() {
        User user = new User();
        user.setPassword("Deutschland");
        assert(user.getPassword()).equals("Deutschland");
    }

    @Test
    void setPassword() {
        User user = new User();
        user.setPassword("Ameirka");
        assert(user.getPassword()).equals("Ameirka");
    }

    @Test
    void getEmail() {
        User user = new User();
        user.setEmail("Whatsup@gmail.com");
        assert(user.getEmail()).equals("Whatsup@gmail.com");
    }

    @Test
    void getTimeCreated() {
        User user = new User();
        Date date = new Date(121,8,28);
        user.setTimeCreated(date);
        //System.out.println(date);
        //System.out.println(user.getTimeCreated());
        assert(user.getTimeCreated()).equals(date);
    }

    @Test
    void getProducts(){
        User user = new User();
        Project project1 = new Project();
        List<Project> projectList = new ArrayList<Project>();
        projectList.add(project1);
        user.setProjects(projectList);
        assert(user.getProjects()).equals(projectList);
    }
}
