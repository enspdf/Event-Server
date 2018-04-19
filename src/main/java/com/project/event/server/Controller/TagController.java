package com.project.event.server.Controller;

import com.project.event.server.Domain.Dto.TagDto;
import com.project.event.server.Service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.HashMap;

@RestController
public class TagController {
    @Autowired
    private TagService tagService;

    @GetMapping("/tag.list")
    @ResponseBody
    public ResponseEntity getAllTags (HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap<String, Object> result = new HashMap<>();
        result.put("tags", tagService.getAllTags());
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PostMapping("/tag.create")
    @ResponseBody
    public ResponseEntity createTag (@RequestBody @Valid TagDto tagDto, HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap<String, Object> result = new HashMap<>();
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
