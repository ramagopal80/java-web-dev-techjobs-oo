package org.launchcode.techjobs_oo;

//import java.util.Objects;

public class PositionType extends JobField {


    public PositionType() {
        super();
    }

    public PositionType(String value) {
        super(value);
    }

}
//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//
//
//    @Override
//    public String toString() {
//        return "PositionType{" +
//                "value='" + value + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof PositionType)) return false;
//        PositionType that = (PositionType) o;
//        return getId() == that.getId() &&
//                getValue().equals(that.getValue());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId(), getValue());
//    }
//// TODO: Add a custom toString() method that returns the data stored in 'value'.
//
//    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
//    //  their id fields match.
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//}
