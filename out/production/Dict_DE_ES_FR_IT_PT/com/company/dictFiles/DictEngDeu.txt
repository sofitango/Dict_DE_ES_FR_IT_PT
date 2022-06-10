package com.company.dicts;
import java.util.HashMap;

public class DictEngDeu {

    public static HashMap<String, String> dictEngDeu(){

//[bus=Bus, chicken=Kueken, woman=Frau, young=jung, fruit=Obst, vegetable=Gemuese, boy=Junge, bike=Fahrrad, hen=Henne, noon=Mittag, car=Auto, duck=Ente, cat=Katze, man=Mann, rain=Regen, old=alt, night=Nacht, girl=Maedchen, morning=Morgen, fish=Fisch, meat=Fleisch, cock=Hahn, evening=Abend, dog=Hund, wind=Wind]

        HashMap<String, String> dictEngDeu = new HashMap<>();

        dictEngDeu.put("cat", "Katze");
        dictEngDeu.put("dog", "Hund");
        dictEngDeu.put("cock", "Hahn");
        dictEngDeu.put("hen", "Henne");
        dictEngDeu.put("chicken", "Kueken");
        dictEngDeu.put("duck", "Ente");
        dictEngDeu.put("fish", "Fisch");
        dictEngDeu.put("meat", "Fleisch");
        dictEngDeu.put("vegetable", "Gemuese");
        dictEngDeu.put("fruit", "Obst");
        dictEngDeu.put("man", "Mann");
        dictEngDeu.put("woman", "Frau");
        dictEngDeu.put("boy", "Junge");
        dictEngDeu.put("girl", "Maedchen");
        dictEngDeu.put("young", "jung");
        dictEngDeu.put("old", "alt");
        dictEngDeu.put("bike", "Fahrrad");
        dictEngDeu.put("bus", "Bus");
        dictEngDeu.put("car", "Auto");
        dictEngDeu.put("morning", "Morgen");
        dictEngDeu.put("noon", "Mittag");
        dictEngDeu.put("evening", "Abend");
        dictEngDeu.put("night", "Nacht");
        dictEngDeu.put("wind", "Wind");
        dictEngDeu.put("rain", "Regen");

        return dictEngDeu;
    }

}
