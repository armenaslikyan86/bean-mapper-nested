package com.armen.daily.goals.demo.controller;

import com.armen.daily.goals.demo.dto.UserCreationRequestDto;
import com.armen.daily.goals.demo.mapper.UserMapper;
import com.armen.daily.goals.demo.model.User;
import com.armen.daily.goals.demo.model.UserInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    private static final List<User> users = new ArrayList<>();


    @PostMapping("/create")
    public ResponseEntity<User> create(@RequestBody UserCreationRequestDto userCreationRequestDto) {
        final User user = userMapper.map(userCreationRequestDto, User.class);
        users.add(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/info/{userName}")
    public ResponseEntity<UserInfoDto> getUserInfo(@PathParam("userId") String userName) {
        for (final User user : users) {
            if (user.getName().equals(userName)) {
                return new ResponseEntity<>(userMapper.map(user, UserInfoDto.class), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
