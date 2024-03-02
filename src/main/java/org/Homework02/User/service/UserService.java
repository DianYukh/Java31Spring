package org.Homework02.User.service;

import org.Homework02.User.model.User;
import org.Homework02.User.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    @Qualifier("userRepository")
    private final UserRepository userRepository;


@Autowired
    public UserService(@Qualifier("userRepository") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user){
                userRepository.save(user);
    }
   public User getUser(int id){
      return  userRepository.findById(id);
   }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

   public void deleteUser(User user){
        userRepository.delete(user);
   }



}
