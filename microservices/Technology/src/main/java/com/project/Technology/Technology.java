package com.project.Technology;

import javax.persistence.*;

@Entity
public class Technology {

    @Id
    @GeneratedValue
    @Column(name = "technology_id")
    private Long id;

    @Column(name = "technology_name")
    private String name;

    @Column(name = "toc")
    private String toc;

    @Column(name = "prerequisites")
    private String prerequisites;

    @Column(name="duration")
    private String duration;

    @Column(name="fees")
    private Long fees;

    public Technology() {
    }

    public Technology(String name, String toc, String prerequisites, String duration, Long fees) {
        this.name = name;
        this.toc = toc;
        this.prerequisites = prerequisites;
        this.duration = duration;
        this.fees = fees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToc() {
        return toc;
    }

    public void setToc(String toc) {
        this.toc = toc;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Long getFees() {
        return fees;
    }

    public void setFees(Long fees) {
        this.fees = fees;
    }
}
