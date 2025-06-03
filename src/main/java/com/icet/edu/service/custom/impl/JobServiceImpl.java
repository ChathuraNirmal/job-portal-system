package com.icet.edu.service.custom.impl;

import com.icet.edu.model.dao.JobDao;
import com.icet.edu.model.dto.JobDto;
import com.icet.edu.repository.custom.JobRepository;
import com.icet.edu.service.custom.JobService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class JobServiceImpl implements JobService {

    ModelMapper modelMapper = new ModelMapper();
    private JobRepository jobRepository;

    @Override
    public Boolean save(JobDto jobDto) {

        try {
            jobRepository.save(modelMapper.map(jobDto, JobDao.class));

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    @Override
    public Boolean delete(Long id) {


        try {
            jobRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;

    }

    @Override
    public JobDto searchByID(Long id) {
        return modelMapper.map(jobRepository.findById(id), JobDto.class);
    }

    @Override
    public List<JobDto> getAll() {

        List<JobDto> jobDtos = new ArrayList<>();

        jobRepository.findAll().forEach(each -> {

            jobDtos.add(modelMapper.map(each, JobDto.class));

        });


        return jobDtos;
    }


}
