package com.project.event.server.Controller;

import com.project.event.server.Domain.Dto.RoleDto;
import com.project.event.server.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
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

    @PostMapping("/role.create")
    @ResponseBody
    public ResponseEntity createRole (@RequestBody @Valid RoleDto roleDto, HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap<String, Object> result = new HashMap<>();
        result.put("status", roleService.createRole(roleDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
