package com.company.dicts;

import java.io.*;
import java.util.HashMap;

public class DictEngPrt {

    public static HashMap<String, String> dictEngPrt() throws IOException {

        HashMap<String, String> dictEngPrt = new HashMap<>();

        FileReader fr = new FileReader("src\\com\\company\\dicts\\dictEngPrt.dat");
        BufferedReader br = new BufferedReader(fr);

        String line = null;
        while ((line = br.readLine()) != null) {

            String str = line;
            String[] arrOfStr = str.split(" - ");
            String wordSrc = arrOfStr[0];
            String wordDes = arrOfStr[1];
            System.out.println(wordSrc);
            System.out.println(wordDes);

            dictEngPrt.put(wordSrc, wordDes);
        }
        br.close();
        return dictEngPrt;
    }

    public static void dictFileWriter_EngDeu() throws IOException {
        FileReader fr = new FileReader("src\\com\\company\\dicts\\dictEngPrt.dat");
        FileWriter fw = new FileWriter("src\\com\\company\\dictFiles\\dictEngPrt.txt");
        char[] chs = new char[1024];
        int len = 0;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
            fw.flush();
        }
        fw.close();
        fr.close();
    }

    public static void dictEngPrtWriteToDatFile(HashMap<String, String> dictSrcDes) throws IOException {

        FileWriter fw = new FileWriter("src\\com\\company\\dicts\\dictEngPrt.dat");
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