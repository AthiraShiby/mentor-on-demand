package com.project.Technology;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechnologyService {
    @Autowired
    private TechnologyRepository technologyRepository;

    public List<Technology> getTechnology() {
        List<Technology> tech = new ArrayList<>();
        technologyRepository.findAll().forEach(tech::add);
        return tech;
    }

    public Technology getTechnology(Long id) {
        return technologyRepository.findById(id).orElse(null);
    }

    public void addTechnology(Technology s) {
        technologyRepository.save(s);
    }

    public void updateTechnology(Technology s) {
        technologyRepository.save(s);
    }


    public void deleteTechnology(Long id) {
        technologyRepository.deleteById(id);
    }

    public Technology getTechnologyName(String technology_name) {
        return technologyRepository.getTechnologyName(technology_name);
    }
}
