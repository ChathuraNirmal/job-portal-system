package com.icet.edu.service;

import com.icet.edu.service.custom.impl.CompanyServiceImpl;
import com.icet.edu.service.custom.impl.JobServiceImpl;
import com.icet.edu.util.ServiceType;

public class ServiceFactory {

    private static ServiceFactory instance;


    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {

        return instance == null ? new ServiceFactory() : instance;

    }

    public <T extends SuperService> T getServices(ServiceType type) {

        return switch (type) {
            case JOB -> (T) new JobServiceImpl();
            case COMPANY -> (T) new CompanyServiceImpl();
            default -> throw new IllegalArgumentException("Unknown service type: " + type);
        };


    }
}