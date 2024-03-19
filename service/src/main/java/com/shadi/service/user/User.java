package com.shadi.service.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String name;
    private String email;
    private String gender;
    private String maritalStatus;
    private String sectCaste;
    private int height;
    LocalDateTime dateOfBirth;
    private  String religion;
    private String nationality;
    private String  education;
   private String specialNote;
    private int employmentStatus;
    private String cityOfResident;
    private String sect;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private PrivateInfo privateInfo;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<UserProfilePic> userProfilePics;


}
