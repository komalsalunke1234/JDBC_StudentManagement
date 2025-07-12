import static com.student.manage.StudentDao.updateAllstudent;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Starts {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Student Management App");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\nPress 1 to Add student");
            System.out.println("Press 2 to Delete student");
            System.out.println("Press 3 to Display all students");
            System.out.println("Press 4 to Update student");
            System.out.println("Press 5 to Exit app");
            System.out.print("Enter your choice: ");

            int c;
            try {
                c = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (c) {
                case 1:
                    System.out.print("Enter User Name: ");
                    String name = br.readLine();

                    System.out.print("Enter User Phone: ");
                    String phone = br.readLine();

                    System.out.print("Enter User City: ");
                    String city = br.readLine();

                    Student st = new Student(name, phone, city);
                    boolean added = StudentDao.insertStudentToDB(st);
                    if (added) {
                        System.out.println("Student added successfully...");
                    } else {
                        System.out.println("Something went wrong. Try again...");
                    }
                    break;

                case 2:
                    System.out.print("Enter student ID to delete: ");
                    int userId;
                    try {
                        userId = Integer.parseInt(br.readLine());
                    } catch (Exception e) {
                        System.out.println("Invalid ID input.");
                        break;
                    }
                    boolean deleted = StudentDao.deleteStudent(userId);
                    if (deleted) {
                        System.out.println("Deleted successfully.");
                    } else {
                        System.out.println("Something went wrong...");
                    }
                    break;

                case 3:
                    System.out.println("Displaying all students:");
                    StudentDao.showAllstudent();
                    break;

                case 4:
                    System.out.print("Enter student ID to update: ");
                    int id;
                    try {
                        id = Integer.parseInt(br.readLine());
                    } catch (Exception e) {
                        System.out.println("Invalid ID input.");
                        break;
                    }

                    System.out.print("Enter new name: ");
                    String upName = br.readLine();

                    System.out.print("Enter new phone: ");
                    String upPhone = br.readLine();

                    System.out.print("Enter new city: ");
                    String upCity = br.readLine();

                    boolean updated = updateAllstudent(id, upName, upPhone, upCity);
                    if (updated) {
                        System.out.println("Student updated successfully.");
                    } else {
                        System.out.println("Something went wrong...");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the app!");
                    br.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
