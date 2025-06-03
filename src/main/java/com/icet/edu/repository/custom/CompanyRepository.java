package com.icet.edu.repository.custom;

import com.icet.edu.model.dao.CompanyDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyDao,Long> {
}
