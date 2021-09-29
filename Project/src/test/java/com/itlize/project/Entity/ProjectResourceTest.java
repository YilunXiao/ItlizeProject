package com.itlize.project.Entity;

import org.junit.jupiter.api.Test;

public class ProjectResourceTest {

    @Test
    void getId(){
        User user = new User();
        Integer id = 10;
        user.setId(id);
        assert(user.getId()).equals(10);
    }



}
