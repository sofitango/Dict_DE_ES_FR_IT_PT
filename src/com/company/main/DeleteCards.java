package com.company.main;

import com.company.dicts.*;
import java.util.Scanner;
import java.util.HashMap;

public class DeleteCards{

    public static HashMap<String, String> deleteCards(HashMap<String, String> dictSrcDes){
        System.out.println();
        System.out.println("Method 3. (D)eleting flash cards (D)");

        String goLang = ManagerDict.setLanuage(dictSrcDes);
        dictSrcDes = deletingCards(goLang, dictSrcDes);

        System.out.println();
        System.out.println("Hit Return to return to MainMenu");
        Scanner h2r = new Scanner(System.in);
        String hit2Return = h2r.nextLine();
        System.out.println();
        return dictSrcDes;
    }

    public static HashMap<String, String> deletingCards(String goLang, HashMap<String, String> dictSrcDes){
        Scanner input = new Scanner(System.in);

        boolean deleteWords = true;
        while(deleteWords){
            System.out.println("Please enter the word for deletion from flash cards:");
            String wordSrc = input.nextLine();
            String wordDes = "";

            int dictSize = dictSrcDes.size();
            for(int i=0; i<dictSize; i++){
                for(String key : dictSrcDes.keySet()){
                    String value = dictSrcDes.get(key);
                    if(wordSrc.equalsIgnoreCase(key) || wordSrc.equalsIgnoreCase(value)){
                        wordDes = dictSrcDes.get(key);
                        System.out.println("Searched word \"" + wordSrc + "\" found in flash cards." );
                        System.out.println("Please confirm to REMOVE this word from the dictionary? y(es)/n(o)" );

                        String yesNo = input.nextLine();
                        if(yesNo.equalsIgnoreCase("yes") || yesNo.equalsIgnoreCase("y")) {
                            dictSrcDes.remove(key);
                            System.out.println("Deletion of word pair \"" + wordSrc + " - " + wordDes + "\" completed." );
                            i = dictSize;
                            break;
                        } else if(yesNo.equalsIgnoreCase("no") || yesNo.equalsIgnoreCase("n")) {
                            System.out.println("Alright, no words are deleted." );
                            i = dictSize;
                            // break;
                            // deleteWords = false;
                        } else {
                            System.out.println("Input wrong!");
                        }
                    }
                }
                if((dictSize-1)==i){
                    System.out.println("Word \"" + wordSrc + "\" is not found in current dictionary.");
                }
            }

            System.out.println();
            System.out.println("Delete more words? (y)es/(n)o");
            String yesNo = input.nextLine();
            System.out.println();

            boolean deleteWordsAgain = true;
            while(deleteWordsAgain){
                if(yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")){
                    System.out.println("OK, input words again.");
                    deleteWordsAgain = false;

                } else if(yesNo.equalsIgnoreCase("n") || yesNo.equalsIgnoreCase("no")){
                    System.out.println("OK, return to main menu.");
                    deleteWordsAgain = false;
                    deleteWords = false;

                } else {
                    System.out.println("Input wrong. Please type y/Yes or n/No.");
                    deleteWordsAgain = false;
                }
            }
//            boolean doYesOrNo = redoCheck();
//            How to create doYesOrNo methond with two false values line 69/70 ??? ???
        }
        // System.out.println(dictSrcDes); // Del
        System.out.println();
        return dictSrcDes;
    }

}
