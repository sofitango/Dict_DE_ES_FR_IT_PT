package com.company.dicts;

import java.io.*;
import java.util.HashMap;

public class DictEngEsp {

    public static HashMap<String, String> dictEngEsp() throws IOException {

        HashMap<String, String> dictEngEsp = new HashMap<>();

        FileReader fr = new FileReader("src\\com\\company\\dicts\\DictEngEsp.dat");
        BufferedReader br = new BufferedReader(fr);

        String line = null;
        while ((line = br.readLine()) != null) {

            String str = line;
            String[] arrOfStr = str.split(" - ");
            String wordSrc = arrOfStr[0];
            String wordDes = arrOfStr[1];
            System.out.println(wordSrc);
            System.out.println(wordDes);

            dictEngEsp.put(wordSrc, wordDes);
        }
        br.close();
        return dictEngEsp;
    }

    public static void dictFileWriter_EngEsp() throws IOException {
        FileReader fr = new FileReader("src\\com\\company\\dicts\\DictEngEsp.dat");
        FileWriter fw = new FileWriter("src\\com\\company\\dictFiles\\DictEngEsp.txt");
        char[] chs = new char[1024];
        int len = 0;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
            fw.flush();
        }
        fw.close();
        fr.close();
    }

    public static void dictEngEspWriteToDatFile(HashMap<String, String> dictSrcDes) throws IOException {

        FileWriter fw = new FileWriter("src\\com\\company\\dicts\\DictEngEsp.dat");
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