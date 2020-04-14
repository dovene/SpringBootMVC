package com.dov.springbootdebut.controllers;

import com.dov.springbootdebut.models.Session;
import com.dov.springbootdebut.models.Speaker;
import com.dov.springbootdebut.repositories.SessionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/sessions")
public class SessionsController {
    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping
    public List<Session> list(){
        return sessionRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Session get(@PathVariable Long id){
        return sessionRepository.getOne(id);
    }

    @PostMapping
    public Session create(@RequestBody final Session session){
        return sessionRepository.saveAndFlush(session);
    }

    @RequestMapping(value="{id}", method = RequestMethod.DELETE)
    public void  delete(@PathVariable Long id){
        sessionRepository.deleteById(id);
    }

    @RequestMapping(value="{id}", method = RequestMethod.PUT)
    public Session update(@PathVariable Long id, @RequestBody Session speaker){
        Session existingSession = sessionRepository.getOne(id);
        BeanUtils.copyProperties(speaker,existingSession,"session_id");
        return sessionRepository.saveAndFlush(speaker);
    }
}
