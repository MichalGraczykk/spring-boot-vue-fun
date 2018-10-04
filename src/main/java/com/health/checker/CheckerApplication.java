package com.health.checker;

import com.health.checker.DAO.StatsDAO;
import com.health.checker.Interfaces.StatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class CheckerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckerApplication.class, args);
	}

}
