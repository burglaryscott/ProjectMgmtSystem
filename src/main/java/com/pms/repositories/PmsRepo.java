package com.pms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pms.models.ProjectBean;

@Repository
public interface PmsRepo extends JpaRepository<ProjectBean, Long> {
	
}
