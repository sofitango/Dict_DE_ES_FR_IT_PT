package com.company.main;

import com.company.dicts.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class ListInPairs{

    public static void dictInPairs(HashMap<String, String> dictSrcDes) throws IOException {
        System.out.println();
        System.out.println(" Showing words in pairs");
        System.out.println("- - - - - - - - - - - - -");

// !!!
//        System.out.println(dictSrcDes.keySet().toArray());

        Object[] objectArray = dictSrcDes.entrySet().toArray();
        System.out.println(Arrays.toString(objectArray));

// !!!

        String goLang = ManagerDict.setLanguage(dictSrcDes);
        dictInPairsShowing(goLang, dictSrcDes);
    }

    public static void dictInPairsShowing(String goLang, HashMap<String, String> dictSrcDes){
        System.out.println();

        System.out.println(" English : " + goLang);
        System.out.println("- - - - - - - - - - - ");

        int count = 0;
        for(String key : dictSrcDes.keySet()){
            count++;
            String value = dictSrcDes.get(key);
            System.out.println(count + ". " + key + " : " + value);
        }
        System.out.println("- Total word pairs: " + dictSrcDes.size() + " -");
        System.out.println();
        System.out.println("Hit Return go back to MainMenu");
        Scanner h2r = new Scanner(System.in);
        String hit2Return = h2r.nextLine();
    }

}