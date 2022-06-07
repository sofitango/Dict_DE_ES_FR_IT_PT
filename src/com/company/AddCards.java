import com.company.dicts.*;
import java.util.Scanner;
import java.util.HashMap;

public class AddCards{

    public static HashMap<String, String> addCards(HashMap<String, String> dictSrcDes){
        System.out.println();
        System.out.println("Method 1. (A)dding cards (A)");

        String goLang = ManagerDict.setLanuage(dictSrcDes);
        dictSrcDes = addingCards(goLang, dictSrcDes);

        System.out.println();
        System.out.println("Hit Return to return to MainMenu");
        Scanner h2r = new Scanner(System.in);
        String hit2Return = h2r.nextLine();
        System.out.println();
        return dictSrcDes;
    }

    public static HashMap<String, String> addingCards(String goLang, HashMap<String, String> dictSrcDes){

        Scanner input = new Scanner(System.in);
        boolean addWords = true;
        while(addWords){
            System.out.println("Please enter an English word:");
            String keyEng = input.nextLine();
            System.out.println("Please enter the " + goLang + " word:");
            String valueSpa = input.nextLine();

            dictSrcDes.put(keyEng, valueSpa);
            for(String x : dictSrcDes.keySet()){
                String y = dictSrcDes.get(x);
                // System.out.println(x + " -- " + y);
            }

            int wordsAddedLast = dictSrcDes.size();
            // System.out.println(wordsAddedLast);
            // System.out.println("Added words to ingle=espanol: " + (dictSrcDes.get(wordsAddedLast)));
            // Frage 2a. How to show the last added word-pair?
            // Frage 2b. No certain and only with LinkedHashMap?

            System.out.println("Words added: " + keyEng + "=" + valueSpa + "");
            // System.out.println("Words added to ingle=espanol dictionary: \{" + keyEng + "=" + valueSpa + "\}");
            // Frage 3. How to make it work with \{ and \} or \" and \" etc.?

            System.out.println();
            System.out.println("Add more words? (y)es/(n)o");
            String yesNo = input.nextLine();
            System.out.println();

            boolean addWordsAgain = true;
            while(addWordsAgain){
                if(yesNo.equalsIgnoreCase("y") || yesNo.equalsIgnoreCase("yes")){
                    System.out.println("OK, input words again.");
                    addWordsAgain = false;

                } else if(yesNo.equalsIgnoreCase("n") || yesNo.equalsIgnoreCase("no")){
                    System.out.println("OK, return to main menu.");
                    addWordsAgain = false;
                    addWords = false;
                    // Frage 4. Why not possible with false, break, continue?
                    // return dictSrcDes;
                    // Frage 5. How to merge this return with that in line 111?

                } else {
                    System.out.println("Input wrong. Please type y/Yes or n/No.");
                    addWordsAgain = false;
                }
            }
        }
        // System.out.println(dictSrcDes); // Del
        System.out.println();
        return dictSrcDes;
    }

}

