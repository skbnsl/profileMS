package com.hms.ProfileMS.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.ProfileMS.dto.DoctorDTO;
import com.hms.ProfileMS.exception.HmsException;
import com.hms.ProfileMS.repository.DoctorRepository;
import com.hms.ProfileMS.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Long addDoctor(DoctorDTO doctorDTO) throws HmsException {
        if(doctorDTO.getEmail()!=null && doctorRepository.findByEmail(doctorDTO.getEmail()).isPresent()) throw new HmsException("DOCTOR_ALREADY_EXIST");
        if(doctorDTO.getLicenseNo()!=null && doctorRepository.findByLicenseNo(doctorDTO.getLicenseNo()).isPresent()) throw new HmsException("DOCTOR_ALREADY_EXIST");
        return doctorRepository.save(doctorDTO.toEntity()).getId();
    }

    @Override
    public DoctorDTO getDoctorById(Long id) throws HmsException {
        return doctorRepository.findById(id).orElseThrow(()->new HmsException("DOCTOR_NOT_FOUND")).toDTO();
    }
    
}
