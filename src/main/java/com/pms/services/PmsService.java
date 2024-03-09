package com.pms.services;

import java.util.List;
import java.util.Optional;

import com.pms.models.ProjectBean;

public interface PmsService {
	List<ProjectBean> getAllProjects();

	Optional<ProjectBean> getProjectById(Long id);

	ProjectBean createProject(ProjectBean project);

	ProjectBean updateProject(Long id, ProjectBean project);

	void deleteProject(Long id);
}
