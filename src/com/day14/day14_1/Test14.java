package com.day14.day14_1;

import java.util.*;

public class Test14 {
    public static void main(String[] args) {
        HashMap<Integer, String> cardList = new HashMap<>();

        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("♠");
        colorList.add("♥");
        colorList.add("♣");
        colorList.add("♦");

        ArrayList<String> numberList = new ArrayList<>();
        numberList.add("2");
        numberList.add("A");
        numberList.add("K");
        numberList.add("Q");
        numberList.add("J");
        for (int i = 10; i >= 3; i--) {
            numberList.add(i + "");
        }

        int count = 1;
        cardList.put(count, "大🃏");
        cardList.put(++count, "🃏");
        for (int i = 0; i < numberList.size(); i++) {
            for (int j = 0; j < colorList.size(); j++) {
                String str = colorList.get(j) + numberList.get(i);
                cardList.put(++count, str);
            }
        }
        Set<Integer> key = cardList.keySet();
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(key);
        Collections.shuffle(list);

        HashMap<Integer, String> play1 = new HashMap<>();
        HashMap<Integer, String> play2 = new HashMap<>();
        HashMap<Integer, String> play3 = new HashMap<>();
        HashMap<Integer, String> Cards = new HashMap<>();
        //Set<Map.Entry<Integer,String>>entry=cardList.entrySet();
        Iterator<Integer> iterator = list.iterator();
        int i = 1;
        while (iterator.hasNext()) {
            if (i <= 17) {
                Integer p1 = iterator.next();
                play1.put(p1, cardList.get(p1));
                Integer p2 = iterator.next();
                play2.put(p2, cardList.get(p2));
                Integer p3 = iterator.next();
                play3.put(p3, cardList.get(p3));
            } else {
                Integer p4 = iterator.next();
                Cards.put(p4, cardList.get(p4));
            }
            i++;
        }
        Set<Integer> set = play1.keySet();
        Set<Integer> set1 = play2.keySet();
        Set<Integer> set2 = play3.keySet();
        Set<Integer> set3 = Cards.keySet();

        ArrayList<Integer> link = new ArrayList<>();
        link.addAll(set);
        Collections.sort(link);
        ArrayList<Integer> link1 = new ArrayList<>();
        link1.addAll(set1);
        Collections.sort(link1);
        ArrayList<Integer> link2 = new ArrayList<>();
        link2.addAll(set2);
        Collections.sort(link2);


        System.out.print("刘德华：");
        for (Integer integer : link) {
            System.out.print(" " + play1.get(integer));
        }
        System.out.println();
        System.out.print("陈奕迅：");
        for (Integer integer : link1) {
            System.out.print(" " + play2.get(integer));
        }
        System.out.println();
        System.out.print("周杰伦：");
        for (Integer integer : link2) {
            System.out.print(" " + play3.get(integer));
        }
        System.out.println();
        System.out.print("底牌：");
        for (Integer integer : set3) {
            System.out.print(" " + Cards.get(integer));
        }

    }
}
