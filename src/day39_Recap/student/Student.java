package day39_Recap.student;

public class Student extends Person{
    
    private int studentID;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public Student(String name, int age, char gender, int studentID, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy == null || fieldOfStudy.isEmpty() || fieldOfStudy.isBlank()){
            System.err.println("Invalid Field Of Study: " + fieldOfStudy);
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public void setGrade(char grade) {
        if (!('A' <= grade && grade <= 'F')){
            System.err.println("Invalid Grade: " + grade);
            System.exit(1);
        }
        this.grade = grade;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName == null || schoolName.isEmpty() || schoolName.isBlank()){
            System.err.println("Invalid Field Of Study: " + schoolName);
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void study(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentID=" + studentID +
                ", fieldOfStudy=" + fieldOfStudy +
                ", grade=" + grade +
                ", schoolName=" + schoolName +
                '}';
    }
}
