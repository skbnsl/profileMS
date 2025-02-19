package com.hms.ProfileMS.service;

import com.hms.ProfileMS.dto.DoctorDTO;
import com.hms.ProfileMS.exception.HmsException;

public interface DoctorService {

    public Long addDoctor(DoctorDTO doctor) throws HmsException;
    public DoctorDTO getDoctorById(Long id) throws HmsException;

}
