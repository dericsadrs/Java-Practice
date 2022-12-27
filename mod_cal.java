//******************************************************************
// Filename: mod_cal.java
// Date:    9/28/2020
// Subject: ITMC212 
// Semester: Second Semester, S/Y 2019 - 2020
// 
// Program Title: Modified Calculator
// Program Description: 
// Input:
// Output:
//
// Honor Code:
//   This is my own program. I have not received any        
//   unauthorized help in completing this work. I have not  
//   copied from my classmate, friend, nor any unauthorized 
//   resource. I am well aware of the policies stipulated   
//   in the handbook regarding academic dishonesty. If proven 
//   guilty, I won't be credited any points for this activity.
//
// Complete Name: San Andres Deric C
// ID Number: 201910320
// Year-Course: 2-BSIT
// DCS, College of Computer Studies
// Ateneo de Naga University
import java.util.Scanner; // To use input

class mod_cal{ 
    public static void main(String[] args) {

        Scanner SysIn = new Scanner(System.in); //scanner
        System.out.print("-> Please input NUM1: ");
        float NUM1 = SysIn.nextFloat();         //input num1
        System.out.print("-> Please input NUM2: ");
        float NUM2 = SysIn.nextFloat();          //input num2
        System.out.print("-> Please input an OPERATOR ");
        String OPERATOR = SysIn.next();           // input operator

        if (OPERATOR.charAt(0) == '+') {
            System.out.println( "-> OUTPUT: " + (NUM1 + NUM2));
        }
        else if (OPERATOR.charAt(0) == '-') {
               System.out.println( "-> OUTPUT: " + (NUM1 - NUM2));
        }
        
       else if (OPERATOR.charAt(0) == '*') {
            System.out.println( "-> OUTPUT: " + (NUM1 * NUM2));
        }
        
        else if (OPERATOR.charAt(0) == '/') {
            System.out.println( "-> OUTPUT: " + (NUM1 / NUM2));
        }
        
        else if (OPERATOR.charAt(0) == '%') {
            System.out.println( "-> OUTPUT: " + (NUM1 % NUM2));
        }
        else if (OPERATOR.charAt(0) == '^') {
            System.out.println( "-> OUTPUT: " + (Math.pow(NUM1, NUM2)));
        }
        else if (OPERATOR.charAt(0) == '@') {
            System.out.println( "-> OUTPUT: " + ((NUM1 * 2) + (NUM2 * 2)));
        }
        else if (OPERATOR.charAt(0) == '!' && OPERATOR.charAt(1) == '!') {
			System.out.print("-> OUTPUT: " + NUM1);
		}
		else if (OPERATOR.charAt(0) == '$' && OPERATOR.charAt(1) == '$') {
			System.out.print("-> OUTPUT: " + NUM2);
        }
        else {
            System.out.print("INVALID OPERATOR");
        }

    }
}