package com.company.dicts;

import java.io.*;
import java.util.HashMap;

public class DictEngDeu {

    public static HashMap<String, String> dictEngDeu() throws IOException {

        HashMap<String, String> dictEngDeu = new HashMap<>();

        FileReader fr = new FileReader("src\\com\\company\\dicts\\DictEngDeu.dat");
        BufferedReader br = new BufferedReader(fr);

        String line = null;
        while ((line = br.readLine()) != null) {

            String str = line;
            String[] arrOfStr = str.split(" - ");
            String wordSrc = arrOfStr[0];
            String wordDes = arrOfStr[1];
            System.out.println(wordSrc);
            System.out.println(wordDes);

            dictEngDeu.put(wordSrc, wordDes);
        }
        br.close();
        return dictEngDeu;
    }

    public static void dictFileWriter_EngDeu() throws IOException {
        FileReader fr = new FileReader("src\\com\\company\\dicts\\DictEngDeu.dat");
        FileWriter fw = new FileWriter("src\\com\\company\\dictFiles\\DictEngDeu.txt");
        char[] chs = new char[1024];
        int len = 0;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
            fw.flush();
        }
        fw.close();
        fr.close();
    }

    public static void dictEngDeuWriteToDatFile(HashMap<String, String> dictSrcDes) throws IOException {

        FileWriter fw = new FileWriter("src\\com\\company\\dicts\\DictEngDeu.dat");
        BufferedWriter bw = new BufferedWriter(fw);

        int dictSize = dictSrcDes.size();
        int counter = 0;

        for(String key : dictSrcDes.keySet()){
            String value = dictSrcDes.get(key);
//            System.out.println(key + " - " + value);
            bw.write(key + " - " + value);
            if(counter < dictSize-1){
                bw.newLine();
            }
            bw.flush();
            counter++;
        }
        bw.close();
    }

}