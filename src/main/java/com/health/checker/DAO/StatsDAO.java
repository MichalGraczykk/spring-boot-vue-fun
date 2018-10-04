package com.health.checker.DAO;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "V_STATS")
public class StatsDAO {
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    //@SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
    @Id
    @Column(name = "A_COUNT")
    private Long count;
    @Column(name = "A_DATE")
    private String date;

}