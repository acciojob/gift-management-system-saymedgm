package com.driver;

import java.util.Scanner;

public class DiwaliGiftSystem {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the department name: ");
        Department dept = new Department(scanner.nextLine());

        System.out.println("Enter the employee's name: ");
        Employee emp = new Employee(scanner.nextLine());

        System.out.println("Enter the type of gift: ");
        Gift gift = new Gift(scanner.nextLine());

        dept.addEmployee(emp);
        emp.receiveGift(gift);

        System.out.println(emp.getName() + " from " + dept.getName() + " department received a " + gift.getType() + "!");
    }
}
