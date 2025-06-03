package com.icet.edu.controller;

import com.icet.edu.model.dto.CompanyDto;
import com.icet.edu.model.dto.JobDto;
import com.icet.edu.service.ServiceFactory;
import com.icet.edu.service.custom.CompanyService;
import com.icet.edu.service.custom.JobService;
import com.icet.edu.util.ServiceType;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class JobPortalController {

    CompanyService companyService = ServiceFactory.getInstance().getServices(ServiceType.COMPANY);
    JobService jobService = ServiceFactory.getInstance().getServices(ServiceType.JOB);

    @PostMapping("/set-company")
    boolean addCompany(@RequestBody CompanyDto companyDto) {

        return companyService.save(companyDto);

    }

    @PostMapping("/set-job")
    boolean addJob(@RequestBody JobDto jobDto) {

        return jobService.save(jobDto);

    }

    @GetMapping("getAll-companies")
    List<CompanyDto> getAllCompanies() {

        return companyService.getAll();

    }

    @GetMapping("getAll-jobs")
    List<JobDto> getAllJobs() {

        return jobService.getAll();

    }

    @DeleteMapping("/{company-name}")
    boolean deleteCompany(Long id) {

        return companyService.delete(id);

    }

    @DeleteMapping("/{job-name}")
    boolean deleteJob(Long id) {

        return jobService.delete(id);

    }


}
