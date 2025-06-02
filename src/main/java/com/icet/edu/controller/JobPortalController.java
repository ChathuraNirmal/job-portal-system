package com.icet.edu.controller;

import com.icet.edu.service.JobPortalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class JobPortalController {

    private JobPortalService jobPortalService;

}
