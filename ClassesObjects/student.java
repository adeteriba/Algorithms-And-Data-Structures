public class Student{
    private String name;
    private String course;
    private int studentID;
    
    private static int lastStudentID = 1000;
    
    public Student(){
        name = "Louise Johnson";
        course = "Computational Thinking";
        studentID = lastStudentID;
        lastStudentID++;
    }
    public Student(String name, String course){
        this.name = name;
        this.course = course;
        studentID = lastStudentID;
        lastStudentID++;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCourse(){
        return name;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public String getStudentID(String studentID){
        return studentID;
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }
    public void showStudent(){
        String res = "\nName: " + name;
        res += "\nCourse: " + course;
        res += "\nStudent ID: " + studentID;
        System.out.println(res);
    }
}
