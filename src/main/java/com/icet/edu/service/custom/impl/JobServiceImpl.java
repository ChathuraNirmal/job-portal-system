package com.icet.edu.service.custom.impl;

import com.icet.edu.model.dao.JobDao;
import com.icet.edu.model.dto.JobDto;
import com.icet.edu.repository.JobRepository;
import com.icet.edu.service.custom.JobService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

@RequiredArgsConstructor
public class JobServiceImpl implements JobService {

    ModelMapper modelMapper = new ModelMapper();
    private JobRepository jobRepository;

    @Override
    public Boolean add(JobDto jobDto) {

        try {
            jobRepository.save(modelMapper.map(jobDto, JobDao.class));

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    @Override
    public Boolean remove(Long id) {


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
        return modelMapper.map(jobRepository.findById(id),JobDto.class);
    }


}
