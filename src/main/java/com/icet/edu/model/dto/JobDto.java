package com.icet.edu.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class JobDto {

    private Long id;
    private String title;
    private String description;
    private Double salary;
    private String salaryDate;
    private Long companyId;

}
