package com.icet.edu.controller;

import com.icet.edu.model.dto.CompanyDto;
import com.icet.edu.model.dto.JobDto;
import com.icet.edu.service.CompanyService;
import com.icet.edu.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class JobPortalController {

    private final CompanyService companyService;
    private final JobService jobService;

    @PostMapping("/set-company")
    void addCompany(@RequestBody CompanyDto companyDto) {

         companyService.save(companyDto);

    }

    @PostMapping("/set-job")
    void addJob(@RequestBody JobDto jobDto) {

         jobService.save(jobDto);

    }

    @GetMapping("getAll-companies")
    public List<CompanyDto> getAllCompanies() {

        return companyService.getAll();

    }

    @GetMapping("getAll-jobs")
    List<JobDto> getAllJobs() {

        System.out.println(jobService.getAll());
        return jobService.getAll();

    }

    @DeleteMapping("/{company-name}")
    void deleteCompany(Long id) {

         companyService.delete(id);

    }

    @DeleteMapping("/{job-name}")
    void deleteJob(Long id) {

         jobService.delete(id);

    }
}
