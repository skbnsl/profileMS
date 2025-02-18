package com.hms.ProfileMS.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.hms.ProfileMS.entity.Doctor;
import com.hms.ProfileMS.entity.Patient;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {
    
    Optional<Patient> findByEmail(String email);
    Optional<Patient> findByLicenseNo(String licenseNo);

}
