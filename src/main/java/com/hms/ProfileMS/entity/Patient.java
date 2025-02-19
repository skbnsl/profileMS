package com.hms.ProfileMS.entity;


import java.time.LocalDate;

import com.hms.ProfileMS.dto.BloodGroup;
import com.hms.ProfileMS.dto.PatientDTO;

/*
* @Data will provide below four properties of lombok
 @Getter
 @Setter
* */

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;
    //@Min(7 , message="")
    //private String password;
    //private Roles role;

    private LocalDate dob;
    private String phone;
    private String address;
    @Column(unique = true)
    private String aadharNo;
    private BloodGroup bloodGroup;
    private String allergies;
    private String chronicDisease;

    public PatientDTO toDTO(){
        return new PatientDTO(this.id,this.name,this.email,this.dob,this.phone,
            this.address,this.aadharNo,this.bloodGroup,this.allergies,this.chronicDisease);
    }

}
