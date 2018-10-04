package com.health.checker.Interfaces;

import com.health.checker.DAO.StatsDAO;

import java.sql.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface IStatsService extends CrudRepository<StatsDAO, Long> {
    List<StatsDAO> findAll();
    //List<StatsDAO> findByDate(Date date);
}
