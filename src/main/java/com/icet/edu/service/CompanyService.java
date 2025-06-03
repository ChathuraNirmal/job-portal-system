package com.icet.edu.service;

import com.icet.edu.model.dao.CompanyDao;
import com.icet.edu.model.dto.CompanyDto;
import com.icet.edu.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CompanyService {
    ModelMapper modelMapper = new ModelMapper();
    private final CompanyRepository companyRepository;


    public Boolean save(CompanyDto companyDto) {

        try {
            companyRepository.save(modelMapper.map(companyDto, CompanyDao.class));

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }


    public Boolean delete(Long id) {


        try {
            companyRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;

    }


    public CompanyDto searchByID(Long id) {
        return modelMapper.map(companyRepository.findById(id), CompanyDto.class);
    }


    public List<CompanyDto> getAll() {

        return companyRepository.findAll().stream().map(companyDao -> modelMapper.map(companyDao,CompanyDto.class)).collect(Collectors.toList());

    }

}
