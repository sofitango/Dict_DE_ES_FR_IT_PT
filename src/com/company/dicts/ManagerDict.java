package com.company.dicts;
// import dicts.*;
import com.company.dicts.*;

import java.util.HashMap;
import java.util.Scanner;

public class ManagerDict{

    public static String setLanuage(HashMap<String, String> dictSrcDes){

        String goLang = "";
        if(dictSrcDes.equals(DictEngDeu.dictEngDeu())){
            goLang = "German";
        } else if(dictSrcDes.equals(DictEngEsp.dictEngEsp())){
            goLang = "Spanish";
        } else if(dictSrcDes.equals(DictEngFra.dictEngFra())){
            goLang = "French";
        } else if(dictSrcDes.equals(DictEngIta.dictEngIta())){
            goLang = "Italian";
        } else if(dictSrcDes.equals(DictEngPrt.dictEngPrt())){
            goLang = "Portugese";
        }
        return goLang;
    }

    public static void setRatingReview(HashMap<String, String> dictSrcDes, int correctWord, int counter, double rateTest, double rateDict){
        setRatingReview10Banner(correctWord, counter, rateTest, rateDict);
        setRatingReview20Dealer(rateTest, rateDict);
        setRatingReview30Footer(dictSrcDes, correctWord, counter, rateTest, rateDict);
    }

    public static void setRatingReview10Banner(int correctWord, int counter, double rateTest, double rateDict){
        // System.out.println(rateTest);
        System.out.println();
        System.out.println("Hit Return to check your test result");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println();

        System.out.println("  test result");
        System.out.println("  - - - - - -");
        System.out.printf("- You tested " + counter + " words, among them " + correctWord + " is/are correct, rate %.2f%%.%n", rateTest);
    }

    public static void setRatingReview30Footer(HashMap<String, String> dictSrcDes, int correctWord, int counter, double rateTest, double rateDict){
        System.out.println("- The current dictionary contains " + dictSrcDes.size() + " word pairs in total");
        System.out.printf("   and you\'ve now tested %.2f%%. Marvelous! Keep on learning!%n", rateDict);
        System.out.println();
    }

    public static void setRatingReview20Dealer(double rateTest, double rateDict){
        int rateTestSwitch = 0;
        if( rateTest == 100.0){
            // rateTestSwitch = 100;
            System.out.println("     It\'s fabulous! Congratulation!");
        } else if( rateTest >= 90.0){
            // rateTestSwitch = 90;
            System.out.println("     Did you do it by yourself? You're almost a genie!");
        } else if( rateTest >= 80.0){
            // rateTestSwitch = 80;
            System.out.println("     Well, no one is perfect. But you're really good!");
        } else if( rateTest >= 60.0){
            // rateTestSwitch = 60;
            System.out.println("     Fantastic, your score is over the average test level!");
        } else if( rateTest >= 40.0){
            // rateTestSwitch = 40;
            System.out.println("     Not bad! You can have another try if you will.");
        } else if( rateTest >= 20.0){
            // rateTestSwitch = 20;
            System.out.println("     For a beginner it is really a good start!");
        } else if( rateTest == 0.0){
            // rateTestSwitch = 00;
            System.out.println("     Every dog has his day. You\'re sure to get better score on next try.");
        } else {
            System.out.println("     I\'m curious if you really do not like our programm.");
        }

/*
        switch(rateTestSwitch){
        case 100:
            System.out.println("     It\'s fabulous! Congratulation!");
            break;
        case 90:
            System.out.println("     Did you do it by yourself? You're almost a genie!");
            break;
        case 80:
            System.out.println("     Well, no one is perfect. But you're really good!");
            break;
        case 60:
            System.out.println("     Fantastic, your score is over the average test level!");
            break;
        case 40:
            System.out.println("     Not bad! You can have another try if you will.");
            break;
        case 20:
            System.out.println("     For a beginner it is really a good start!");
            break;
        case 00:
            System.out.println("     Every dog has his day. You\'re sure to get better score on next try.");
            break;
        default :
            System.out.println(" Don\'t you think something goes wrong here?");
            break;
        }
*/
    }

}

