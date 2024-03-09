package com.pms.services;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.pms.repositories.*;

import jakarta.validation.Valid;

import com.pms.models.*;

@Service
public class PmsServiceImpl implements PmsService {

	private final PmsRepo pmsRepo;

	//@Autowired
	public PmsServiceImpl(PmsRepo pmsRepo) {
		this.pmsRepo = pmsRepo;
	}

	@Override
	public List<ProjectBean> getAllProjects() {
		return pmsRepo.findAll();
	}

	@Override
	public Optional<ProjectBean> getProjectById(Long id) {
		return pmsRepo.findById(id);
	}

	@Override
	public ProjectBean createProject(@Valid ProjectBean project) {
		return pmsRepo.save(project);
	}

	@Override
	public ProjectBean updateProject(Long id, ProjectBean project) {
		if (pmsRepo.existsById(id)) {
			project.setId(id); // Ensure the project id is set
			return pmsRepo.save(project);
		} else {
			throw new IllegalArgumentException("Project with ID " + id + " not found");
		}
	}

	@Override
	public void deleteProject(Long id) {
		pmsRepo.deleteById(id);
	}
}
