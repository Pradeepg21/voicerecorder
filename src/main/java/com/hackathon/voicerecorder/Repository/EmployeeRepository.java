package com.hackathon.voicerecorder.Repository;

import com.hackathon.voicerecorder.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<EmployeeEntity, Integer > {
}
