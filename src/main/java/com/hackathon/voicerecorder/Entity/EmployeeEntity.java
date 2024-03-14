package com.hackathon.voicerecorder.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
public class EmployeeEntity {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String dept;
}
