import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Starts {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to student Management App");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Press 1 to Add student");
            System.out.println("Press 2 to Delete student");
            System.out.println("Press 3 to display student");
            System.out.println("Press 4 to exit app");

            int c = Integer.parseInt(br.readLine());

            switch (c) {
                case 1:
                    System.out.println("Enter User Name : ");
                    String name=br.readLine();
                    System.out.println("Enter User Phone : ");
                    String phone=br.readLine();
                    System.out.println("Enter User City : ");
                    String city =br.readLine();
                    

                    Student st=new Student(name,phone,city);
                    
                   boolean answer=StudentDao.insertStudentToDB(st);
                   if(answer){
                    System.out.println("student is added successfully...");

                   }
                   else{
                    System.out.println("something went wrong. try again...");
                   }
                   System.out.println(st);

                    break;
                case 2:
                    System.out.println("Enter student id to delete : ");
                    int userId=Integer.parseInt(br.readLine());
                    boolean f=StudentDao.deleteStudent(userId);
                    if(f){
                        System.out.println("Deleted....");
                    }
                    else{
                        System.out.println("something went wrong......");
                    }
                    break;
                case 3:
                    System.out.println("Disply the students :");
                    StudentDao.showAllstudent();
                    break;
                case 4:
                    System.out.println("Thank you for using the app!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
