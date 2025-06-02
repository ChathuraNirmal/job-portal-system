package com.icet.edu.model.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CompanyDao {

    @Id
    private Long id;
    private String location;
    private String name;
    private String industry;

}
