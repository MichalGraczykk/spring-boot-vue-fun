package com.health.checker.RestControllers;

import com.google.gson.Gson;
import com.health.checker.DAO.StatsDAO;
import com.health.checker.Interfaces.StatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StatsController {

    private static final SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");

    //@Autowired
    //DataSource dataSource;
    @Autowired
    StatsRepository statsRepository;

    //@Override
    @Transactional(readOnly = true)
    @RequestMapping(value="/getStats")
    public String GetStats (){
        List<StatsDAO> tmp = new ArrayList<StatsDAO>();
        for (StatsDAO stat : statsRepository.findAll()) {
            tmp.add(stat);
        }
        return new Gson().toJson(tmp);
    }
}
