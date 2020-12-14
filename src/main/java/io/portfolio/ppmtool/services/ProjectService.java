package io.portfolio.ppmtool.services;

import io.portfolio.ppmtool.domain.Project;
import io.portfolio.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService
{
    @Autowired
    ProjectRepository projectRepository;

    public Project SaveOrUpdateProject(Project project)
    {
        return projectRepository.save(project);
    }
}
