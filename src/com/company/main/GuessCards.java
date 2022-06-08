package com.company.main;

import com.company.dicts.*;
import java.util.HashMap;
import java.util.Scanner;

public class GuessCards{

    public static void guessingCard(HashMap<String, String> dictSrcDes){
        System.out.println();
        System.out.println("2. (G)uessing a flash card (G)");

        String goLang = ManagerDict.setLanuage(dictSrcDes);
        //dictScrDes = RandomTesting(goLang, dictScrDes);

        boolean guessACard = true;
        while(guessACard){
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter an English word:");
            String kWord = input.nextLine();
            String vWord = dictSrcDes.get(kWord);
            System.out.println("Please guess the relating " + goLang + " word");
            String gWord = input.nextLine();

            if(dictSrcDes.containsKey(kWord) && gWord.equalsIgnoreCase(vWord)){
                System.out.println("That's great! You're correct.");
                System.out.println("Word for " + kWord + " is " + vWord);

            } else if(dictSrcDes.containsKey(kWord) && !gWord.equalsIgnoreCase(vWord)){
                System.out.println("It's a pity, but you're wrong.");
                System.out.println("Word for " + kWord + " should be " + vWord);

            } else if(!dictSrcDes.containsKey(kWord)){
                System.out.println("SORRY, No word available in current dictionary.");
            }
            System.out.println();

            System.out.println("Have another guess? y/n");
            String yesNo = input.nextLine();

            boolean tryGuessAgain = true;
            while(tryGuessAgain){
                if(yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")){
                    System.out.println("OK, guess a word again.");
                    tryGuessAgain = false;

                }else if(yesNo.equalsIgnoreCase("n") || yesNo.equalsIgnoreCase("no")){
                    System.out.println("OK, return to main menu now.");
                    System.out.println("Hit Return go back to MainMenu");
                    Scanner h2r = new Scanner(System.in);
                    String hit2Return = h2r.nextLine();
                    // break;
                    // Frage 6. Why not possible for false or break?
                    return;
                }
            }
        }
    }

}