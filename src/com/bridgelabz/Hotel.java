package com.bridgelabz;

import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select room:\n1.room1\n2.room2");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Room1");
                Room1 room1 = new Room1("Air", 20000,"long");
                System.out.println(room1.getAc());
                System.out.println(room1.getPrice());
                System.out.println(room1.getBed());
                break;
            case 2:
                System.out.println("Room2");
                Room2 room2 = new Room2("NonAir", 10000,"short");
                System.out.println(room2.getNonAc());
                System.out.println(room2.getPrice());
                System.out.println(room2.getBed());
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
