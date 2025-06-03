package com.icet.edu.service;

import com.icet.edu.model.dao.JobDao;
import com.icet.edu.model.dto.JobDto;
import com.icet.edu.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JobService {

    ModelMapper modelMapper = new ModelMapper();
    private final JobRepository jobRepository;


    public Boolean save(JobDto jobDto) {

        try {
            System.out.println(jobDto);
            jobRepository.save(modelMapper.map(jobDto, JobDao.class));

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }


    public Boolean delete(Long id) {


        try {
            jobRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;

    }


    public JobDto searchByID(Long id) {
        return modelMapper.map(jobRepository.findById(id), JobDto.class);
    }


    public List<JobDto> getAll() {

        return jobRepository.findAll().stream().map(jobDao -> modelMapper.map(jobDao, JobDto.class)).collect(Collectors.toList());

    }


}
