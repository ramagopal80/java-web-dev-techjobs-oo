package org.launchcode.techjobs_oo;

import java.lang.reflect.Field;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job(){
        this.id = nextId;
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

    @Override
    public String toString() {
        String[] labels = {"ID: ", "Name: ", "Employer: ", "Location: ", "Position Type: ", "Core Competency: "};
        Field[] fields = Job.class.getDeclaredFields();
        String unavailable = "Data not available";
        String message = "\n";
        int index = 0;

        for (Field f : fields) {
            if (f.getName() == "nextId") {

            } else {
                try {

                    if (f.get(this) instanceof JobField) {

                        if (((JobField) f.get(this)).getValue() == "") {
                            // print unavailable
                            message = message + labels[index] + unavailable + "\n";
                        } else {
                            // else, print job field value
                            message = message + labels[index] + f.get(this) + "\n";
                        }
                    } else if (f.get(this) == null || f.get(this) == "") {
                        // contains only id

                        message = "OOPS! This job does not seem to exist." ;
                    } else {
                        // else, print non-job-field value (eg. name value)
                        message = message + labels[index] + f.get(this) + "\n";
                    }
                    index++;
                } catch (Exception e) {
                    message = message + labels[index] + unavailable + "\n";
                    index++;
                }
            }
        }

        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

    public String getName() {

        return name;
    }

    public Employer getEmployer() {

        return employer;
    }

    public Location getLocation() {

        return location;
    }

    public PositionType getPositionType() {

        return positionType;
    }

    public CoreCompetency getCoreCompetency() {

        return coreCompetency;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setEmployer(Employer employer) {

        this.employer = employer;
    }

    public void setLocation(Location location) {

        this.location = location;
    }

    public void setPositionType(PositionType positionType) {

        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {

        this.coreCompetency = coreCompetency;
    }

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
