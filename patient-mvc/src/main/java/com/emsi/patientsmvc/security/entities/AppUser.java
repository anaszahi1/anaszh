package com.emsi.patientsmvc.security.entities;

import com.emsi.patientsmvc.entities.Patient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    @Id
    private String userId;
    @Column(unique = true)
    private String username;
    private String password;
    private boolean active;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<AppRole> appRoleList=new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY)
    private List<Patient> userPatients=new ArrayList<>();

}
