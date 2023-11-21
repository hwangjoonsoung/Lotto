package org.example;

import org.example.custormexception.LessSelectNumber;
import org.example.custormexception.TooMuchSelectNumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class PlayerLotto {

    Set playerSelectNumberSet;

    public static void main(String[] args) {
        try {
            throw new LessSelectNumber();
        } catch (LessSelectNumber e) {
            throw new RuntimeException(e);
        }
    }

    public void selectNumber(int[] numberArr) throws Exception {
        if(numberArr.length>6){
            throw new TooMuchSelectNumber();
        }
        if(numberArr.length<6){
            throw new LessSelectNumber();
        }

        Set playerNumber = new HashSet();
        IntStream stream = Arrays.stream(numberArr);
        stream.forEach(value -> {
            playerNumber.add(value);
        });

        this.playerSelectNumberSet = playerNumber;
    }
}
