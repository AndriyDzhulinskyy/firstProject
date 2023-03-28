package com.ua.robot.homework17;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String toTranslate = "людина";
        boolean found = false;

        Map<String, List<String>> vocabulary = new HashMap<>();

        vocabulary.put("небо", List.of("sky", "空", "Himmel"));
        vocabulary.put("гра", List.of("game", "ゲーム", "Spiel"));
        vocabulary.put("двері", List.of("door", "ドア", "Tür"));
        vocabulary.put("око", List.of("eye", "目", "Auge"));
        vocabulary.put("людина", List.of("man", "男", "Mann"));
        vocabulary.put("велосипед", List.of("bicycle", "自転車", "Fahrrad"));
        vocabulary.put("трава", List.of("grass", "草", "Gras"));
        vocabulary.put("папір", List.of("paper", "紙", "Papier"));
        vocabulary.put("пластик", List.of("plastic", "プラスチック", "Plastik"));
        vocabulary.put("залізниця", List.of("railway", "鉄道", "Eisenbahn"));

        for (Map.Entry<String, List<String>> keys : vocabulary.entrySet()) {
            if (toTranslate == keys.getKey()) {
                System.out.println(toTranslate + " = " + keys.getValue());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No word found.");
        }
    }
}

