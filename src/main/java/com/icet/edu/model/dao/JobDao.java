package com.icet.edu.model.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "job")
public class JobDao {

    @Id
    @Column(name = "job_id")
    private Long id;
    private String title;
    private String discription;
    private Double salary;
    @Column(name = "salary_date")
    private String salaryDate;
    @Column(name = "company_id")
    private Long companyId;
    
}
