package com.project.Search;

import javax.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue
    @Column(name = "_id")
    private Long id;

    @Column(name = "technology_name")
    private String technologyName;

    @Column(name = "time_slot")
    private String timeslot;

    @Column(name = "mentor_id")
    private Long mentorId;

    @Column(name = "avg_rating")
    private Float avgRating;

    public Course() {
    }

    public Course(String technologyName, String timeslot, Long mentorId, Float avgRating) {
        this.technologyName = technologyName;
        this.timeslot = timeslot;
        this.mentorId = mentorId;
        this.avgRating = avgRating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTechnologyName() {
        return technologyName;
    }

    public void setTechnologyName(String technologyName) {
        this.technologyName = technologyName;
    }

    public String getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }

    public Long getMentorId() {
        return mentorId;
    }

    public void setMentorId(Long mentorId) {
        this.mentorId = mentorId;
    }

    public Float getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(Float avgRating) {
        this.avgRating = avgRating;
    }
}
