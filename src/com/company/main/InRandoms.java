package com.company.main;

import com.company.dicts.*;

import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collection;

public class InRandoms{

    public void randomTest(HashMap<String, String> dictSrcDes) throws IOException {
        String goLang = ManagerDict.setLanguage(dictSrcDes);
        randomTesting(goLang, dictSrcDes);
        System.out.println("The module Random Training ends.");
        System.out.println();
        System.out.println("Hit Return go back to MainMenu");
        Scanner h2r = new Scanner(System.in);
        String hit2Return = h2r.nextLine();
        System.out.println();
    }

    public void randomTesting(String goLang, HashMap<String, String> dictSrcDes) throws IOException {

        System.out.println("1. Train English (press 1)");
        System.out.println("2. Train " + goLang + " (press 2)");
        System.out.println("- - - - - - - - - - - -");
        System.out.println();

        Scanner train = new Scanner(System.in);
        char pressKey = train.next().charAt(0);

        if(pressKey == '1'){
            System.out.println("Great! Let\'s train English.");
            System.out.println("How many word-pairs do you want to test? (Maximum: " + dictSrcDes.size() + ")");
            System.out.println("Press \"N\" or \"n\" without concrete words and times.");
            Scanner scanner = new Scanner(System.in);
            String getInput = scanner.nextLine();

            if(getInput.matches("[+-]?\\d*(\\.\\d+)?")){
                int counter = Integer.parseInt(getInput);

                if(counter>dictSrcDes.size()){
                    System.out.println("Wow, that\'s a lot, but the mini dictionary has only " + dictSrcDes.size() + " word pairs.");
                    System.out.println("Try less or try to add more words in the dictionary.");

                } else randomTestLoopEng(dictSrcDes, counter);

            } else {
                randomTestNormalEng(dictSrcDes);
            }
        } else if(pressKey == '2'){
            System.out.println("Great! Let's now do test in " + goLang);
            System.out.println("How many word-pairs do you want to test? (Maximum: " + dictSrcDes.size() + ")");
            System.out.println("Press \"N\" or \"n\" with no concrete words and times.");
            Scanner scanner = new Scanner(System.in);
            String getInput = scanner.nextLine();

            if(getInput.matches("[+-]?\\d*(\\.\\d+)?")){
                int counter = Integer.parseInt(getInput);

                if(counter>dictSrcDes.size()){
                    System.out.println("Wow, that\'s huge. The mini dictionary contains only " + dictSrcDes.size() + " word pairs now.");
                    System.out.println("Try less or try to add more words in the dictionary.");

                } else randomTestLoopOth(dictSrcDes, counter);

            } else {
                randomTestNormalOth(dictSrcDes);
            }
        }
    }

    private void randomTestLoopEng(HashMap<String, String> dictSrcDes, int counter) throws IOException {

        String goLang = ManagerDict.setLanguage(dictSrcDes);
        int totalDictNo = dictSrcDes.size();
        ArrayList<Integer> arrNumber = new ArrayList<Integer>();
        ArrayList<String> arrKeyWord = new ArrayList<String>();
        int correctWord = 0;

        for(String x: dictSrcDes.keySet()){
            arrKeyWord.add(x);
        }
        // get arraylist keyWords

        for(int i=0; i<counter; i++){
            Random rd = new Random();
            int wordNo = rd.nextInt(totalDictNo);

            if(!arrNumber.contains(wordNo)){
                // get rid of random number doubled
                arrNumber.add(wordNo);
                String keyWord = arrKeyWord.get(wordNo);
                String valWord = dictSrcDes.get(keyWord);

                System.out.println(("Please type the word \"") + valWord + ("\" in English"));
                Scanner sc = new Scanner(System.in);
                String inpWord = sc.nextLine();

                if(inpWord.equalsIgnoreCase(keyWord)){
                    System.out.println("Excellent! That\'s correct!");

                    correctWord++;
                } else if(!inpWord.equalsIgnoreCase(keyWord)){
                    System.out.println("What a pity! But you are wrong!");
                    System.out.println("The correct English word for \"" + valWord + "\" is: " + keyWord);

                } else {
                    System.out.println("What happends?");
                }
            } else {
                i--;
            }
        }
        double rateTest = ((double)correctWord/(double)counter)*100f;
        double rateDict = (double)((double)counter/(double)dictSrcDes.size())*100f;
        ManagerDict.setRatingReview(dictSrcDes, correctWord, counter, rateTest, rateDict);
    }

    private void randomTestNormalEng(HashMap<String, String> dictSrcDes) throws IOException {

        String goLang = ManagerDict.setLanguage(dictSrcDes);

        boolean randTest = true;
        while(randTest){
            int totalWords = dictSrcDes.size();
            Random rand = new Random();
            int randWord = rand.nextInt(totalWords);
            System.out.println(randWord);

            Set<String> keySet = dictSrcDes.keySet();
            ArrayList<String> listOfKeys = new ArrayList<String>(keySet);
            Collection<String> values = dictSrcDes.values();
            ArrayList<String> listOfValues = new ArrayList<>(values);

            String wordEng = listOfKeys.get(randWord);
            String wordOth = listOfValues.get(randWord);

            System.out.println("Write the " + wordOth + " in English please!");
            Scanner input = new Scanner(System.in);
            String wordTyped = input.nextLine();

            if(wordTyped.equalsIgnoreCase(wordEng)){
                System.out.println("Excelent! You are correct!");

            } else if(!wordTyped.equalsIgnoreCase(wordEng)){
                System.out.println("What a pity! But it\'s wrong!");
                System.out.println("The correct word for \"" + wordOth + "\" is: " + wordEng);

            } else {
                System.out.println("ARE YOU MAD?");
            }
            System.out.println();

//            boolean randTestYN = yesOrNoRandom();

            System.out.println("Go on with random test?(Y)es/(N)o");
            String yesNo = input.nextLine();

            if((yesNo.equalsIgnoreCase("no")) || (yesNo.equalsIgnoreCase("n"))){
                randTest = false;
            }
            System.out.println();
        }
    }

    private void randomTestLoopOth(HashMap<String, String> dictSrcDes, int counter) throws IOException {

        String goLang = ManagerDict.setLanguage(dictSrcDes);
        int totalDictNo = dictSrcDes.size();
        ArrayList<Integer> arrNumber = new ArrayList<Integer>();
        ArrayList<String> arrKeyWord = new ArrayList<String>();
        int correctWord = 0;

        for(String x: dictSrcDes.keySet()){
            arrKeyWord.add(x);
        }
        // get arraylist keyWord

        for(int i=0; i<counter; i++){
            Random rd = new Random();
            int wordNo = rd.nextInt(totalDictNo);

            if(!arrNumber.contains(wordNo)){
                // get rid of random number doubled
                arrNumber.add(wordNo);
                String keyWord = arrKeyWord.get(wordNo);
                String valWord = dictSrcDes.get(keyWord);

                System.out.println(("Please type the word \"") + keyWord + ("\" in " + goLang));
                Scanner sc = new Scanner(System.in);
                String inpWord = sc.nextLine();

                if(inpWord.equalsIgnoreCase(valWord)){
                    System.out.println("Excellent! That\'s correct!");
                    correctWord++;

                } else if(!inpWord.equalsIgnoreCase(valWord)){
                    System.out.println("What a pity! But you are wrong!");
                    System.out.println(("The correct ") + goLang +(" word for \"") + keyWord + ("\" is: ") + valWord);

                } else {
                    System.out.println("What happends?");
                }

            } else {
                i--;
            }
        }

        double rateTest = ((double)correctWord/(double)counter)*100d;
        double rateDict = (double)((double)counter/(double)dictSrcDes.size())*100d;
        ManagerDict.setRatingReview(dictSrcDes, correctWord, counter, rateTest, rateDict);
    }

    private void randomTestNormalOth(HashMap<String, String> dictSrcDes) throws IOException {

        String goLang = ManagerDict.setLanguage(dictSrcDes);

        boolean randTest = true;
        while(randTest){

            int totalWords = dictSrcDes.size();
            Random rand = new Random();
            int randWord = rand.nextInt(totalWords);
            // System.out.println(randWord);

            Set<String> keySet = dictSrcDes.keySet();
            ArrayList<String> listOfKeys = new ArrayList<String>(keySet);
            Collection<String> values = dictSrcDes.values();
            ArrayList<String> listOfValues = new ArrayList<>(values);

            String wordEng = listOfKeys.get(randWord);
            String wordOth = listOfValues.get(randWord);

            System.out.println("Write the word \"" + wordEng + "\" in " + goLang + " please!");
            Scanner input = new Scanner(System.in);
            String wordTyped = input.nextLine();

            if(wordTyped.equalsIgnoreCase(wordOth)){
                System.out.println("Excellent! You are absolutely right!");
            } else if(!wordTyped.equalsIgnoreCase(wordOth)){
                System.out.println("It\'s a pity! But that\'s not correct!");
                System.out.println("The correct word for " + wordEng + " is: " + wordOth);
            } else {
                System.out.println("mad or MAD?");
            }
            System.out.println();
//            boolean randTestYN = yesOrNoRandom();

            System.out.println("Go on with random test? (Y)es/(N)o");
            String yesNo = input.nextLine();
            if((yesNo.equalsIgnoreCase("no")) || (yesNo.equalsIgnoreCase("n"))){
                randTest = false;
            }
            System.out.println();
        }
    }

}
