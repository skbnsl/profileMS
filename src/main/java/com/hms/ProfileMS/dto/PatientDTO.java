package com.hms.ProfileMS.dto;

import java.time.LocalDate;

import com.hms.ProfileMS.entity.Patient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDTO {
    private Long id;
    private String name;
    private String email;
    //@Min(7 , message="")
    //private String password;
    //private Roles role;
    private LocalDate dob;
    private String phone;
    private String address;
    private String aadharNo;
    private BloodGroup bloodGroup;
    private String allergies;
    private String chronicDisease;

    public Patient toEntity(){
        return new Patient(this.id,this.name,this.email,this.dob,this.phone,this.address,this.aadharNo,
            this.bloodGroup,this.allergies,this.chronicDisease);
    }
}
