package com.icet.edu.model.dao;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity(name = "job")
public class JobDao {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private Long id;
    private String title;
    private String description;
    private Double salary;
    @Column(name = "salary_date")
    private String salaryDate;
    @Column(name = "company_id")
    private Long companyId;
    
}
