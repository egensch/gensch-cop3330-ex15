/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;
import java.util.Scanner;

public class exercise15{
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);

        System.out.print("What is your username? ");
        String username = login.nextLine();

        String password = "abc$123";
        System.out.print("What is the password? ");
        String guess = login.nextLine();

        if (guess.equals(password))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }

    }
}