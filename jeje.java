//******************************************************************
// Filename: jeje.java
// Date:    10/16/2020
// Subject: ITMC212 
// Semester: Second Semester, S/Y 2019 - 2020
// 
// Program Title: Jejemon
// Program Description:  a Java Program that takes a string INPUT and outputs INPUT's jejemon translation.
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
import java.util.Scanner;
public class jeje {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbersOfCharactersReplaced = 0;
        System.out.print("Input a string ");
        String words = input.nextLine();
        StringBuilder jejeWords = new StringBuilder(words); 
        for(int characterIndex = 0; characterIndex < words.length(); characterIndex++)
        {
            if(words.charAt(characterIndex) == 'a')
            {
                jejeWords.setCharAt(characterIndex, '@'); 
                numbersOfCharactersReplaced++;

            }
            else if(words.charAt(characterIndex) == 'b')
            {
        
                jejeWords.setCharAt(characterIndex, '8'); 
                numbersOfCharactersReplaced++;

            }
            else if(words.charAt(characterIndex) == 'c')
            {
        
                jejeWords.setCharAt(characterIndex, '(');
                numbersOfCharactersReplaced++; 

            }
            else if(words.charAt(characterIndex) == 'e')
            {
        
                jejeWords.setCharAt(characterIndex, '3'); 
                numbersOfCharactersReplaced++;

            }
            else if(words.charAt(characterIndex) == 'h')
            {
        
                jejeWords.setCharAt(characterIndex, '#'); 
                numbersOfCharactersReplaced++;

            }
            else if(words.charAt(characterIndex) == 'i')
            {
        
                jejeWords.setCharAt(characterIndex, '!');
                numbersOfCharactersReplaced++; 

            }
            else if(words.charAt(characterIndex) == 'k')
            {
        
                jejeWords.setCharAt(characterIndex, '&');
                numbersOfCharactersReplaced++; 

            }
            else if(words.charAt(characterIndex) == 'o')
            {
        
                jejeWords.setCharAt(characterIndex, '0'); 
                numbersOfCharactersReplaced++;

            }
            else if(words.charAt(characterIndex) == 's')
            {
        
                jejeWords.setCharAt(characterIndex, '$');
                numbersOfCharactersReplaced++; 

            }
            else if(words.charAt(characterIndex) == 'x')
            {
        
                jejeWords.setCharAt(characterIndex, '+'); 
                numbersOfCharactersReplaced++;

            }
        }   
            
            System.out.print("Jejemon: " + jejeWords + "\n" + "\n");
            System.out.print("Number of Characters Replaced: " + numbersOfCharactersReplaced + "\n");
            System.out.print("Percentage of Characters Replaced: " + ((numbersOfCharactersReplaced * 100)/words.length()) + "%");
            
    }
}