public class Student {
    private String name, major;
    private double gpa;
    public Student(){

    }
    public Student(String name, String major){

    }
    public Student(String name, String major, double gpa){
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }
    public String getName(){

        return name;
    }
    public void setName(String name){

        this.name = name;
        
    }
    public String getMajor(){

        return major;
    }
    public void setMajor(String major){

        this.major = major;
    }
    public double getGPA(){

        return gpa;
    }
    public void setGPA(double gpa){

        this.gpa = gpa;
    }
    @Override
    public String toString(){

        return ("Name: " + name + " Major: " + major + " GPA:" + gpa);
    }
    public boolean equals(Student obj) {
        return this.name.equals(obj.getName()) && this.major.equals(obj.getMajor());
    }

}
