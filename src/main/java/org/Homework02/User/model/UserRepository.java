package org.Homework02.User.model;

import java.util.List;

public interface UserRepository {

    void save(User user);
    User findById(int id);
    List<User> findAll();
   void delete(User user);
}
