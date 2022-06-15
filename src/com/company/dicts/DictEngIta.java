package com.company.dicts;

import java.io.*;
import java.util.HashMap;

public class DictEngIta {

    public static HashMap<String, String> dictEngIta() throws IOException {

        HashMap<String, String> dictEngIta = new HashMap<>();

        FileReader fr = new FileReader("src\\com\\company\\dicts\\dictEngIta.dat");
        BufferedReader br = new BufferedReader(fr);

        String line = null;
        while ((line = br.readLine()) != null) {

            String str = line;
            String[] arrOfStr = str.split(" - ");
            String wordSrc = arrOfStr[0];
            String wordDes = arrOfStr[1];
            System.out.println(wordSrc);
            System.out.println(wordDes);

            dictEngIta.put(wordSrc, wordDes);
        }
        br.close();
        return dictEngIta;
    }

    public static void dictFileWriter_EngDeu() throws IOException {
        FileReader fr = new FileReader("src\\com\\company\\dicts\\dictEngIta.dat");
        FileWriter fw = new FileWriter("src\\com\\company\\dictFiles\\dictEngIta.txt");
        char[] chs = new char[1024];
        int len = 0;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
            fw.flush();
        }
        fw.close();
        fr.close();
    }

    public static void dictEngItaWriteToDatFile(HashMap<String, String> dictSrcDes) throws IOException {

        FileWriter fw = new FileWriter("src\\com\\company\\dicts\\dictEngIta.dat");
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