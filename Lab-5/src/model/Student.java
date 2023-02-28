package model;

public class Student {
    private int ID;
    private String name;
    private double average;

    public Student(int ID, String name, double average) {
        this.ID = ID;
        this.name = name;
        this.average = average;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", average=" + average +
                '}';
    }
}
