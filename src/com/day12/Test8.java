package com.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<String> cardList = new ArrayList<>();

        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("♠");
        colorList.add("♥");
        colorList.add("♣");
        colorList.add("♦");

        ArrayList<String> numberList = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            numberList.add(i + "");
        }
        numberList.add("A");
        numberList.add("J");
        numberList.add("Q");
        numberList.add("K");

        for (int i = 0; i < colorList.size(); i++) {
            for (int j = 0; j < numberList.size(); j++) {
                String str = numberList.get(j) + colorList.get(i);
                cardList.add(str);
            }
        }

        cardList.add("🃏");
        cardList.add("大🃏");

        while (true) {
            Collections.shuffle(cardList);

            if (cardList.get(51) == "大🃏" || cardList.get(52) == "大🃏" || cardList.get(53) == "大🃏") {
                continue;
            } else {
                break;
            }

        }

        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();

        ArrayList<String> Cards = new ArrayList<>();

        for (int i = 0; i < cardList.size(); i++) {
            if (i < cardList.size() - 3) {
                if (i % 3 == 0) {
                    play1.add(cardList.get(i));
                } else if (i % 3 == 1) {
                    play2.add(cardList.get(i));
                } else if (i % 3 == 2) {
                    play3.add(cardList.get(i));
                }
            } else {
                Cards.add(cardList.get(i));
            }
        }




        if (play1.contains("大🃏")) {
            play1.addAll(Cards);
        }
        if (play2.contains("大🃏")) {
            play2.addAll(Cards);
        }
        if (play3.contains("大🃏")) {
            play3.addAll(Cards);
        }


        System.out.println("令狐冲：" + play1);
        System.out.println("张无忌：" + play2);
        System.out.println("小龙女：" + play3);
        System.out.println("底牌：" + Cards);
    }
}
