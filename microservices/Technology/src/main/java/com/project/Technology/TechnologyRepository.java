package com.project.Technology;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TechnologyRepository extends CrudRepository<Technology,Long> {
    @Query(value = "select * from technology t where t.technology_name=?1",nativeQuery = true)
    Technology getTechnologyName(String technology_name);
}
