package com.project.event.server.Controller;

import com.project.event.server.Domain.Dto.EventDto;
import com.project.event.server.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.HashMap;

@RestController
public class EventControlller {
    @Autowired
    private EventService eventService;

    @GetMapping("/event.list")
    @ResponseBody
    public ResponseEntity getAllEvents (HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap<String, Object> result = new HashMap<>();
        result.put("events", eventService.getAllEvents());
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    @PostMapping("/event.create")
    @ResponseBody
    public ResponseEntity createEvent (@RequestBody @Valid EventDto eventDto, HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap<String, Object> result = new HashMap<>();
        result.put("status", eventService.createEvenInt(eventDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}