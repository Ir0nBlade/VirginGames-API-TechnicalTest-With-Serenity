package com.virgingames.utils;

import java.util.Random;

/**
 * @author Vimal Vithalpura
 * @project VirginGames-API-TechnicalTest-With-Serenity
 * @created 16/01/2022
 */
public class TestUtils {

    public static String getRandomValue(){
        Random random = new Random();
        int randomInt = random.nextInt(100000);
        return Integer.toString(randomInt);
    }

    public static String getRandomName(){
        String saltChars = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder name = new StringBuilder();
        Random random = new Random();
        while (name.length() < 10) {
            int index = (int) (random.nextFloat() * saltChars.length());
            name.append(saltChars.charAt(index));
        }
        String saltStr = (name.toString());
        return saltStr;
    }
}
