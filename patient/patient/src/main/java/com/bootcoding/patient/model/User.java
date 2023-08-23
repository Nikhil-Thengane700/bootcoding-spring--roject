package com.bootcoding.patient.model;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table(name = "Patient")
@Entity
public class User {
    @Id
    @GeneratedValue  // genrated value wii be puted in id
    private int id;

    @Column(name = "patient_name")
    private String firstName;

    @Column(name = "patient_address")
    private String lastName;

    @Column(name =  "patient_email")
    private String emailId;

    @Column(name = "patient_phone")
    private long phone;

}