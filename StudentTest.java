public class StudentTest extends Student{
    public static void main(String[]args){
        Student Student1 = new Student("John", "CS", 3.5);
        Student Student2 = new Student();
        
        Student2.setName("Mary Ann");
        Student2.setMajor("CE");
        Student2.setGPA(3.3);

        System.out.println(Student1);
        System.out.println(Student2);


    }
}
