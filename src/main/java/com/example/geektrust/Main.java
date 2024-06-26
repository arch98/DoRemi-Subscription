package com.example.geektrust;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    StreamCalc streamCalc = new StreamCalc();
       // Sample code to read from file passed as command line argument
        try {
            // the file to be opened for reading
            FileInputStream fis = new FileInputStream(args[0]);
            Scanner sc = new Scanner(fis); // file to be scanned
            // returns true if there is another line to read
            while (sc.hasNextLine()) {
               //Add your code here to process input commands
                String[] input = sc.nextLine().split(" ", 2);
               streamCalc.run(input);
            }
            sc.close(); // closes the scanner
        } catch (IOException e) {
        }

    }
}
