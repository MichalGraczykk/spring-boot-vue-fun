package com.health.checker.Interfaces;

import com.health.checker.DAO.StatsDAO;

import org.springframework.data.repository.CrudRepository;

public interface StatsRepository  extends CrudRepository<StatsDAO, Long> {
    // custom query example and return a stream
    //@Query("select vs from v_stats vs where vs.V_COUNT = :i")
    //Stream<StatsDAO> findByCountReturnStream(@Param("i") Long i);
}