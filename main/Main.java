package main;

import java.util.HashMap;
import java.util.Map;

class Students {

    int roll;
    String name;
    char gender;
    String dob;
    double grade;
    Map<Integer, Students> studDetails;

    public Students() {
        this.studDetails = new HashMap<>();
    }

    public Students(int roll) {
        this();
        this.roll = roll;
    }

    public void addStudent(Students s) {
        studDetails.put(s.roll, s);
        System.out.println("Added");
    }

    public void viewStudents() {
        System.out.println("List of Students :- " + studDetails.keySet());
        for (Students s : studDetails.values()) {
            System.out.printf("%d | %s | %s | %c | %.2f%n", s.roll, s.name, s.dob, s.gender, s.grade);
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);

        System.out.println("1. Add Student\n2. View Students\n3. Delete Student\n4. Exit");

        Students s1 = new Students();
        s1.roll = 1;
        s1.name = "Abhi";
        s1.dob = "2004-06-16";
        s1.gender = 'M';
        s1.grade = 6.75;

        // System.out.println(s1.name + s1.roll + s1.dob);

        Students manager = new Students();

        Students s2 = new Students();
        s2.roll = 726;
        s2.name = "Sam";
        s2.dob = "2003-08-08";
        s2.gender = 'F';
        s2.grade = 9.00;

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.viewStudents();

        // System.out.println(s2.name + s2.roll + s2.dob);

        // int num = scan.nextInt();

        // Students student[] = new Students[5];

        // for(Students stud : student){
        // System.out.println(stud.roll + " | " + stud.name + " | " + stud.dob);
        // }

        /*
         * switch (option) {
         * 
         * case 1:
         * Students s1 = new Students();
         * System.out.println("Add Student details : \n");
         * 
         * System.out.println("Enter Roll number : ");
         * s1.roll = scan.nextInt();
         * System.out.println("Enter Name : ");
         * s1.name = scan.nextLine();
         * System.out.println("Enter Gender : ");
         * s1.gender = scan.next().charAt(0);
         * System.out.println("Enter Date of Birth : (in YYYY-MM-DD format please!)");
         * s1.dob = scan.nextLine();
         * System.out.println("Enter Grade : (Upto two decimals)");
         * s1.grade = scan.nextDouble();
         * scan.close();
         * 
         * System.out.println(s1.roll + " : " + s1.name + " : " + s1.dob + " : " +
         * s1.gender + " : " + s1.grade);
         * 
         * break;
         * case 2:
         * ViewStuds disp = new ViewStuds();
         * disp.dispStuds();
         * break;
         * case 3:
         * 
         * }
         */

    }
}
