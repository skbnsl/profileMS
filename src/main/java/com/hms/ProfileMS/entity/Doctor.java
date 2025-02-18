package com.hms.ProfileMS.entity;

import java.time.LocalDate;

import com.hms.ProfileMS.dto.BloodGroup;
import com.hms.ProfileMS.dto.DoctorDTO;
import com.hms.ProfileMS.dto.PatientDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private LocalDate dob;
    private String phone;
    private String address;
    @Column(unique = true)
    private String licenseNo;
    private String specialization;
    private String department;
    private Integer totalExp;

    public DoctorDTO toDTO(){
        return new DoctorDTO(this.id,this.name,this.email,this.dob,
        this.phone,this.address,this.licenseNo,this.specialization,this.department,this.totalExp);
    }
}
