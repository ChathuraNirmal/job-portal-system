package com.icet.edu.model.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "company")
public class CompanyDao {

    @Id
    @Column(name = "company_id")
    private Long id;
    private String location;
    private String name;
    private String industry;

}
