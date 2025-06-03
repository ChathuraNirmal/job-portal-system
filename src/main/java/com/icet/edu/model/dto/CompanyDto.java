package com.icet.edu.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CompanyDto {

    private Long id;
    private String location;
    private String name;
    private String industry;

}
