package com.bosch.exer.impl;

import com.bosch.exer.dto.Reversedto;
import com.bosch.exer.services.ReverseService;

public class DefaultReversePlain implements ReverseService {
    @Override
    public Reversedto reverse (String word){

        String reverseWord = "";
        
        for(int i = word.length()-1; i >= 0 ; i--){ 
            reverseWord = reverseWord + word.charAt(i);
        }
        if(word.equals(reverseWord))
            return new Reversedto(reverseWord, true);

        return new Reversedto(reverseWord, false);
    }
}
