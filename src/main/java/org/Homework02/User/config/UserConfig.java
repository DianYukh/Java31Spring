package org.Homework02.User.config;

import org.Homework02.User.model.User;
import org.Homework02.User.model.UserRepository;
import org.Homework02.User.model.UserRepositoryImpl;
import org.Homework02.User.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.Homework02.User")
public class UserConfig {
    @Bean
    public User user(){
        return new User(1, "Jack", "jack@gmail.com");
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepositoryImpl();
    }

    @Bean
    public UserService userService(UserRepository userRepository) {
        return new UserService(userRepository);
    }



}
