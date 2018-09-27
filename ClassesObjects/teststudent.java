import java.util.Scanner;

public class TestStudent{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        Student s[] = new Student[3];//array of students
        for(int i = 0;i<3;i++){
            s[i] = new Student(sc.nextLine(),sc.nextLine());
        }
        s[0].showStudent();
        s[1].showStudent();
        s[2].showStudent();
        
        s[0].setCourse("CSSE");
        s[0].getCourse();
        Student s1 = new Student();
        String str = sc.nextLine();
    }
}
