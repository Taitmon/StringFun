package com.company;

public class StringUtil
{
    public static String getFirstCharacter (String text)
    {
        String firstCharacter = text.substring(0,1);
        return firstCharacter;
    }
    public static String getLastCharacter (String text)
    {
        String lastCharacter = text.substring(text.length()-1);
        return lastCharacter;
    }

    public static String getFirstTwoCharacter (String text)
    {
        String FirstTwoCharacter  = text.substring(0, 2);
        return FirstTwoCharacter ;
    }
    public static String getLastTwoCharacter (String text)
    {
        String LastTwoCharacter = text.substring(text.length()-2);
        return LastTwoCharacter;
    }
    public static String getAllButFirstThreeCharacters (String text)
    {
        String AllButFirstThreeCharacters = text.substring(3);
        return AllButFirstThreeCharacters;
    }

    public static String getEveryOtherCharacter (String text)
    {
        int number1 = 0;

        String getEveryOtherCharacter = "";

        while (number1 <= text.length())
        {
            getEveryOtherCharacter = getEveryOtherCharacter + text.charAt(number1);
            number1 = number1 + 2;
        }


        return getEveryOtherCharacter;
    }

    public static void getPrintCharacters(String text)
    {
        int printCharacters = 0;

        while (printCharacters < text.length())
        {
            System.out.print(text.charAt(printCharacters));
            System.out.print(":");
            System.out.println(printCharacters);
            printCharacters ++;
        }

    }

    public static void printPhoneNumber(String text)
    {
        System.out.println("Area Code: " + text.substring(0, 3) + " Exchange: "
                + text.substring(4,7) + " Line Number: " + text.substring(8, 12));
    }

    public static int findFirstE(String text)
    {
        int index;
        index = text.indexOf('e');
        return index;
    }

    public static boolean isFinn(String text)
    {
        String correctName = "Finn";
        boolean finn = false;
        if (text == correctName)
        {
            finn = true;
        }
        return finn;
    }




}
