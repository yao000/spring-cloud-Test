package com.qhit.cloudclient.user.controller;

import com.qhit.cloudclient.user.entity.User;
import com.qhit.cloudclient.user.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

        @Autowired
        private UserFeignClient userFeignClient;
        @GetMapping("/user/{id}")
        public User findById(@PathVariable Long id) {
            User user = this.userFeignClient.findById(id);
            return user;
        }

}
