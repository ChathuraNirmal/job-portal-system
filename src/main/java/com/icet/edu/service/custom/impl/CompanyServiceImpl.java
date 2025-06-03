package com.icet.edu.service.custom.impl;

import com.icet.edu.model.dao.CompanyDao;
import com.icet.edu.model.dto.CompanyDto;
import com.icet.edu.repository.custom.CompanyRepository;
import com.icet.edu.service.custom.CompanyService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {
    ModelMapper modelMapper = new ModelMapper();
    private CompanyRepository companyRepository;

    @Override
    public Boolean save(CompanyDto companyDto) {

        try {
            companyRepository.save(modelMapper.map(companyDto, CompanyDao.class));

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    @Override
    public Boolean delete(Long id) {


        try {
            companyRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;

    }

    @Override
    public CompanyDto searchByID(Long id) {
        return modelMapper.map(companyRepository.findById(id), CompanyDto.class);
    }

    @Override
    public List<CompanyDto> getAll() {

        List<CompanyDto> companyDtos = new ArrayList<>();

        companyRepository.findAll().forEach(each -> {

            companyDtos.add(modelMapper.map(each, CompanyDto.class));

        });


        return companyDtos;
    }

}
