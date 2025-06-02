package com.icet.edu.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class JobPortalService {

    private CompanyService companyService;
    private JobPortalService jobPortalService;

}
