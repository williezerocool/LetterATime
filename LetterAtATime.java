/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letteratatime;

import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class LetterAtATime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);

		System.out.print("What is your message? ");
		String message = kb.nextLine();

		System.out.println("\nYour message is " + message.length() + " characters long.");
		System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
		int lastpos = message.length() - 1;
		System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
		System.out.println("\nHere are all the characters, one at a time:\n");

                //a error happens when i <= message.length()
                //box ranges from 0-2 and x has the value of 2
		for ( int i=0; i<message.length(); i++ )
		{
			System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
		}

		int a_count, e_count, i_count, o_count, u_count;
                a_count = 0;
                e_count = 0;
                i_count = 0;
                o_count = 0;
                u_count = 0;

		for ( int i=0; i< message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'a' || letter == 'A' )
			{
				a_count++;
			}
                        if ( letter == 'e' || letter == 'E' )
			{
				e_count++;
			}
                        if ( letter == 'i' || letter == 'I' )
			{
				i_count++;
			}
                        if ( letter == 'o' || letter == 'O' )
			{
				o_count++;
			}
                        if ( letter == 'u' || letter == 'U' )
			{
				u_count++;
			}
		}

		System.out.println("\nYour message contains these many vowels " + a_count + " a's " + e_count + " e's " + i_count + " i's " + o_count + " o's & " + u_count + " u's.");
    }
    
}
