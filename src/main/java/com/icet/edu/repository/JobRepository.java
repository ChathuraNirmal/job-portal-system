package com.icet.edu.repository;

import com.icet.edu.model.dao.JobDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobDao,Long> {



}
