/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraCredit_Mahesh;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

/**
 *
 * @author mahesh
 */
public class CurlyCheckerIO_helper {

    public static void display(String s, Stack st, boolean b) {

        // Char array of curly from file
        Character[] file = getArray(s);

        //Find last element in array that is not null
        int end = findLastElement(file);

        //Print arrays, but not null
        printArray(file, end);

        //Pushes and pops to stack
        b = bChecker(file, st, end);

        //prints if stack is balanced or not
        balanced(s, st, b);

    }

    public static Character[] getArray(String s1) {

        // initializing the character array
        Character[] fileArray = new Character[100];
        File myObj = new File(s1);
        int count = 0; // it will keep track of insertion in file array

        // reading data from the file character by character
        try (FileReader myReader = new FileReader(myObj)) {
            int content;
            while ((content = myReader.read()) != -1) {
                char curly = (char) content;
                // if it is a curly braces, append it into array
                if (curly == '{' || curly == '}') {
                    fileArray[count++] = curly;
                }
            }
            myReader.close();
        } catch (IOException e) {
            System.out.println("File Not Found!, " + e.getMessage());
            System.exit(0);
        }

        return fileArray;
    }

    public static int findLastElement(Character[] file) {
        int i = 0;
        for (i = 0; i < file.length; i++) {
            if (file[i] == null) {
                break;
            }
        }
        return i;
    }

    public static void printArray(Character[] c, int end) {

        for (int j = 0; j < end; j++) {
            System.out.print(c[j] + ", ");
        }
        System.out.println();

    }

    public static void balanced(String s1, Stack<Character> stack, boolean test) {

        if (!test && stack.empty()) {
            System.out.println(s1 + " is Balanced!");
        } else {
            test = true;
            System.out.println(s1 + " is Not Balanced.");
        }

    }

    public static boolean bChecker(Character[] file, Stack<Character> stack, int end) {

        boolean test = false;  // it will be assigned true if it is bad close
        OUTER:
        for (int k = 0; k < end; k++) {
            if (null == file[k]) {
                System.out.println("Move along, nothing to see here.");
            } else {
                switch (file[k]) {
                    case '{':
                        stack.push(file[k]);
//                           
                        break;
                    case '}':
                        if (!stack.isEmpty()) {
                            stack.pop();
                        } else {
                            test = true;
                            break OUTER;
                        }
                        break;
                    default:
                        System.out.println("Move along, nothing to see here.");
                        break;
                }
            }
        }
        // returns the value whether it is bad close or not
        return test;

    }

}
