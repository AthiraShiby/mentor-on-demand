package com.project.Technology;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ActionController {

    @Autowired
    private TechnologyService technologyService;

    @RequestMapping("/technology")
    public List<Technology> getTechnology() {
        return technologyService.getTechnology();
    }

    @RequestMapping("/technology/{id}")
    public Technology getTechnology(@PathVariable Long id) {
        return technologyService.getTechnology(id);
    }

    @RequestMapping("/fees/{technology_name}")
    public Technology getTechnologyName(@PathVariable String technology_name) {
        return technologyService.getTechnologyName(technology_name);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/technology")
    public void addTechnology(@RequestBody Technology s) {
        technologyService.addTechnology(s);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/technology/{id}")
    public void updateTechnology(@RequestBody Technology s) {
        technologyService.updateTechnology(s);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/technology/{id}")
    public void deleteTechnology(@PathVariable Long id) {
        technologyService.deleteTechnology(id);
    }
}
