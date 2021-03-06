package com.company.main;

import com.company.dicts.*;

import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

public class VerifyAWord {

    public static HashMap<String, String> verifyAWord(HashMap<String, String> dictSrcDes) throws IOException {
        System.out.println();
        System.out.println("Method 8. (V)erify a word in all flash cards (V)");

        String goLang = ManagerDict.setLanguage(dictSrcDes);
        dictSrcDes = verifyAWord(goLang, dictSrcDes);

        System.out.println();
        System.out.println("Hit Return to return to MainMenu");
        Scanner h2r = new Scanner(System.in);
        String hit2Return = h2r.nextLine();
        System.out.println();
        return dictSrcDes;
    }

    public static HashMap<String, String> verifyAWord(String goLang, HashMap<String, String> dictSrcDes) {
        Scanner input = new Scanner(System.in);

        boolean verifyAWord = true;
        while (verifyAWord) {
            System.out.println("Please enter the word to verify from all flash cards:");
            String wordToVerify = input.nextLine();

            int dictSize = dictSrcDes.size();
            for (int i = 0; i < dictSize; i++) {
                for (String key : dictSrcDes.keySet()) {
                    String value = dictSrcDes.get(key);
                    if (wordToVerify.equalsIgnoreCase(key)) {
                        System.out.println("Word \"" + key + "\" can be verified in the flash cards.");
// FRAGE!!!             i = dictSize; // ??? Why must be needed ???
                        i = dictSize; // ??? Why must be needed ???
                        break;
                    } else if (wordToVerify.equalsIgnoreCase(value)) {
                        System.out.println("Word \"" + value + "\" can be verified in the flash cards.");
                        i = dictSize;
                        break;
                    }

// FRAGE!!! Why not? Wo ist der Denkfehler mit if...else...???
//                    else {
//                        if (i < dictSize - 1) {
//                            break;
//                        } else
//                            System.out.println("Word \"" + wordToVerify + "\" can not be verified in current dictionary.");
//                        i = dictSize;
//                    }
//                }
//            }

                }
                if((dictSize-1)==i){
                    System.out.println("Word \"" + wordToVerify + "\" can not be verified in current dictionary.");
                }
            }

            System.out.println();
            System.out.println("Verify another word? (y)es/(n)o");
            String yesNo = input.nextLine();
            System.out.println();

            boolean verifyAWordAgain = true;
            while (verifyAWordAgain) {
                if (yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")) {
                    System.out.println("OK, input words again.");
                    verifyAWordAgain = false;

                } else if (yesNo.equalsIgnoreCase("n") || yesNo.equalsIgnoreCase("no")) {
                    System.out.println("OK, return to main menu.");
                    verifyAWord = false;
                    verifyAWordAgain = false;

                } else {
                    System.out.println("Input wrong. Please type y/Yes or n/No.");
                    verifyAWordAgain = false;
                }
            }
        }
        // System.out.println(dictSrcDes); // Del
        System.out.println();
        return dictSrcDes;
    }

}

