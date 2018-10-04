package com.health.checker.RestControllers;

import com.health.checker.Interfaces.IStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Stats {

    //@Autowired
    //IStatsService statsService;

    @RequestMapping(value="/getStats")
    public String GetStats (){
        return "ok";
    }
}
