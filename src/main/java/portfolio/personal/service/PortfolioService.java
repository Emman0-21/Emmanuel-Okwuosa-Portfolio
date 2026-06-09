package portfolio.personal.service;

import portfolio.personal.model.Project;
import portfolio.personal.model.Experience;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class PortfolioService {
    private final List<Project> projects = Arrays.asList(
            new Project("Blogging Website", "Interactive Social Web Application", "Python, Flask, FastAPI","https://github.com/Emman0-21/Blogging-Website", "https://web-production-26d69.up.railway.app",  "blog-preview.png")
    );
    private final List<Experience> experience = Arrays.asList();

    public List<Project> getAllProjects(){
        return projects;
    }

    public List<Experience> getAllExperience(){
        return experience;
    }
}
