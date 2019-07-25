package com.stackroute.pe3;

import java.util.Arrays;

public class FilterVowels {

    public String[] removeWovels(String[] placesArray){

       String finalString= "";
        String[] finalStringArray= null;
       String places= Arrays.toString(placesArray);
       places= places.substring(1,places.length()-1).replace(",", "");
       places=places.replaceAll("[aeiou]", "");
        String[] withoutVowels=places.split(" ");
        for(int i=0;i<withoutVowels.length;i++)
        {
            finalString =finalString +withoutVowels[i];
            finalStringArray = finalString.split(" ");

        }
        return finalStringArray;
    }



}
