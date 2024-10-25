package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

//    @Override
//    public String toString() {
//        return System.lineSeparator() +
//                "ID: " + this.getId() + System.lineSeparator() +
//                "Name: " + this.getName() + System.lineSeparator() +
//                "Employer: " + this.getEmployer().getValue() + System.lineSeparator() +
//                "Location: " + this.getLocation().getValue() + System.lineSeparator() +
//                "Position Type: " + this.getPositionType().getValue() + System.lineSeparator() +
//                "Core Competency: " + this.getCoreCompetency().getValue() +
//                System.lineSeparator();
//    }

    @Override
    public String toString() {

        String name;
        if (this.getName().isEmpty()) {
            name = "Data not available";
        } else {
            name = this.getName();
        }

        String employer;
        if (this.getEmployer().getValue().isEmpty()) {
            employer = "Data not available";
        } else {
            employer = this.getEmployer().getValue();
        }

        String location;
        if (this.getLocation().getValue().isEmpty()) {
            location = "Data not available";
        } else {
            location = this.getLocation().getValue();
        }

        String positionType;
        if (this.getPositionType().getValue().isEmpty()) {
            positionType = "Data not available";
        } else {
            positionType = this.getPositionType().getValue();
        }

        String coreCompetency;
        if (this.getCoreCompetency().getValue().isEmpty()) {
            coreCompetency = "Data not available";
        } else {
            coreCompetency = this.getCoreCompetency().getValue();
        }

        return System.lineSeparator() +
                "ID: " + this.getId() + System.lineSeparator() +
                "Name: " + name + System.lineSeparator() +
                "Employer: " + employer + System.lineSeparator() +
                "Location: " + location + System.lineSeparator() +
                "Position Type: " + positionType + System.lineSeparator() +
                "Core Competency: " + coreCompetency + System.lineSeparator();
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

}
