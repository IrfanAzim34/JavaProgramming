package day39_Recap.student;

public class CydeoStudent extends Student{

    private int bachNumber, groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, char gender, int studentID, String fieldOfStudy, char grade, int bachNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentID, fieldOfStudy, grade, "Cydeo");
        setBachNumber(bachNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    public void setBachNumber(int bachNumber) {
        if (bachNumber <= 0){
            System.err.println("Invalid Bach Number: " + bachNumber);
            System.exit(1);
        }
        this.bachNumber = bachNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber <= 0){
            System.err.println("Invalid Group Number: " + groupNumber);
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.isBlank() || programmingLanguage.isEmpty()){
            System.err.println("Invalid Programming Language: " + programmingLanguage);
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public int getBachNumber() {
        return bachNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food + " while typing " + programmingLanguage);
    }

    @Override
    public void drink(String drink) {
        System.out.println(getName() + " is eating " + drink + " while typing " + programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping after finished tasks of " + programmingLanguage);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentID=" + getStudentID() +
                ", fieldOfStudy=" + getFieldOfStudy() +
                ", grade=" + getGrade() +
                ", schoolName=" + getSchoolName() +
                ", bachNumber=" + bachNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage=" + programmingLanguage +
                '}';
    }
}
