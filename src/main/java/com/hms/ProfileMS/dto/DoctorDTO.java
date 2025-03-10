package com.hms.ProfileMS.dto;

import java.time.LocalDate;

import com.hms.ProfileMS.entity.Doctor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DoctorDTO {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private String phone;
    private String address;
    private String licenseNo;
    private String specialization;
    private String department;
    private Integer totalExp;

    public Doctor toEntity(){
        return new Doctor(this.id,this.name,this.email,this.dob,
        this.phone,this.address,this.licenseNo,this.specialization,this.department,this.totalExp);
    }
}