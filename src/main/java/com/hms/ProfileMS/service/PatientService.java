package com.hms.ProfileMS.service;

import com.hms.ProfileMS.dto.PatientDTO;
import com.hms.ProfileMS.entity.Patient;
import com.hms.ProfileMS.exception.HmsException;

public interface PatientService {

    public Long addPatient(PatientDTO patientDto) throws HmsException;
    public PatientDTO getPatientById(Long id) throws HmsException;


}
