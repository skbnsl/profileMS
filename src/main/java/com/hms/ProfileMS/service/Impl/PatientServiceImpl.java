package com.hms.ProfileMS.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.ProfileMS.dto.PatientDTO;
import com.hms.ProfileMS.exception.HmsException;
import com.hms.ProfileMS.repository.PatientRepository;
import com.hms.ProfileMS.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Long addPatient(PatientDTO patientDto) throws HmsException {
        if(patientDto.getAadharNo()!=null && patientRepository.findByAadharNo(patientDto.getAadharNo()).isPresent()) throw new HmsException("PATIENT_ALREADY_EXIST");
        String email =patientDto.getEmail().toLowerCase();
        patientDto.setEmail(email);
        if(patientDto.getEmail()!=null && patientRepository.findByEmail(patientDto.getEmail()).isPresent()) throw new HmsException("PATIENT_ALREADY_EXIST");

        return patientRepository.save(patientDto.toEntity()).getId();
    }

    @Override
    public PatientDTO getPatientById(Long id) throws HmsException {
        return patientRepository.findById(id).orElseThrow(()->new HmsException("PATIENT_NOT_FOUND")).toDTO();
    }
    
}
