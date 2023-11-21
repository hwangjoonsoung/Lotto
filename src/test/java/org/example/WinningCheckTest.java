package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class WinningCheckTest {
    WinningCheck winningCheck = new WinningCheck();
    LottoMachine lottoMachine = new LottoMachine();
    PlayerLotto playerLotto = new PlayerLotto();
    int correctCount = 0;
    boolean correctBonus= false;

    @Test
    void winningCheckTest() throws Exception {
        //given
        lottoMachine.machineSet();
        lottoMachine.machinePullOutBalls();
        HashMap pickedNumber = lottoMachine.pickedNumbers;
        int bonusNumber = (int) pickedNumber.get(pickedNumber.size());
        int[] playerSelectedNumbers = {1, 2, 3, 4, 5, 6};
        playerLotto.selectNumber(playerSelectedNumbers);
        Set playerSelectNumberSet = playerLotto.playerSelectNumberSet;

        //when
        pickedNumber.forEach((o, o2) ->{
            if(!o.equals(7) && playerSelectNumberSet.contains(o2)){
                correctCount++;
            } else if (o.equals(7) && playerSelectNumberSet.contains(o2)) {
                correctBonus = true;
            }

        });

        //then
        winningCheck.getResult(correctCount , correctBonus);


    }


}