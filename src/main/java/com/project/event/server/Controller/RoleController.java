package com.project.event.server.Controller;

import com.project.event.server.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/role.list")
    @ResponseBody
    public ResponseEntity getAllRoles (HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap<String, Object> result = new HashMap<>();
        result.put("roles", roleService.getAllRoles());
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
