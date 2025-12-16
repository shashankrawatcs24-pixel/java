
import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}
 
class Student {
    private String usn;
    private String studName;
    private int studAge;
    private int studSem;

    public void acceptData() throws AgeException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USN: ");
        usn = sc.nextLine();

        System.out.print("Enter Name: ");
        studName = sc.nextLine();

        System.out.print("Enter Age: ");
        studAge = sc.nextInt();

        
        if (studAge < 4 || studAge > 24) {
            throw new AgeException("Invalid Age! Age must be between 4 and 24.");
        }

        System.out.print("Enter Semester: ");
        studSem = sc.nextInt();
    }

    
    public void displayData() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + studName);
        System.out.println("Age: " + studAge);
        System.out.println("Semester: " + studSem);
        System.out.println("---------------------------");
    }
}


public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            try {
                System.out.println("\nEnter details for Student " + (i + 1) + ":");
                students[i].acceptData();
            } catch (AgeException e) {
                System.out.println("Error: " + e.getMessage());
                i--; 
            }
        }

        System.out.println("\n--- Student Details ---");
        for (int i = 0; i < n; i++) {
            students[i].displayData();
        }
    }
}
