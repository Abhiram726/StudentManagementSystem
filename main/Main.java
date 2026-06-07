package main;

import java.util.Scanner;

class AddStud{

    int roll;
    String name;
    char gender;
    String dob;
    double grade;
}

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Add Student\n2. View Student\n3. Delete Student\n4. Exit");
        
        int option = scan.nextInt();

        switch (option){
            case 1:
                AddStud s1 = new AddStud();
                System.out.println("Add Student details : \n");

                System.out.println("Enter Roll number : ");
                s1.roll = scan.nextInt();
                System.out.println("Enter Name : ");
                s1.name = scan.nextLine();
                System.out.println("Enter Gender : ");
                s1.gender = scan.next().charAt(0);
                System.out.println("Enter Date of Birth : (in YYYY-MM-DD format please!)");
                s1.dob = scan.nextLine();
                System.out.println("Enter Grade : (Upto two decimals)");
                s1.grade = scan.nextDouble();

                System.out.println(s1.roll + " : " + s1.name  + " : " + s1.dob + " : " + s1.gender + " : " + s1.grade);

        }
    }
}
