package com.firstspring;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BabaRoba {
    private HashMap<String, Object> hashMap = new HashMap<>();
    public HashMap<String, Object> initer() {
        hashMap.put("one", "1");
        hashMap.put("two", "2");
        hashMap.put("three", "3");
        hashMap.put("four", "4");
        hashMap.put("five", "5");
        hashMap.put("six", "6");
        return hashMap;
    }
    public static void main(String[] args) {
        BabaRoba babaRoba = new BabaRoba();
        HashMap<String, Object> hMap = babaRoba.initer();
        HashMap<String, String> hmap2 = new HashMap<>();


        hmap2.put("one", "11");
        hmap2.put("two", "22");
        hmap2.put("three", "33");

        System.out.println(hMap.get("343"));


        for (String s : hMap.keySet()) {
            System.out.println(s);
        }
        hMap.keySet().forEach(System.out::print);
        System.out.println();


        int i = 0;
        for (Map.Entry<String, String> entry : hmap2.entrySet()) {
            entry.setValue(i + "" + i);
            System.out.println(i + " " + entry.getKey() + " " + entry.getValue());
            ++i; //iterate
        }

        Iterator<Map.Entry<String, String>> iterator = hmap2.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("with iterator" + " " + entry.getKey() + " " + entry.getValue());
        }


    }
}
