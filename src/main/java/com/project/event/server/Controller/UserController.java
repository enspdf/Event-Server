package com.project.event.server.Controller;

import com.project.event.server.Domain.Dto.UserDto;
import com.project.event.server.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.HashMap;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user.list")
    @ResponseBody
    public ResponseEntity getAllUsers (HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap<String, Object> result = new HashMap<>();
        result.put("users", userService.getAllUsers());
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PostMapping("/user.create")
    @ResponseBody
    public ResponseEntity createUser (@RequestBody @Valid UserDto userDto, HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap<String, Object> result = new HashMap<>();
        result.put("status", userService.createUser(userDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
