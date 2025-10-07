package com.pluralsight;
import java.io.BufferedWriter;
import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
    try {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the employee file to process:");
        String fileName = scan.nextLine();

        FileReader fileReader = new FileReader("src/main/resources/"+fileName+".csv");
        BufferedReader bufReader = new BufferedReader(fileReader);


        System.out.print("Enter the name of the payroll file to create:");
        String payrollFile = scan.nextLine();

        FileWriter writer = new FileWriter(fileName+".csv");
        FileWriter fileWriter = new FileWriter("src/main/resources/"+payrollFile+".csv"); //open docs
        BufferedWriter bufWriter = new BufferedWriter(fileWriter); //we want to write to that file

        bufReader.readLine(); //Alternative method to skip first line of csv file
        bufWriter.write("EmployeeID: %d\nEmployee Name: %s\nGross Pay: $%.2f\n\n", employeeList[count].getEmployeeId(), employeeList[count].getName(), employeeList[count].getGrossPay());
            String input;

            Employee[] employeeList = new Employee[10];

            int count = 0;


            while((input = bufReader.readLine()) != null) {
                String[] tokens = input.split("\\|");
                if (!tokens[0].equals("id")) { //Skipping the header row

                    int id = Integer.parseInt(tokens[0]); //id
                    String name = tokens[1];
                    double hoursWorked = Double.parseDouble(tokens[2]);
                    double payRate = Double.parseDouble(tokens[3]);

                    employeeList[count] = new Employee(id, name, hoursWorked, payRate);

                    System.out.printf("EmployeeID: %d\nEmployee Name: %s\nGross Pay: $%.2f\n\n", employeeList[count].getEmployeeId(), employeeList[count].getName(), employeeList[count].getGrossPay());

                    count++;
                }

            }

            System.out.println(employeeList[0].getName());

    }
    catch (IOException e) {
        System.out.println("ERROR:  An unexpected error occurred");
        e.getStackTrace();
    }
}

//    public static void main(String[] args) {
//        try {
//            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
//            BufferedReader bufReader = new BufferedReader(fileReader);
//
////            bufReader.readLine(); //Alternative method to skip first line of csv file
//
//            String input;
//
//            Employee[] employeeList = new Employee[10];
//
//            int count = 0;
//
//
//            while((input = bufReader.readLine()) != null) {
//                String[] tokens = input.split("\\|");
//                if (!tokens[0].equals("id")) { //Skipping the header row
//
//                    int id = Integer.parseInt(tokens[0]); //id
//                    String name = tokens[1];
//                    double hoursWorked = Double.parseDouble(tokens[2]);
//                    double payRate = Double.parseDouble(tokens[3]);
//
//                    employeeList[count] = new Employee(id, name, hoursWorked, payRate);
//
//                    System.out.printf("EmployeeID: %d\nEmployee Name: %s\nGross Pay: $%.2f\n\n", employeeList[count].getEmployeeId(), employeeList[count].getName(), employeeList[count].getGrossPay());
//
//                    count++;
//                }
//
//            }
//
//            System.out.println(employeeList[0].getName());
//
//            bufReader.close();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }
}


//package com.pluralsight;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class PayrollCalculator {
//    public static void main(String[] args) {
//
//        Employee [] employees = new Employee[8];
//
//        try {
//
//            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
//            BufferedReader bufReader = new BufferedReader(fileReader);
//
//            String input;
//
//            while((input = bufReader.readLine()) != null) {
//
//                String [] employeeList = input.split("[|]");
//                if (!employeeList[0].equals("id")){
//                    int id = Integer.parseInt(employeeList[0]);
//                    String name = employeeList[1];
//                    double hoursWorked = Double.parseDouble(employeeList[2]);
//                    double payRate = Double.parseDouble(employeeList[3]);
//                    Employee eList = new Employee(id, name, hoursWorked, payRate);
//                    System.out.printf("EmployeeID: %d\nEmployee Name: %s\nGross Pay: $%.2f\n\n", employeeList[count].getEmployeeId(), employeeList[count].getName(), employeeList[count].getGrossPay());
//                }
//            }
//            bufReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
