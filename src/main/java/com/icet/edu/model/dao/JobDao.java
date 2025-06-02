package com.icet.edu.model.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class JobDao {

    @Id
    private Long id;
    private String title;
    private String discription;
    private Double salary;
    private String salaryDate;
    
}
