package com.icet.edu.repository;

import com.icet.edu.service.SuperService;
import com.icet.edu.service.custom.impl.CompanyServiceImpl;
import com.icet.edu.service.custom.impl.JobServiceImpl;
import com.icet.edu.util.RepositoryType;

public class DAOFactory {

    public class ServiceFactory {

        private static DAOFactory instance;

        private ServiceFactory() {
        }
        public static DAOFactory getInstance() {

            return instance == null ? new DAOFactory() : instance;
        }
        public <T extends SuperService> T getServices(RepositoryType type) {

            return switch (type) {
                case JOB -> (T) new JobServiceImpl();
                case COMPANY -> (T) new CompanyServiceImpl();
                default -> throw new IllegalArgumentException("Unknown service type: " + type);
            };
        }
    }
}