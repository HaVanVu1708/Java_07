package Lesson7;

public class Student {
    private String name;
    private String address;
    private double sum;

    private String[] courses;
    private int[] grades;
    private int numCourses;
    private static final int MAX_COURSES = 30;

    public Student(String name, String address){
        this.name = name;
        this.address = address;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
        numCourses = 0;
    }

    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String toString(){
        return name + "(" + address + ")";
    }

    public void addCoursesGrade(String course, int grade){
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++numCourses;
    }

    public void printGrades(){
        System.out.print(name);
        for (int i = 0; i < numCourses; ++i){
            System.out.print(" " + courses[i] + ";" + grades[i]);
        }
        System.out.println();
    }
    public double getAverageGrade(){
        int I = 0;
        for (int i = 0; i <numCourses; i++){
            sum += grades[i];
        }
        return (double)sum/numCourses;
    }
}
