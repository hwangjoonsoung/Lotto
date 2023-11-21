package org.example;

import java.util.*;

public class LottoMachine {
    HashMap pickedNumbers ;

    public List machineSet() {
        List bools = new ArrayList();

        for (int i = 1; i <= 45; i++) {
            bools.add(i);
        }
        return bools;
    }

    public void machinePullOutBalls() {
        HashMap pickedNumbers = new HashMap<Integer, Integer>();
        int count = 1;
        while (pickedNumbers.size() <= 6) {

            int randomNum = (int) (Math.random() * 44 + 1);
            pickedNumbers.put(count,machineSet().get(randomNum));
            count++;
        }

        this.pickedNumbers = pickedNumbers;

    }
}
