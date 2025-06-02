package com.icet.edu.controller;

import com.icet.edu.model.dto.CompanyDto;
import com.icet.edu.model.dto.JobDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class JobPortalController {


    @PostMapping("/set-company")
    void addCompany(@RequestBody CompanyDto companyDto){

    }@PostMapping("/set-job")
    void addJob(@RequestBody JobDto jobDto){

    }

}
