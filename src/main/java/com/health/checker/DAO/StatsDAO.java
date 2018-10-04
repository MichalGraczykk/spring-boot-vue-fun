package com.health.checker.DAO;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StatsDAO {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Date date;
    //SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
    //System.out.println("Current Date: " + ft.format(dNow));


    protected StatsDAO() {}

    public StatsDAO(Date date) {
        this.date = date;

    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, date='%s']",
                id, date);
    }

}