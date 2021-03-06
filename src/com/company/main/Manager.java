package com.company.main;

import com.company.dicts.*;

import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;

import static com.company.dicts.ManagerFile.dictFileWriter_EngPrt;

/**
 * Main class of the Java program.
 */

public class Manager {

    int lanChosen = 0;

    public void start() throws IOException {

        bannerShow();
        HashMap<String, String> dictSrcDes = chooseLan();
        mainMenu(dictSrcDes);
    }

    private void bannerShow(){
        System.out.println("===========================================================================");
        System.out.println("= Mini-Multi Languages Dictionary Eng-Deu/Eng-Esp/Eng-Fra/Eng-Ita/Eng-Prt =");
        System.out.println("===========================================================================");
        System.out.println("======== disclaimer: no garantee for TOEFL, IELTS or the like :-( =========");
        System.out.println();
    }

    private HashMap<String, String> chooseLan() throws IOException {

        HashMap<String, String> dictSrcDes = new HashMap<>();

        System.out.println("             1. English-German / englisch-deutsch");
        System.out.println("             2. English-Spanish / ingles-espanol");
        System.out.println("             3. English-French / anglais-francais");
        System.out.println("             4. English-Italian / inglese-italiano");
        System.out.println("             5. English-Portugese / ingles-portugues");
        System.out.println();
        System.out.println("             6. Terminate the program");
        System.out.println();

        System.out.print("Please select a language pair or press 6 to quit: ");

        try {
            ManagerFile.dictFileCreator();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
//        int lanChosen = sc.nextInt();
        lanChosen = sc.nextInt();
        System.out.println();

        if(lanChosen==1){
            System.out.println(" Choice made: English-German / englisch-deutsch");
            ManagerFile.dictFileReader_EngDeu();
            dictSrcDes = DictEngDeu.dictEngDeu();
        } else if(lanChosen==2){
            System.out.println(" Choice made: English-Spanish / ingles-espanol");
            ManagerFile.dictFileReader_EngEsp();
            dictSrcDes = DictEngEsp.dictEngEsp();
        } else if(lanChosen==3){
            System.out.println(" Choice made: English-French / anglais-francais");
            ManagerFile.dictFileReader_EngFra();
            dictSrcDes = DictEngFra.dictEngFra();
        } else if(lanChosen==4){
            System.out.println(" Choice made: English-Italian / inglese-italiano");
            ManagerFile.dictFileReader_EngIta();
            dictSrcDes = DictEngIta.dictEngIta();
        } else if(lanChosen==5){
            System.out.println(" Choice made: English-Portugese / ingles-portugues");
            ManagerFile.dictFileReader_EngPrt();
            dictSrcDes = DictEngPrt.dictEngPrt();
        } else if(lanChosen==6){
            System.out.println("- Program Terminated as wished -");
            System.out.println("Good-bye!");
            System.exit(0);
            System.out.println();
        } else {
            System.out.println("Input wrong! Program ends.");
            System.exit(0);
        }
        return dictSrcDes;
    }

/*
    private HashMap<String, String> setLan(int lanSet) throws IOException {

        HashMap<String, String> dictSrcDes = new HashMap<>();

        if(lanSet==1){
            dictSrcDes = DictEngDeu.dictEngDeu();
        } else if(lanSet==2){
            dictSrcDes = DictEngEsp.dictEngEsp();
        } else if(lanSet==3){
            dictSrcDes = DictEngFra.dictEngFra();
        } else if(lanSet==4){
            dictSrcDes = DictEngIta.dictEngIta();
        } else if(lanSet==5){
            dictSrcDes = DictEngPrt.dictEngPrt();
        } else{
            System.out.println("Input wrong. Program ends");
            System.exit(0);
        }
        return dictSrcDes;
    }
 */

    private void mainMenu(HashMap<String, String> dictSrcDes) throws IOException {
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = =");
        System.out.println();
        boolean mainView = true;
        while(mainView){
            System.out.println("       M A I N   M E N U");
            System.out.println("       -----------------");
            System.out.println("1. (A)dding flash cards (A)");
            System.out.println("2. (C)hanging flash cards (C)");
            System.out.println("3. (D)eleting flash cards (D)");
            System.out.println("4. (G)uessing flash cards (G)");
            System.out.println("5. (R)andom flash card test (R)");
            System.out.println("6. (L)isting all flash cards (L)");
            System.out.println("7. (S)howing all cards in pairs (S)");
            System.out.println("8. (V)erify word in flash cards (V)");
            System.out.println("9. (Q)uitting program (Q)");
            System.out.println();

            Scanner input = new Scanner(System.in);
            String choiceMade = input.nextLine();

            if(choiceMade.equals("1") || choiceMade.equalsIgnoreCase("A")){
                dictSrcDes = AddCards.addCards(dictSrcDes);
                System.out.println(dictSrcDes);
                System.out.println();
            } else if(choiceMade.equals("2") || choiceMade.equalsIgnoreCase("C")){
                dictSrcDes = ChangeCards.changeCards(dictSrcDes);
                System.out.println(dictSrcDes);
                System.out.println();
            } else if(choiceMade.equals("3") || choiceMade.equalsIgnoreCase("D")){
                System.out.println("3. (D)eleting words (D)");
                DeleteCards.deleteCards(dictSrcDes);
                System.out.println();
            } else if(choiceMade.equals("4") || choiceMade.equalsIgnoreCase("G")){
                GuessCards.guessingCard(dictSrcDes);
                System.out.println();
            } else if(choiceMade.equals("5") || choiceMade.equalsIgnoreCase("R")){
                System.out.println();
                System.out.println("5. (R)andom test (R)");
                InRandoms rndmTest = new InRandoms();
                rndmTest.randomTest(dictSrcDes);
                System.out.println();
            } else if(choiceMade.equals("6") || choiceMade.equalsIgnoreCase("L")){
                System.out.println("6. (L)isting all cards (L)");
                // System.out.println("Total words in the dictionary: " + DictSrcDes.dictSrcDes().size() *2);
                System.out.println("The current dictionary contains:");
                System.out.println(dictSrcDes);
                System.out.println("Hit Return go back to MainMenu");
                Scanner h2r = new Scanner(System.in);
                String hit2Return = h2r.nextLine();
                System.out.println();
            } else if(choiceMade.equals("7") || choiceMade.equalsIgnoreCase("S")){
                System.out.println("7. (S)howing words in pairs (S)");
                ListInPairs.dictInPairs(dictSrcDes);
                System.out.println();
            } else if(choiceMade.equals("8") || choiceMade.equalsIgnoreCase("V")){
                System.out.println("8. (V)erify word in flash cards (V)");
                VerifyAWord.verifyAWord(dictSrcDes);
                System.out.println();
            } else if(choiceMade.equals("9") || choiceMade.equalsIgnoreCase("Q")){
                System.out.println("9. (Q)uitting program (Q)");

                if(lanChosen == 1){
                    System.out.println("Thanks for using mini-dictionary English - German");
                    DictEngDeu.dictEngDeuWriteToDatFile(dictSrcDes);
                    ManagerFile.dictFileWriter_EngDeu();
                } else if(lanChosen == 2){
                    System.out.println("Thanks for using mini-dictionary English - Spanish");
                    DictEngEsp.dictEngEspWriteToDatFile(dictSrcDes);
                    ManagerFile.dictFileWriter_EngEsp();
                } else if(lanChosen == 3){
                    System.out.println("Thanks for using mini-dictionary English - French");
                    DictEngFra.dictEngFraWriteToDatFile(dictSrcDes);
                    ManagerFile.dictFileWriter_EngFra();
                } else if(lanChosen == 4){
                    System.out.println("Thanks for using mini-dictionary English - Italian");
                    DictEngIta.dictEngItaWriteToDatFile(dictSrcDes);
                    ManagerFile.dictFileWriter_EngIta();
                } else if(lanChosen == 5) {
                    System.out.println("Thanks for using mini-dictionary English - Portugese");
                    DictEngPrt.dictEngPrtWriteToDatFile(dictSrcDes);
                    ManagerFile.dictFileWriter_EngPrt();
                } else {
                    System.out.println("Something went wrong.");
                }

                System.out.println("Updated data are written to file and saved.");
                System.out.println("Good-bye!");
                mainView = false;
                System.out.println();
            } else {
                System.out.println("Something went wrong. Program is terminated");
                System.exit(0);
            }
        }
    }

}
