package com.company.dicts;

import java.io.*;

public class ManagerFile {

    public static void dictFileCreator() throws IOException {

        File file0 = new File("src\\com\\company\\dictFiles");
//        System.out.println("Make Dir/Package" + file0.mkdir());
        file0.mkdir();

        File file1 = new File("src\\com\\company\\dictFiles\\DictEngDeu.txt");
//        System.out.println("Create New File: " + file1.createNewFile());
        file1.createNewFile();

        File file2 = new File("src\\com\\company\\dictFiles\\DictEngEsp.txt");
//        System.out.println("Create New File: " + file2.createNewFile());
        file2.createNewFile();

        File file3 = new File("src\\com\\company\\dictFiles\\DictEngFra.txt");
//        System.out.println("Create New File: " + file3.createNewFile());
        file3.createNewFile();

        File file4 = new File("src\\com\\company\\dictFiles\\DictEngIta.txt");
//        System.out.println("Create New File: " + file4.createNewFile());
        file4.createNewFile();

        File file5 = new File("src\\com\\company\\dictFiles\\DictEngPrt.txt");
//        System.out.println("Create New File: " + file5.createNewFile());
        file5.createNewFile();
    }

    public static void dictFileReader_EngDeu() throws IOException {
        FileReader fr = new FileReader("src\\com\\company\\dictFiles\\DictEngDeu.txt");
        FileWriter fw = new FileWriter("src\\com\\company\\dicts\\DictEngDeu.java");
        char[] chs = new char[1024];
        int len = 0;
        while ((len= fr.read(chs)) !=-1){
            fw.write(chs, 0, len);
            fw.flush();
        }
        fw.close();
        fr.close();
    }

    public static void dictFileReader_EngEsp() throws IOException {
        FileReader fr = new FileReader("src\\com\\company\\dictFiles\\DictEngEsp.txt");
        FileWriter fw = new FileWriter("src\\com\\company\\dicts\\DictEngEsp.java");
        char[] chs = new char[1024];
        int len = 0;
        while ((len= fr.read(chs)) !=-1){
            fw.write(chs, 0, len);
            fw.flush();
        }
        fw.close();
        fr.close();
    }
    public static void dictFileReader_EngFra() throws IOException {
        FileReader fr = new FileReader("src\\com\\company\\dictFiles\\DictEngFra.txt");
        FileWriter fw = new FileWriter("src\\com\\company\\dicts\\DictEngFra.java");
        char[] chs = new char[1024];
        int len = 0;
        while ((len= fr.read(chs)) !=-1){
            fw.write(chs, 0, len);
            fw.flush();
        }
        fw.close();
        fr.close();
    }
    public static void dictFileReader_EngIta() throws IOException {
        FileReader fr = new FileReader("src\\com\\company\\dictFiles\\DictEngIta.txt");
        FileWriter fw = new FileWriter("src\\com\\company\\dicts\\DictEngIta.java");
        char[] chs = new char[1024];
        int len = 0;
        while ((len= fr.read(chs)) !=-1){
            fw.write(chs, 0, len);
            fw.flush();
        }
        fw.close();
        fr.close();
    }
    public static void dictFileReader_EngPrt() throws IOException {
        FileReader fr = new FileReader("src\\com\\company\\dictFiles\\DictEngPrt.txt");
        FileWriter fw = new FileWriter("src\\com\\company\\dicts\\DictEngPrt.java");
        char[] chs = new char[1024];
        int len = 0;
        while ((len= fr.read(chs)) !=-1){
            fw.write(chs, 0, len);
            fw.flush();
        }
        fw.close();
        fr.close();
    }

    public static void dictFileWriter_EngDeu() throws IOException {
        FileReader fr = new FileReader("src\\com\\company\\dicts\\DictEngDeu");
        FileWriter fw = new FileWriter("src\\com\\company\\dictFiles\\DictEngDeu.txt");
        char[] chs = new char[1024];
        int len = 0;
        while ((len= fr.read(chs)) !=-1){
            fw.write(chs, 0, len);
            fw.flush();
        }
        fw.close();
        fr.close();
    }

    public static void dictFileWriter_EngEsp() throws IOException {
        FileReader fr = new FileReader("src\\com\\company\\dicts\\DictEngEsp.java");
        FileWriter fw = new FileWriter("src\\com\\company\\dictFiles\\DictEngEsp.txt");
        char[] chs = new char[1024];
        int len = 0;
        while ((len= fr.read(chs)) !=-1){
            fw.write(chs, 0, len);
            fw.flush();
        }
        fw.close();
        fr.close();
    }
    public static void dictFileWriter_EngFra() throws IOException {
        FileReader fr = new FileReader("src\\com\\company\\dicts\\DictEngFra.java");
        FileWriter fw = new FileWriter("src\\com\\company\\dictFiles\\DictEngFra.txt");
        char[] chs = new char[1024];
        int len = 0;
        while ((len= fr.read(chs)) !=-1){
            fw.write(chs, 0, len);
            fw.flush();
        }
        fw.close();
        fr.close();
    }
    public static void dictFileWriter_EngIta() throws IOException {
        FileReader fr = new FileReader("src\\com\\company\\dicts\\DictEngIta.java");
        FileWriter fw = new FileWriter("src\\com\\company\\dictFiles\\DictEngIta.txt");
        char[] chs = new char[1024];
        int len = 0;
        while ((len= fr.read(chs)) !=-1){
            fw.write(chs, 0, len);
            fw.flush();
        }
        fw.close();
        fr.close();
    }
    public static void dictFileWriter_EngPrt() throws IOException {
        FileReader fr = new FileReader("src\\com\\company\\dicts\\DictEngPrt.java");
        FileWriter fw = new FileWriter("src\\com\\company\\dictFiles\\DictEngPrt.txt");
        char[] chs = new char[1024];
        int len = 0;
        while ((len= fr.read(chs)) !=-1){
            fw.write(chs, 0, len);
            fw.flush();
        }
        fw.close();
        fr.close();
    }

/*
    public static void dictFileReader1() throws IOException {
            FileInputStream fis = new FileInputStream("src\\com\\company\\dictFiles\\tester11.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            FileOutputStream fos = new FileOutputStream("src\\com\\company\\dictFiles\\tester12.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            char[] chs = new char[1024];
            int len = 0;
            while ((len= isr.read(chs)) !=-1){
                osw.write(chs, 0, len);
                osw.flush();
            }
            osw.close();
            isr.close();
        }

    public static void dictFileReader2() throws IOException {
        FileReader fr = new FileReader("src\\com\\company\\dictFiles\\tester21.txt");
        FileWriter fw = new FileWriter("src\\com\\company\\dictFiles\\tester22.txt");

        char[] chs = new char[1024];
        int len = 0;
        while ((len= fr.read(chs)) !=-1){
            fw.write(chs, 0, len);
            fw.flush();
        }
            fw.close();
            fr.close();
    }

    public static void dictFileReader3() throws IOException {
        FileReader fr = new FileReader("src\\com\\company\\dictFiles\\tester31.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("src\\com\\company\\dictFiles\\tester32.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        String line = null;
        while ((line= br.readLine()) !=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
*/

    public static void dictFileWriter()  {

        }






    }



