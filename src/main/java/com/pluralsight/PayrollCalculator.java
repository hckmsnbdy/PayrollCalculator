package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Employee [] employees = new Employee[8];
//        employees[0]= {" "," "};

        try {
//            Scanner scan = new Scanner(System.in);
//            System.out.println(" ");
//            System.out.print("Enter the name of the customer: ");
//            String employee = scan.nextLine();

            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            String input;

            while((input = bufReader.readLine()) != null) {

//                System.out.println(input);
                String [] employeeList = input.split("[|]");
                //for (String employee1:employeeList){

                System.out.println(employeeList[0]);
            }




            //}

//            Employee employee1=new Employee();

//            id|name|hours-worked|pay-rate
//            10|Dana Wyatt|52.5|12.50
//            20|Ezra Aiden|17|16.75
//            30|Brittany Thibbs|40|16.50
//            40|Zephaniah Hughes|2|10.0
//            50|Caylee Callahan|35|15.50
//            60|Zane Stephens|45|13.50
//            70|Maverick Cummings|25.5|16.50
//            80|Kamari Todd|32|14.50



            bufReader.close();
        } catch (IOException e) {
            e.printStackTrace();
//            System.out.println("Please only write the exact name of the story and try again.");
        }
    }
}
