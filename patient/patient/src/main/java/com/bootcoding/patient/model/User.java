package com.bootcoding.patient.model;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table(name = "app_user")
@Entity
public class User {
    @Id
    @GeneratedValue  // genrated value wii be puted in id
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name =  "email_id")
    private String emailId;

    @Column(name = "phone")
    private long phone;

}