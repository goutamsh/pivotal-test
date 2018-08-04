package com.gsh.pivotal.pivitaltest.dao;

import com.gsh.pivotal.pivitaltest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UsersDao extends JpaRepository<User, Long> {

    List<User> findByName(String name);
}
