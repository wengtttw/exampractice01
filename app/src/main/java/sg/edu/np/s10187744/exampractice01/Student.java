package sg.edu.np.s10187744.exampractice01;

public class Student {
    private String name;
    private String school;

    public Student (String Name, String School){
        name = Name;
        school = School;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
