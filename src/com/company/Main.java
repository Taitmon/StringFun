package com.company;

import static com.company.StringUtil.*;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("First Character is " + getFirstCharacter("Hello"));
        System.out.println("First Character is " + getFirstCharacter("Goodbye"));

        System.out.println("Last Character is " + getLastCharacter("Hello"));
        System.out.println("Last Character is " + getLastCharacter("Goodbye"));

        System.out.println("First two Characters are " + getFirstTwoCharacter("Hello"));
        System.out.println("First two Characters are " + getFirstTwoCharacter("Goodbye"));

        System.out.println("Last two Characters are " + getLastTwoCharacter("Hello"));
        System.out.println("Last two Characters are " + getLastTwoCharacter("Goodbye"));

        System.out.println("All But the First Three Characters are " + getAllButFirstThreeCharacters("Hello"));
        System.out.println("All But the First Three Characters are " + getAllButFirstThreeCharacters("Goodbye"));

        System.out.println("Every other character is " + getEveryOtherCharacter("SEEKCARWEST"));

        getPrintCharacters("Hello");

        printPhoneNumber("501-555-0100");
        printPhoneNumber("800-951-5489");

        System.out.println("The postion of the first e is: " + findFirstE("Hello"));
        System.out.println("The postion of the first e is: " + findFirstE("Goodbye"));

        System.out.println("The value passed in is Finn: " + isFinn("Finn"));
        System.out.println("The value passed in is Finn: " + isFinn("Jake"));


    }
}
