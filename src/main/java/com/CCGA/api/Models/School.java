package com.CCGA.api.Models;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "schools")
public class School {
    @Id
    @GeneratedValue
    private int schoolID;

    @Column(unique = true)
    private String name;

    @Column
    private Location location;

    @OneToMany
    private List<Major> majorsOffered;

    @Column
    private LocalTime createdAt;

    @Column
    private LocalTime updatedAt;

    public School() {
        createdAt = LocalTime.now();
        updatedAt = LocalTime.now();
    }

    public School(String name, Location location, List<Major> majorsOffered) {
        this.name = name;
        this.location = location;
        this.majorsOffered = majorsOffered;
        createdAt = LocalTime.now();
        updatedAt = LocalTime.now();
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Major> getMajorsOffered() {
        return majorsOffered;
    }

    public void setMajorsOffered(List<Major> majorsOffered) {
        this.majorsOffered = majorsOffered;
    }

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        School school = (School) o;

        return schoolID == school.schoolID;
    }

    @Override
    public int hashCode() {
        return schoolID;
    }

    @Override
    public String toString() {
        return "School{" +
            "schoolID=" + schoolID +
            ", name='" + name + '\'' +
            ", location=" + location +
            ", majorsOffered=" + majorsOffered +
            '}';
    }
}