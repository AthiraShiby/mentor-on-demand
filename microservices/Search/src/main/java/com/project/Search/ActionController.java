package com.project.Search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActionController {

    @Autowired
    SearchService searchService;

    @RequestMapping("/search/{technologyName}/{timeSlot}")
    public List<Course> getTech(@PathVariable String technologyName, @PathVariable String timeSlot){
        return searchService.getCourse(technologyName,timeSlot);
    }
}
