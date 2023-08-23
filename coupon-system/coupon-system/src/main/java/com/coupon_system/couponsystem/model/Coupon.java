package com.coupon_system.couponsystem.model;



import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Builder
@Table(name = "Coupon_app")
@Entity
public class Coupon {


        @Id
        @GeneratedValue

        private String id;
        @Column(name = "valid_for")
        private int validFor;


        @Column(name = "title")
        private String title;

        @Column(name = "type")
        private String type;



        @Column(name = "description")
        private String description;

        @Column(name =  "coupon_code")
        private String couponCode;

        @Column(name = "validity_date")
        private Date validityDate;

        @Column(name = "discount")
        private String discount;

        @Column(name = "categeory")
        private String categeory;

        @Column(name = "created_date")
        private Date createdDate;

        @Column(name = "created_by")
        private String createdby;

        @Column(name = "status")
        private String status;


        @Column(name = "isActive")
        private boolean isActive;
}
