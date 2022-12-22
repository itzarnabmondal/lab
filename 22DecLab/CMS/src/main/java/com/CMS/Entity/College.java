package com.CMS.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

// Using lombok annotation
@Getter
@Setter
@Entity
@Table(name="CMS")
public class College { // main class
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)//allows auto generation for field value
@Column(name="c_id")
private int id;
@Column(name="c_firstName",length=20,nullable=false)
private String firstName;
@Column(name="c_lastName",length=20,nullable=false)
private String lastName;
@Column(name="c_dept")
private String dept;
@Column(name="c_phone",length=11,unique=false)
private long phone;
@Column(name="c_Address",length=20,nullable=false)
private String address;
}