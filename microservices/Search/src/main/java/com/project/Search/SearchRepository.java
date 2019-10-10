package com.project.Search;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SearchRepository extends CrudRepository<Course,Long> {
    @Query(value="select * from course c where c.technology_name = ?1 and c.time_slot = ?2",nativeQuery = true)
    List<Course> searchCourse(String technologyName, String timeSlot);

}
